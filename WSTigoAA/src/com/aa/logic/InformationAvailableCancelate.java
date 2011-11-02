package com.aa.logic;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.aa.business.dto.CancelateDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class InformationAvailableCancelate  implements Services{

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		
		try{
		JSONObject jsonobj=new JSONObject(jsonRequest);
		String uid=jsonobj.getString("uid");
		JSONObject informationAvailableCancelate=jsonobj.getJSONObject("informationAvailableCancelate");
		String packagea=informationAvailableCancelate.getString("code");
		
		List<CancelateDTO> resultlist= businessLocal.availableCancelateReasons(uid, packagea);

		JSONArray sumarryp=new JSONArray();
		for(CancelateDTO info:resultlist)
		{
			JSONObject tmpobject=new JSONObject();
			tmpobject.put("id", info.getId());
			tmpobject.put("description", info.getReason());
			sumarryp.put(tmpobject);
		}
		
		StringBuffer rta=new StringBuffer("{\"responseinfo\":");
		rta.append(sumarryp.toString());
		rta.append("}");
		response(writer,rta.toString());
		
		
		}catch (Exception e) {
			System.out.println("error available cancelate service");
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
