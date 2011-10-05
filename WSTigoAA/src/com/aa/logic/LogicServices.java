package com.aa.logic;

import java.io.OutputStreamWriter;


import com.aa.business.ejb.interfaces.BusinessLocal;

public class LogicServices {

	private String json;
	private OutputStreamWriter response;
	private BusinessLocal businessLocal;
	public LogicServices(String json, OutputStreamWriter writer, BusinessLocal businessLocaltmp) {
		setJson(json);
		setResponse(writer);
		setBusinessLocal(businessLocaltmp);
	}

	public void transaction() {
		Services ser=null;
		if(getJson().indexOf("informationNumberPhone")!=-1)
		{
			ser =new InformationMSISDN();
		}
		if(getJson().indexOf("informationAvailablePackage")!=-1)
		{
			ser =new InformationAvailablePackage();
		}
		if(getJson().indexOf("activateService")!=-1)
		{
			ser =new InformationActivateService();
		}
		if(getJson().indexOf("cancelateService")!=-1)
		{
			ser =new InformationCancelateService();
		}
		if(getJson().indexOf("cancelateSession")!=-1)
		{
			ser =new InformationCancelateSession();
		}
		
		ser.invoke(getJson(), getResponse(),getBusinessLocal());
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getJson() {
		return json;
	}

	public void setResponse(OutputStreamWriter response) {
		this.response = response;
	}

	public OutputStreamWriter getResponse() {
		return response;
	}

	public void setBusinessLocal(BusinessLocal businessLocal) {
		this.businessLocal = businessLocal;
	}

	public BusinessLocal getBusinessLocal() {
		return businessLocal;
	}

}
