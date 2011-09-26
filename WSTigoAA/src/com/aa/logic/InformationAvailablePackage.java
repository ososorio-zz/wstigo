package com.aa.logic;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.aa.business.dto.PackageDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationAvailablePackage implements Services{

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		try{
			System.out.println(jsonRequest);
			JSONObject jsonobj=new JSONObject(jsonRequest);
			JSONObject informationNumberPhone=jsonobj.getJSONObject("informationAvailablePackage");
			String code=(String) informationNumberPhone.get("code");
			if(code.equals("") || code==null)
			{
				response(writer,"{\"responseinfo\":{ \"error\":\"Datos invalidos Dato:paquete no disponibles\" }}");
				return;
			}
			
			
			List<PackageDTO> resultlist= businessLocal.getAvailablePackage(code);			
			JSONArray sumarryp=new JSONArray();
			for(PackageDTO info:resultlist)
			{
				JSONObject tmpobject=new JSONObject();
				tmpobject.put("pc_id", info.getPc_id());
				tmpobject.put("description", info.getDescription());
				sumarryp.put(tmpobject);
			}

			
			StringBuffer rta=new StringBuffer("{\"responseinfo\":");
			rta.append(sumarryp.toString());
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
