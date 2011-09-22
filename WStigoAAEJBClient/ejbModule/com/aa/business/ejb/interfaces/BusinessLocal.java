package com.aa.business.ejb.interfaces;
import java.util.List;

import javax.ejb.Local;

import com.aa.business.dto.InformationDTO;

@Local
public interface BusinessLocal {
	
	public List<InformationDTO> consultarInfo(int inMsisdn);
	public InformationDTO consultaMSISDN(String number);
}
