package com.aa.business.ejb.interfaces;
import javax.ejb.Local;

import co.com.colombiamovil.comprasterceros.service.Service;
import co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;

@Local
public interface ShoppingServiceLocal 
{
	public Service[] avaliableServices(String msidn, Integer categoryId);
	
	public Service[] purchasedServices(String msidn);
	
	public ShoppingResponseDTO processService (ShoppingRequestDTO solicitud);
}
