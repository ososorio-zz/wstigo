package com.aa.business.ejb;

import java.util.Calendar;
import java.util.Date;
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

import co.com.colombiamovil.comprasterceros.service.ConsultaProveedoresResponseDTO;

import com.aa.business.ejb.interfaces.ComprasTercerosConsultasLocal;
import com.aa.dao.entity.LogsOperation;

/**
 * Session Bean implementation class ComprasTercerosConsultas
 */
@WebService
@Stateless
public class ComprasTercerosConsultas implements ComprasTercerosConsultasLocal {

	@PersistenceContext(unitName="WStigoAAPersistenceUnit")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ComprasTercerosConsultas() {
        // TODO Auto-generated constructor stub
    }

    @SuppressWarnings({ "deprecation", "unchecked" })
	@WebMethod
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ConsultaProveedoresResponseDTO[] consultaProveedores(int codigoProveedor, String fechaInicial, String fechaFinal) 
	{
    	ConsultaProveedoresResponseDTO[] response = null;
    	try 
    	{
    		Query query = em.createNamedQuery(LogsOperation.queryProveedores);
    		query.setParameter("initDate", new Date(fechaInicial));
    		query.setParameter("lastDate", new Date(fechaFinal));
    		List<LogsOperation> listaResultado = (List<LogsOperation>)query.getResultList();
    		if(listaResultado != null)
    		{
    			response = new ConsultaProveedoresResponseDTO[listaResultado.size()];
    			for(int i=0;i<listaResultado.size();i++)
        		{
    				ConsultaProveedoresResponseDTO resp = new ConsultaProveedoresResponseDTO();
    				resp.setIdTransaccion(listaResultado.get(i).getLoId());
    				resp.setNombreProveedor("American Assist");
    				resp.setMovil(listaResultado.get(i).getLoMsisdn().toString());
    				resp.setServicio(String.valueOf(listaResultado.get(i).getLoNextPacket()));
    				Calendar cal = new GregorianCalendar();
    				cal.setTime(listaResultado.get(i).getLoDate());
    				resp.setFecha(cal);
    				resp.setAccion(listaResultado.get(i).getLoOperation());
        			response[i] = resp;
        		}
    		}
		}
		catch (NoResultException e) 
		{
			System.out.println("No result exec");
			return null;
		}
		return response;
	}

}
