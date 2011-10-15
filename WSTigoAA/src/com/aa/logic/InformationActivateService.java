package com.aa.logic;

import java.io.IOException;
import java.io.Writer;

import org.codehaus.jettison.json.JSONObject;

import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationActivateService implements Services{

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		try {
			JSONObject jsonobj=new JSONObject(jsonRequest);
			String uid=jsonobj.getString("uid");
			JSONObject activateService=jsonobj.getJSONObject("activateService");
			String msisdn=activateService.getString("msisdn");
			String operation=activateService.getString("operation");
			String reason=activateService.getString("reason");
			String packagea=activateService.getString("package");
			String packageold=activateService.getString("packageold");

			String confirmation=businessLocal.activatePackage(Long.parseLong(msisdn),operation,reason,packagea,packageold,uid);
			//TODO: VALIDACION
			
			JSONObject responsej=new JSONObject();
			responsej.append("result", confirmation);
			StringBuffer rta=new StringBuffer("{\"responseinfo\":");
			rta.append(responsej.toString());
			rta.append("}");
			response(writer,rta.toString());
		} catch (Exception e) {
			System.out.println("error activate service");
			e.printStackTrace();
			response(writer,"{\"responseinfo\":{ \"error\":\""+"No Fue posible activar el paquete"+"\" \"value\":\""+e.getMessage()+"\"}}");
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
