package com.aa.business.ejb;

import java.rmi.RemoteException;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import co.com.colombiamovil.comprasterceros.service.Service;
import co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceServiceLocator;

import com.aa.business.ejb.interfaces.ShoppingServiceLocal;

/**
 * Session Bean implementation class ShoppingService
 */
@WebService
@Stateless
public class ShoppingService implements ShoppingServiceLocal {

    /**
     * Default constructor. 
     */
    public ShoppingService() {
        // TODO Auto-generated constructor stub
    }

    @WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Service[] avaliableServices(String msidn, Integer categoryId) 
	{
		ShoppingServiceServiceLocator locator = new ShoppingServiceServiceLocator();
		co.com.colombiamovil.comprasterceros.service.ShoppingService service;
		Service[] result = null;
		try 
		{
			service = locator.getShoppingServicePort();
			result = service.availableServices(msidn, categoryId);
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
		return result;
	}

    @WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Service[] purchasedServices(String msidn)
    {
    	ShoppingServiceServiceLocator locator = new ShoppingServiceServiceLocator();
    	co.com.colombiamovil.comprasterceros.service.ShoppingService service;
    	Service[] result = null;
    	try 
    	{
    		service = locator.getShoppingServicePort();
			result = service.purchasedServices(msidn);
		}
    	catch (RemoteException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	catch (ShoppingServiceException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
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
