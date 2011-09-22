package com.aa.logic;

import java.io.Writer;

public interface Services {
		
	public void invoke(String jsonRequest,Writer writer);
	public void response(Writer writer, String response);
}
