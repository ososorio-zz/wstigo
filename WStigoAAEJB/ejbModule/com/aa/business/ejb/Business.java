package com.aa.business.ejb;

import java.util.ArrayList;
import java.util.List;

import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.dao.entity.Information_w;
import com.aa.dao.entity.Package;

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
			query.setParameter("msisdn", inMsisdn);
			List<Information_w> listaInfo = (List<Information_w>)query.getResultList();
			List<InformationDTO> lista = new ArrayList<InformationDTO>();
			for(Information_w info:listaInfo)
			{
				InformationDTO infoDto = new InformationDTO();
				infoDto.setTypodoc(info.getInIdentificationType());
				infoDto.setNumerodoc(info.getInIdentificationNumber());
				infoDto.setPlan(info.getInNamePro());
				infoDto.setEstadopaquete(info.getInPackageActive());
				infoDto.setPaqueteactual(String.valueOf(info.getInPackageActual()));
				infoDto.setTelefono(String.valueOf(info.getInMsisdn()));
				infoDto.setNombreusuario(info.getInIdentificationName());
				infoDto.setCodigopaquete(String.valueOf(info.getInPackageActual()));
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
			InformationDTO infoDto = new InformationDTO();
			infoDto.setTypodoc(info.getInIdentificationType());
			infoDto.setNumerodoc(info.getInIdentificationNumber());
			infoDto.setPlan(info.getInNamePro());
			infoDto.setEstadopaquete(info.getInPackageActive());
			infoDto.setPaqueteactual(String.valueOf(info.getInPackageActual()));
			infoDto.setTelefono(String.valueOf(info.getInMsisdn()));
			infoDto.setNombreusuario(info.getInIdentificationName());
			infoDto.setCodigopaquete(String.valueOf(info.getInPackageActual()));
			//TODO:setnamePaquete
			Query querypa = em.createNamedQuery(Package.queryInfoPackageName);
			System.out.println("Consulta"+info.getInPackageActual());
			querypa.setParameter("idpackage", info.getInPackageActual());
			Package packageinfo = (Package) querypa.getSingleResult();
			infoDto.setNombrepaquete( packageinfo.getDescription() );

			return infoDto;
		}
		catch (NoResultException e) 
		{
			System.out.println("No hay resultados para este numero");
			return null;
		}
	}
	
	public List<PackageDTO> getAvailablePackage(String packageactual)
	{
		Query query = em.createNamedQuery(Package.queryInfoPackage);
		query.setParameter("idpackage", Integer.parseInt(packageactual));
		@SuppressWarnings("unchecked")
		List<Package> resultList = (List<Package>)query.getResultList();
		List<PackageDTO> lista=new ArrayList<PackageDTO>();
		
		for(Package info:resultList)
		{
			PackageDTO tmppackage=new PackageDTO(String.valueOf(info.getPcId()), info.getDescription());
			lista.add(tmppackage);
		}
		return lista;
	}
	

}
