package com.aa.logic;

import java.io.OutputStreamWriter;

import com.aa.business.ejb.interfaces.BusinessLocal;

public class LogicAdmin {

	private String json;
	private OutputStreamWriter response;
	private BusinessLocal businessLocal;
	public LogicAdmin(String json, OutputStreamWriter writer, BusinessLocal businessLocaltmp) {
		setJson(json);
		setResponse(writer);
		setBusinessLocal(businessLocaltmp);
	}

	public void transaction() {
		Services ser=null;

		if(getJson().indexOf("informationListUsers")!=-1)
		{
			ser=new informationListUsers();
		}
		
		ser.invoke(getJson(), getResponse(),getBusinessLocal());
		
	}

	
	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public OutputStreamWriter getResponse() {
		return response;
	}

	public void setResponse(OutputStreamWriter response) {
		this.response = response;
	}

	public BusinessLocal getBusinessLocal() {
		return businessLocal;
	}

	public void setBusinessLocal(BusinessLocal businessLocal) {
		this.businessLocal = businessLocal;
	}
	
	
}
