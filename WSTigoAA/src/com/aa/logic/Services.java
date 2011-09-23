package com.aa.logic;

import java.io.Writer;

import com.aa.business.ejb.interfaces.BusinessLocal;

public interface Services {
		
	public void invoke(String jsonRequest,Writer writer, BusinessLocal businessLocal);
	public void response(Writer writer, String response);
}
