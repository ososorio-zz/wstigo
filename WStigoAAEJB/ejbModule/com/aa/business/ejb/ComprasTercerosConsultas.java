package com.aa.business.ejb;

import java.rmi.RemoteException;

import co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS;
import co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSServiceLocator;
import co.com.colombiamovil.comprasterceros.service.ConsultaProveedoresResponseDTO;

import com.aa.business.ejb.interfaces.ComprasTercerosConsultasLocal;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import org.jboss.wsf.spi.annotation.WebContext;

/**
 * Session Bean implementation class ComprasTercerosConsultas
 */
@WebService
@Stateless
@WebContext(contextRoot="/ComprasTercerosConsultas")
public class ComprasTercerosConsultas implements ComprasTercerosConsultasLocal {

    /**
     * Default constructor. 
     */
    public ComprasTercerosConsultas() {
        // TODO Auto-generated constructor stub
    }

    @WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ConsultaProveedoresResponseDTO[] consultaProveedores(int codigoProveedor, String fechaInicial, String fechaFinal) 
	{
    	ComprasTercerosConsultasWSServiceLocator locator = new ComprasTercerosConsultasWSServiceLocator();
    	ComprasTercerosConsultasWS service;
    	ConsultaProveedoresResponseDTO[] response = null;
    	try 
    	{
			service = locator.getComprasTercerosConsultasWSPort();
			response = service.consultaProveedores(codigoProveedor, fechaInicial, fechaFinal);
		}
    	catch (ServiceException e) 
    	{
			e.printStackTrace();
		}
    	catch (RemoteException e) 
    	{
			e.printStackTrace();
		}
		return response;
	}

}
