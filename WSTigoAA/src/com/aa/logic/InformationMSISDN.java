package com.aa.logic;

import java.io.IOException;
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
				response(writer,"{\"responseinfo\":{ \"error\":\"Datos invalidos Dato:numero Celular\" }}");
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
			JSONObject responsej=new JSONObject();
			responsej.append("phone", dto.getTelefono() );
			responsej.append("tipodocumento", dto.getTypodoc());
			responsej.append("numerodoc", dto.getNumerodoc());
			responsej.append("plan", dto.getPlan());
			responsej.append("nombrecliente", dto.getNombreusuario());
			
			StringBuffer rta=new StringBuffer("{\"responseinfo\":");
			rta.append(responsej.toString());
			rta.append("}");
			response(writer,rta.toString());
			
		}catch (Exception e) {
			System.out.println("error1");
			e.printStackTrace();
			response(writer,"{\"responseinfo\":{ \"error\":\""+e.getMessage()+"\" }}");
		}

	}

	@Override
	public void response(Writer writer, String response) {
		try {
			writer.write(response);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
