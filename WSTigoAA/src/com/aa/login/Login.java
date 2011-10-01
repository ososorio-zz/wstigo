package com.aa.login;

import java.util.Date;
import java.util.UUID;

import com.aa.business.dto.UserDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.cache.CacheUsers;

public class Login {

	private String us;
	private String ps;
	private String rol;
	public Login(String user, String pss){
		setUs(user);
		setPs(pss);
		
	}
	public Login(String user, String pss,String rol){
		setUs(user);
		setPs(pss);
		setRol(rol);
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
	
	public String isValidUser(BusinessLocal businessLocal)
	{
		
		//TODO CONSULTA A WEB
	   //TODO registro log de login
		
		UserDTO usrv= businessLocal.getUser(getUs(), getPs());		
		if(usrv.getUsRol()!=0){
			String tokens=UUID.randomUUID().toString();
			CacheUsers.getInstance().registerToken(tokens);
			//registro login
			businessLocal.updateLogLogin(usrv.getUsId(),new Date(),"ON:Login Pagina Web USR:"+usrv.getUsLastnames(),true);
			return  "{\"login\":\"202\",\"value\":\""+tokens+"\",\"rol\":\""+usrv.getUsRol()+"\",\"uid\":\""+usrv.getUsId()+"\"}";
		}
		String error="{\"login\":\"0\",\"value\":\"Usuario no valido:verifique su usuario y password\"}";
		return error; 
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getRol() {
		return rol;
	}
	
	
	
}
