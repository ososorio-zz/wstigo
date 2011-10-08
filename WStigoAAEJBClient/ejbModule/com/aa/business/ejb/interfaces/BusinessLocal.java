package com.aa.business.ejb.interfaces;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;
import com.aa.business.dto.UserDTO;

@Local
public interface BusinessLocal {
	
	public List<InformationDTO> consultarInfo(long inMsisdn);
	public InformationDTO consultaMSISDN(long number);
	public List<PackageDTO> getAvailablePackage(String code);
	public int error(String mssdn,String message,String errorcode);
	public String operation(String msisdn,String operacion,String operaciondetail,String previouspacket,String nextPacket);
	public UserDTO getUser(String user,String pass);
	public void updateLogLogin(int login, Date fecha,String operation,boolean registrytableuser);
	public String activatePackage(Long msisdn, String operation,
			String reason, String packageactual,String packageold);
	public String cancelatePackage(Long msisdn, String operation,
			String reason, String packagea);
	public List<UserDTO> getUsers();
	public String eliminateUser(String id);
	public String editUser(String us_id, String typedoc, String numdoc,
			String names, String apelidos, String pass, String rol,
			String email, String ultlogin);
	public String createUser(String typedoc, String numdoc,
			String names, String apelidos, String pass, String rol,
			String email);
	
}
