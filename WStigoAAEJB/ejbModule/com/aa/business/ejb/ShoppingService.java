package com.aa.business.ejb;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.rpc.ServiceException;

import co.com.colombiamovil.comprasterceros.service.Category;
import co.com.colombiamovil.comprasterceros.service.PostsaleAction;
import co.com.colombiamovil.comprasterceros.service.Service;
import co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceServiceLocator;

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
	
	/**
     * Default constructor. 
     */
    public ShoppingService() {
        // TODO Auto-generated constructor stub
    }

    @SuppressWarnings("unchecked")
	@WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Service[] avaliableServices(String msidn, Integer categoryId) 
	{
		Service[] result = null;
		categoryId = 4; 
		try
		{
			Query query = em.createNamedQuery(Information_w.queryAvailableService);
			query.setParameter("msisdn", Long.parseLong(msidn));
			Integer valor = (Integer)query.getSingleResult();
			Query q = em.createNamedQuery(Package.queryInfoAvailable);
			query.setParameter("idPackage", valor);
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
	public Service[] purchasedServices(String msidn)
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
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ShoppingResponseDTO processService(ShoppingRequestDTO solicitud) 
    {
    	ShoppingServiceServiceLocator locator = new ShoppingServiceServiceLocator();
    	co.com.colombiamovil.comprasterceros.service.ShoppingService service;
    	ShoppingResponseDTO response = null;    	
    	try 
    	{
			service = locator.getShoppingServicePort();
			response = service.processService(solicitud);
		}
    	catch (ServiceException e) 
    	{
			e.printStackTrace();
		}
    	catch (RemoteException e) 
		{
			e.printStackTrace();
		}
    	catch (ShoppingServiceException e) 
		{
			e.printStackTrace();
		}
		return response;
	}
}
