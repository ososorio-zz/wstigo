package com.aa.logic;

import java.io.Writer;

import org.codehaus.jettison.json.JSONObject;


import com.aa.business.dto.InformationDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationMSISDN implements Services {



	@Override
	public void invoke(String jsonRequest, Writer writer, BusinessLocal businessLocal) {
		
			System.out.println(jsonRequest);
			
		try{
			JSONObject jsonobj=new JSONObject(jsonRequest);
			JSONObject informationNumberPhone=jsonobj.getJSONObject("informationNumberPhone");
			String number=(String) informationNumberPhone.get("msisdn");
			if(number.equals("") || number==null)
			{
				response(writer,"{error}");
				return;
			}
			/*List<InformationDTO> listaInfo = businessLocal.consultarInfo(Long.parseLong(number));
			for(InformationDTO info:listaInfo)
			{
				System.out.println("Info");
				System.out.println("Estado "+info.getEstado());
				System.out.println("Nombre "+info.getNombreId());
				System.out.println("Numero Id "+info.getNumeroId());
				System.out.println("Tipo Id "+info.getTipoId());
			}*/
			
			InformationDTO dto=businessLocal.consultaMSISDN(Long.parseLong(number));
			System.out.println("yes"+dto.getNombreId());
		}catch (Exception e) {
			System.out.println("error1");
			e.printStackTrace();
			response(writer,"{error}");
		}

	}

	@Override
	public void response(Writer writer, String response) {
		// TODO Auto-generated method stub

	}

}
