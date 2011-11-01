package com.aa.business.ejb.interfaces;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import com.aa.business.dto.CancelateDTO;
import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;
import com.aa.business.dto.UserDTO;

@Local
public interface BusinessLocal {
	
	public List<InformationDTO> consultarInfo(long inMsisdn);
	public InformationDTO consultaMSISDN(long number);
	public List<PackageDTO> getAvailablePackage(String code);
	public int error(String mssdn,String message,String errorcode);
	public String operation(String msisdn,String operacion,String operaciondetail,String previouspacket,String nextPacket,String user);
	public UserDTO getUser(String user,String pass);
	public void updateLogLogin(int login, Date fecha,String operation,boolean registrytableuser);
	public String activatePackage(Long msisdn, String operation,String reason, String packageactual,String packageold,String user);
	public String activatePackageIntern(Long msisdn, String operation, String reason, String packageactual,String packageold,String user);
	public String cancelatePackage(Long msisdn, String operation,String reason, String packagea,String user);
	public String cancelatePackageIntern(Long msisdn, String operation, String reason, String packagea,String user);
	public List<UserDTO> getUsers();
	public String eliminateUser(String id,String user);
	public String editUser(String us_id, String typedoc, String numdoc,String names, String apelidos, String pass, String rol,String email, String ultlogin,String user);
	public String createUser(String typedoc, String numdoc,String names, String apelidos, String pass, String rol,String email,String user);
	public List<CancelateDTO> availableCancelateReasons(String us_id,String packagea);
}
