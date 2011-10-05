package com.aa.logic;

import java.io.IOException;
import java.io.Writer;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationCancelateService  implements Services{

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		try{
			JSONObject jsonobj=new JSONObject(jsonRequest);
			JSONObject activateService=jsonobj.getJSONObject("cancelateService");
			Long msisdn=activateService.getLong("msisdn");
			String operation=activateService.getString("operation");
			String reason=activateService.getString("reason");
			String packagea=activateService.getString("package");
			String confirmation=businessLocal.cancelatePackage(msisdn,operation,reason,packagea);
			JSONObject responsej=new JSONObject();
			responsej.append("result", confirmation);
			StringBuffer rta=new StringBuffer("{\"responseinfo\":");
			rta.append(responsej.toString());
			rta.append("}");
			response(writer,rta.toString());
		}catch (JSONException e) {
			System.out.println("error cancelate service");
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
