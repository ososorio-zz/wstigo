package com.aa.business.ejb;

import java.util.Calendar;
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
	public Service[] avaliableServices(@WebParam(name="msidn")String msidn, @WebParam(name="categoryId")Integer categoryId) 
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
	public ShoppingResponseDTO processService(@WebParam(name="solicitud")ShoppingRequestDTO solicitud) throws ShoppingServiceException 
    {
    	ShoppingResponseDTO response = null;    	
    	try 
    	{
    		int lastPackage;
    		String result = null;
    		Information_w info = em.find(Information_w.class, Long.parseLong(solicitud.getMobileNumber()));
			if(info != null)
			{
				lastPackage = info.getInPackageActual();
	    		if(solicitud.getAction().equals("ACQUIRE"))
				{
					result = businessLocal.activatePackage(Long.parseLong(solicitud.getMobileNumber()), "ACQUIRE", solicitud.getReason(), String.valueOf(solicitud.getPurchasedProductId()), String.valueOf(lastPackage),solicitud.getUserSeller());
				}
	    		else
	    		{
	    			result = businessLocal.cancelatePackage(Long.parseLong(solicitud.getMobileNumber()), "ACQUIRE", solicitud.getReason(), String.valueOf(solicitud.getPurchasedProductId()),solicitud.getUserSeller());
	    		}
	    		
	    		if (result != null)
				{
	    			response = new ShoppingResponseDTO();
					response.setAnswer("El producto "+solicitud.getPurchasedProductId()+" fue actualizado con éxito");
					response.setUserMessage("Proceso relizado con éxito");
					response.setTxCode(result);
				}
				else
				{
					throw new ShoppingServiceException();
				}
			}
    		
//    		Information_w respuesta = new Information_w();
//    		Information_w info = em.find(Information_w.class, Long.parseLong(solicitud.getMobileNumber()));
//			if(info != null)
//			{
//				lastPackage = info.getInPackageActual();
//				String operation = null;
//				if(solicitud.getAction().equals("ACQUIRE"))
//				{
//					String result = businessLocal.activatePackage(Long.parseLong(solicitud.getMobileNumber()), "ACQUIRE", solicitud.getReason(), String.valueOf(solicitud.getPurchasedProductId()), String.valueOf(lastPackage),solicitud.getUserSeller());
//					if (result != null)
//					{
//						info.setInPackageActual(solicitud.getPurchasedProductId());
//						operation = "Activación";
//						info.setInPackageActive("1");
//						info.setInEstPro("Activo");
//						respuesta = em.merge(info);
//					}
//					else
//					{
//						
//					}
//				}
//				else if(lastPackage == solicitud.getPurchasedProductId())
//				{
//					operation = "Cancelación";
//					info.setInEstPro("Inactivo");
//					info.setInPackageActive("0");
//					info.setInPackageActual(solicitud.getPurchasedProductId());
//					respuesta = em.merge(info);
//				}
//				else
//				{
//					
//				}
//				
//				if(respuesta!=null)
//				{
//					LogsOperation lgo=new LogsOperation();
//					lgo.setLoDate(new Date());
//					lgo.setLoMsisdn(solicitud.getPurchasedProductId().longValue());
//					lgo.setLoOperation(operation);
//					lgo.setLoNextPacket(solicitud.getPurchasedProductId());
//					lgo.setLoPreviousPacket(lastPackage);
//
//					em.persist(lgo);
//					
//					response = new ShoppingResponseDTO();
//					response.setAnswer("El producto "+respuesta.getInPackageActual()+"fue actualizado con éxito");
//					response.setUserMessage("Proceso relizado con éxito");
//					response.setTxCode(String.valueOf(lgo.getLoId()));
//				}
//			}
    	}
		catch (NoResultException e) 
		{
			System.out.println("No result exec");
			return null;
		}
		return response;
	}
}
