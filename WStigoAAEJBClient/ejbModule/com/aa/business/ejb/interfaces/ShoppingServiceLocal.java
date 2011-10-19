package com.aa.business.ejb.interfaces;
import javax.ejb.Local;

import com.aa.business.dto.ShoppingRequestDTO;

import co.com.colombiamovil.comprasterceros.service.Service;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;

@Local
public interface ShoppingServiceLocal 
{
	public Service[] avaliableServices(String msidn, Integer categoryId);
	
	public Service[] purchasedServices(String msidn);
	
	public ShoppingResponseDTO processService (ShoppingRequestDTO solicitud) throws ShoppingServiceException;
}
