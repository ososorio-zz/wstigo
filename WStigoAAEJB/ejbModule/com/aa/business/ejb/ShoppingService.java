package com.aa.business.ejb;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.com.colombiamovil.comprasterceros.service.Category;
import co.com.colombiamovil.comprasterceros.service.PostsaleAction;
import co.com.colombiamovil.comprasterceros.service.Service;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;

import com.aa.business.dto.ShoppingRequestDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.business.ejb.interfaces.ShoppingServiceLocal;
import com.aa.dao.entity.Information_w;
import com.aa.dao.entity.LogsOperation;
import com.aa.dao.entity.Package;

/**
 * Session Bean implementation class ShoppingService
 */
@WebService
@Stateless
public class ShoppingService implements ShoppingServiceLocal {

	@PersistenceContext(unitName="WStigoAAPersistenceUnit")
	private EntityManager em;
	
	@EJB
	BusinessLocal businessLocal;
	
	/**
     * Default constructor. 
     */
    public ShoppingService() {
        // TODO Auto-generated constructor stub
    }

    @SuppressWarnings("unchecked")
	@WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Service[] availableServices(@WebParam(name="msidn")String msidn, @WebParam(name="categoryId")Integer categoryId) 
	{
		Service[] result = null;
		categoryId = 4; 
		try
		{
			Query query = em.createNamedQuery(Information_w.queryAvailableService);
			query.setParameter("msisdn", Long.parseLong(msidn));
			Integer valor = (Integer)query.getSingleResult();
			Query q = em.createNamedQuery(Package.queryInfoAvailable);
			q.setParameter("idPackage", valor);
			List<Package> listaPaquete = (List<Package>)q.getResultList();
			if(!listaPaquete.isEmpty())
			{
				result = new Service[listaPaquete.size()];
				int i = 0;
				for(Package pack:listaPaquete)
				{
					Service service = new Service();	
					service.setProductName(pack.getDescription());
					service.setProductPoid(String.valueOf(pack.getPcId()));
					result[i] = service;
					i++;
				}
			}
		}
		catch (NoResultException e) 
		{
			System.out.println("No result exec");
			return null;
		}	
		return result;
	}

    @SuppressWarnings("unchecked")
	@WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Service[] purchasedServices(@WebParam(name="msidn")String msidn)
    {
    	Service[] result = null;
		try
		{
			Query query = em.createNamedQuery(LogsOperation.queryPurchasedService);
			query.setParameter("msisdn", Long.parseLong(msidn));
			List<LogsOperation> listaLogOp = (List<LogsOperation>)query.getResultList();
			result = new Service[listaLogOp.size()];
			int i = 0;
			for(LogsOperation logOp:listaLogOp)
			{
				Service service = new Service();
				Category category = new Category();
				PostsaleAction postSale = new PostsaleAction();
				postSale.setActionName(logOp.getLoOperation());
				category.setActivateProcess(postSale);
				service.setCategory(category);
				Calendar cal = new GregorianCalendar();
				cal.setTime(logOp.getLoDate());				
				service.setCreationDate(cal);
				//Previous packet
				service.setProductPoid(String.valueOf(logOp.getLoPreviousPacket()));
				//Next packet
				service.setDealerPoid(String.valueOf(logOp.getLoNextPacket()));
				result[i] = service;
				i++;
			}
		}
		catch (NoResultException e) 
		{
			System.out.println("No result exec");
			return null;
		}	
		return result;
	}

