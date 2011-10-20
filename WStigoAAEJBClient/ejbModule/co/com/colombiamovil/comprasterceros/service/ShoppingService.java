/**
 * ShoppingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public interface ShoppingService extends java.rmi.Remote {
    public co.com.colombiamovil.comprasterceros.service.Service[] availableServices(java.lang.String msisdn, java.lang.Integer categoryId) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;
    public co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO processService(co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO request) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;
    public co.com.colombiamovil.comprasterceros.service.Service[] purchasedServices(java.lang.String msisdn) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException;
}
