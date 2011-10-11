package com.aa.logic;

import java.io.IOException;
import java.io.Writer;


import org.codehaus.jettison.json.JSONObject;


import com.aa.business.dto.InformationDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationMSISDN implements Services {



	@Override
	public void invoke(String jsonRequest, Writer writer, BusinessLocal businessLocal) {
					
		try{
			JSONObject jsonobj=new JSONObject(jsonRequest);
			JSONObject informationNumberPhone=jsonobj.getJSONObject("informationNumberPhone");
			String number=(String) informationNumberPhone.get("msisdn");
			if(number.equals("") || number==null)
			{
				response(writer,"{\"responseinfo\":{ \"error\":\"Datos invalidos Dato:numero Celular\" }}");
				return;
			}		
			InformationDTO dto=businessLocal.consultaMSISDN(Long.parseLong(number));
			JSONObject responsej=new JSONObject();
			responsej.append("phone", dto.getTelefono() );
			responsej.append("tipodocumento", dto.getTypodoc());
			responsej.append("numerodoc", dto.getNumerodoc());
			responsej.append("plan", dto.getPlan());
			responsej.append("nombrecliente", dto.getNombreusuario());
			responsej.append("estadopaquete", dto.getEstadopaquete());
			responsej.append("nombrepaquete", dto.getNombrepaquete());
			responsej.append("idpaquete", dto.getCodigopaquete());

			
		
			//TODO:nombre paquete
			
			StringBuffer rta=new StringBuffer("{\"responseinfo\":");
			rta.append(responsej.toString());
			rta.append("}");
			
			//TODO:test Error
			//businessLocal.error("300101010", "test", "ERRO:500");
			//businessLocal.operation("300101010", "activacion", "pagina web", "0", "1");
			
			response(writer,rta.toString());
			
		}catch (Exception e) {
			String message=e.getMessage();			
			if(message.contains("null"))
				message="Numero No encontrado por favor digite de nuevo el numero";
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
