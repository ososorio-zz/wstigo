package com.aa.cache;

import java.util.ArrayList;

public class CacheUsers {

	private static CacheUsers cacheusers;
	private ArrayList<String> tokens;
	private CacheUsers(){
		setTokens(new ArrayList<String>());
	};
	
	
	public static CacheUsers getInstance()
	{
		if(cacheusers==null){
			cacheusers= new CacheUsers();
		}
		return cacheusers;	
	}
	
	public boolean isValidToken(String token)
	{
		return getTokens().contains(token);
	}
	
	public void unRegisterToken(String token)
	{
		getTokens().remove(token);
	}
	
	
	public void registerToken(String token)
	{
		getTokens().add(token);
	}


	public void setTokens(ArrayList<String> tokens) {
		this.tokens = tokens;
	}


	public ArrayList<String> getTokens() {
		return tokens;
	}

	
}
