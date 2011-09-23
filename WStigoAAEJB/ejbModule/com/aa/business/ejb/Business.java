package com.aa.business.ejb;

import java.util.ArrayList;
import java.util.List;

import com.aa.business.dto.InformationDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.dao.entity.Information_w;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class Business
 */
@Stateless
public class Business implements BusinessLocal {

	@PersistenceContext(unitName="WStigoAAPersistenceUnit")
	private EntityManager em;

	/**
	 * Default constructor. 
	 */
	public Business() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public List<InformationDTO> consultarInfo(long inMsisdn) 
	{
		try
		{
			Query query = em.createNamedQuery(Information_w.queryInfo);
			System.out.println("numero"+inMsisdn);
			query.setParameter("msisdn", inMsisdn);
			List<Information_w> listaInfo = (List<Information_w>)query.getResultList();
			System.out.println(listaInfo.size());
			List<InformationDTO> lista = new ArrayList<InformationDTO>();
			for(Information_w info:listaInfo)
			{
				InformationDTO infoDto = new InformationDTO();
				infoDto.setEstado(info.getInEstPro());
				infoDto.setNombreId(info.getInIdentificationName());
				infoDto.setNumeroId(info.getInIdentificationNumber());
				infoDto.setTipoId(info.getInIdentificationType());
				lista.add(infoDto);
			}
			return lista;
		}
		catch (NoResultException e) 
		{
			System.out.println("No result exec");
			return null;
		}
	}
	public InformationDTO consultaMSISDN(long number) {
		try
		{
			System.out.println("numero:"+number);
			Query query = em.createNamedQuery(Information_w.queryInfo);
			query.setParameter("msisdn", number);

			Information_w info = (Information_w) query.getSingleResult();
			System.out.println(info.getInAccountNo());
			InformationDTO infoDto = new InformationDTO();
			infoDto.setEstado(info.getInEstPro());
			infoDto.setNombreId(info.getInIdentificationName());
			infoDto.setNumeroId(info.getInIdentificationNumber());
			infoDto.setTipoId(info.getInIdentificationType());

			return infoDto;
		}
		catch (NoResultException e) 
		{
			System.out.println("No hay resultados para este numero");
			return null;
		}
	}

}
