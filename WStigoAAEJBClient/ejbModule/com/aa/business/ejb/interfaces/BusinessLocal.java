package com.aa.business.ejb.interfaces;
import java.util.List;

import javax.ejb.Local;

import com.aa.business.dto.InformationDTO;

@Local
public interface BusinessLocal {
	
	public List<InformationDTO> consultarInfo(long inMsisdn);
	public InformationDTO consultaMSISDN(long number);
}
