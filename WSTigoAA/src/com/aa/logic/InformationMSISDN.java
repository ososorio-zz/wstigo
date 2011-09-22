package com.aa.logic;

import java.io.Writer;
import java.util.List;

import javax.ejb.EJB;

import com.aa.business.dto.InformationDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationMSISDN implements Services {
	
	@EJB
	BusinessLocal businessLocal;
	
	@Override
	public void invoke(String jsonRequest, Writer writer) {
		
		try{
		List<InformationDTO> listaInfo = businessLocal.consultarInfo(1);
		for(InformationDTO info:listaInfo)
		{
			System.out.println("Info");
			System.out.println("Estado "+info.getEstado());
			System.out.println("Nombre "+info.getNombreId());
			System.out.println("Numero Id "+info.getNumeroId());
			System.out.println("Tipo Id "+info.getTipoId());
		}
		}catch (Exception e) {
			System.out.println("error1");
			e.printStackTrace();
		}
		
	}

	@Override
	public void response(Writer writer, String response) {
		// TODO Auto-generated method stub
		
	}

}
