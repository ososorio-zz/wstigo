package com.aa.logic;

import java.io.OutputStreamWriter;

import javax.servlet.http.HttpServletResponse;

public class LogicServices {

	private String json;
	private OutputStreamWriter response;
	
	public LogicServices(String json, OutputStreamWriter writer) {
		setJson(json);
		setResponse(writer);
	}

	public void transaction() {
		Services ser=null;
		if(getJson().indexOf("informationNumberPhone")!=-1)
		{
			ser =new InformationMSISDN();
		}
			
		ser.invoke(getJson(), getResponse());
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

}
