package com.aa.business.ejb.interfaces;
import java.util.List;

import javax.ejb.Local;

import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;

@Local
public interface BusinessLocal {
	
	public List<InformationDTO> consultarInfo(long inMsisdn);
	public InformationDTO consultaMSISDN(long number);
	public List<PackageDTO> getAvailablePackage(String code);
	public void error(String mssdn,String message,String errorcode);
	public String operation(String msisdn,String operacion,String operaciondetail,String previouspacket,String nextPacket);
}
