package com.aa.login;

import java.security.SecureRandom;
import java.util.UUID;
import java.math.BigInteger;

import com.aa.cache.CacheUsers;

public final class SessionIdentifierGenerator
{

  private SecureRandom random = new SecureRandom();

  public String nextSessionId()
  {
	 	  
    return new BigInteger(130, random).toString(32);
  }
  
  
  public boolean isValidToken(String token)
  {
	  if(token==null)
		  return false;

	  return CacheUsers.getInstance().isValidToken(token);
  }

}