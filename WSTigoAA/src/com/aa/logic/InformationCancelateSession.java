package com.aa.logic;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.cache.CacheUsers;

public class InformationCancelateSession  implements Services{

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		System.out.println(jsonRequest);
		try {
			JSONObject json=new JSONObject(jsonRequest);
			JSONObject jsonr=json.getJSONObject("cancelateSession");
			if(CacheUsers.getInstance().isValidToken(jsonr.getString("token"))){
			businessLocal.updateLogLogin(Integer.parseInt(jsonr.getString("uid")), new Date(), "OFF:Login Pagina Web ", false);
		    CacheUsers.getInstance().unRegisterToken(jsonr.getString("token"));
			}
		} catch (JSONException e) {
			e.printStackTrace();
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
