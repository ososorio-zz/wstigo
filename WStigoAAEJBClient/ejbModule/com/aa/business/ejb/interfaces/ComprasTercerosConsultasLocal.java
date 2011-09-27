package com.aa.business.ejb.interfaces;
import javax.ejb.Local;

import co.com.colombiamovil.comprasterceros.service.ConsultaProveedoresResponseDTO;

@Local
public interface ComprasTercerosConsultasLocal 
{
	public ConsultaProveedoresResponseDTO[] consultaProveedores(int codigoProveedor,String fechaInicial, String fechaFinal);
}