    @WebMethod
	public ShoppingResponseDTO processService(@WebParam(name="request")ShoppingRequestDTO request)  throws ShoppingServiceException
    {
    	ShoppingResponseDTO response = null;   
    	String user = null;
    	try 
    	{
    		int lastPackage;
    		String result = null;
    		String operation = null;
    		StringBuilder answer = new StringBuilder();
    		StringBuilder userMessage = new StringBuilder();
    		Package pack = em.find(Package.class, request.getPurchasedProductId());
    		if(pack!=null)
    		{
    			Information_w info = em.find(Information_w.class, Long.parseLong(request.getMobileNumber()));
    			if(info != null)
    			{
    				user = "0";
    				lastPackage = info.getInPackageActual();
    				int packageToProcess = request.getPurchasedProductId();
    	    		if(request.getAction().equals(ShoppingRequestDTO.ProcessActionEnum.ACQUIRE))
    				{
    	    			operation = "ACQUIRE";    	    			
    					result = businessLocal.activatePackageIntern(Long.parseLong(request.getMobileNumber()), "ACQUIRE", request.getReason(), String.valueOf(request.getPurchasedProductId()),String.valueOf(lastPackage), user);
    					userMessage.append("Proceso de activación de paquete "+request.getPurchasedProductId()+" realizado de manera exitosa para el msisdn "+request.getMobileNumber());
    					answer.append("Proceso: "+operation+", Paquete: "+request.getPurchasedProductId()+", Msisdn:"+request.getMobileNumber());
    				}
    	    		else if(request.getAction().equals(ShoppingRequestDTO.ProcessActionEnum.CANCEL))
    	    		{
    	    			if(info.getInPackageActual() != packageToProcess)
    	    			{
    	    				int txCode = businessLocal.error(request.getMobileNumber(), "El producto a cancelar no ha sido adquirido.", "77");
    	    				result = String.valueOf(txCode);
        	    			userMessage.append("El producto a cancelar no ha sido adquirido");
        	    			answer.append(userMessage.toString());
    	    			}
    	    			else
    	    			{
    	    				operation = "CANCEL";
        	    			result = businessLocal.cancelatePackageIntern(Long.parseLong(request.getMobileNumber()), "CANCEL", request.getReason(), String.valueOf(request.getPurchasedProductId()),user);
        	    			userMessage.append("Proceso de cancelación de paquete "+request.getPurchasedProductId()+" realizado de manera exitosa para el msisdn "+request.getMobileNumber());
        	    			answer.append("Proceso: "+operation+", Paquete: "+request.getPurchasedProductId()+", Msisdn:"+request.getMobileNumber());
    	    			}
    	    		}
    			}
    			else
    			{
    				info = new Information_w();
    				info.setInMsisdn(Long.parseLong(request.getMobileNumber()));
    				info.setInIdentificationNumber(request.getUserSeller());
    				info.setInCiclo(15);
    				
    				int nextPacket = 0;
    				if(request.getAction().equals(ShoppingRequestDTO.ProcessActionEnum.ACQUIRE))
    				{
    					info.setInPackageActive("1");
    					info.setInPackageActual(request.getPurchasedProductId());
    					info.setInFecCreaCta(new Date());
    					operation = "ACQUIRE";
    					nextPacket = request.getPurchasedProductId();
    					em.persist(info);
    					userMessage.append("Proceso de activación de paquete "+request.getPurchasedProductId()+" realizado de manera exitosa para el msisdn "+request.getMobileNumber());
    	    			answer.append("Proceso: "+operation+", Paquete: "+request.getPurchasedProductId()+", Msisdn:"+request.getMobileNumber());
    				}
    	    		else if(request.getAction().equals(ShoppingRequestDTO.ProcessActionEnum.CANCEL))
    	    		{
    	    			info.setInPackageActive("0");
    					info.setInPackageActual(request.getPurchasedProductId());
    					info.setInFecCreaCta(new Date());
    					operation = "CANCEL";
    					em.persist(info);
    					userMessage.append("Proceso de cancelación de paquete "+request.getPurchasedProductId()+" realizado de manera exitosa para el msisdn "+request.getMobileNumber());
    	    			answer.append("Proceso: "+operation+", Paquete: "+request.getPurchasedProductId()+", Msisdn:"+request.getMobileNumber());
    	    		}
    				
    				LogsOperation lgo=new LogsOperation();
    				lgo.setLoDate(new Date());
    				lgo.setLoMsisdn(Long.parseLong(request.getMobileNumber()));
    				lgo.setLoOperationDetail(request.getReason());
    				lgo.setLousr(0);
    				lgo.setLoOperation(operation);
    				lgo.setLoNextPacket(nextPacket);
    				lgo.setLoPreviousPacket(0);
    				em.persist(lgo);
    				result = String.valueOf(lgo.getLoId());
    			}
    			
        		if (result != null)
    			{
        			response = new ShoppingResponseDTO();
    				response.setAnswer(answer.toString());
    				response.setUserMessage(userMessage.toString());
    				response.setTxCode(result);
    			}
    		}
    		else
    		{
    			int txCode = businessLocal.error(request.getMobileNumber(), "No se encuentra el id de la categoria.", "87");
    			response = new ShoppingResponseDTO();
				response.setAnswer("No se encuentra el id de la categoria.");
				response.setUserMessage("No se encuentra el id de la categoria.");
				response.setTxCode(String.valueOf(txCode));
    		}
    		
    	}
		catch (Exception e) 
		{
			int txCode = businessLocal.error(request.getMobileNumber(), "Error de validacion datos de entrada.", "87");
			response = new ShoppingResponseDTO();
			response.setAnswer("Error de validacion datos de entrada.");
			response.setUserMessage("Error de validacion datos de entrada.");
			response.setTxCode(String.valueOf(txCode));
		}
		return response;
	}
}
