package com.aa.login;

import java.util.UUID;

import com.aa.cache.CacheUsers;

public class Login {

	private String us;
	private String ps;
	public Login(String user, String pss){
		setUs(user);
		setPs(pss);
		
	}
	public void setUs(String us) {
		this.us = us;
	}
	public String getUs() {
		return us;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getPs() {
		return ps;
	}
	
	public String isValidUser()
	{
		
		//TODO CONSULTA A WEB
	   //TODO registro log de login
		//Generacion Codigo 
		
		if(getUs().equals("oscar")){
			String tokens=UUID.randomUUID().toString();
			CacheUsers.getInstance().registerToken(tokens);
			return  "{\"login\":\"202\",\"value\":\""+tokens+"\"}";
		}
		String error="{\"login\":\"0\",\"value\":\"Usuario no valido:verifique su usuario y password\"}";
        System.out.println(	  UUID.randomUUID().toString());
		return error; 
	}
	
	
	
}
