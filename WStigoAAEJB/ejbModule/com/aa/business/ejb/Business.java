package com.aa.business.ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.mail.MessagingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;
import com.aa.business.dto.UserDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.dao.entity.Information_w;
import com.aa.dao.entity.LogsError;
import com.aa.dao.entity.LogsLog_in;
import com.aa.dao.entity.LogsOperation;
import com.aa.dao.entity.Package;
import com.aa.dao.entity.User;
import com.aa.mail.ejb.SendMail;

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
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
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

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
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

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
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



	/**
	 * cuando registrar un error el automaticamente envia un email dependiendo del codigo 
	 * y registra el suceso en la bd
	 * @param mssdn
	 * @param message
	 * @param errorcode 
	 */
	public void error(String mssdn,String message,String errorcode)
	{
		LogsError logError = new LogsError();
		logError.setLeDate(new Date());
		logError.setLeErrorcode(errorcode);
		logError.setLeMessage(message);
		logError.setLeMsisdn(Long.parseLong(mssdn));
		em.persist(logError);

		SendMail sm=new SendMail();
		try {
			sm.sendSSLMessage("A Ocurrido un error en el aplicativo \n Codigo Asignado "+logError.getLeIdError()+" \n Numero: "+mssdn+" \n Codigo del error:"+errorcode+"\n Causa:"+message);
		} catch (MessagingException e) {
			System.out.println("Revise la configuracion del aplicativo no fue posible enviar el correo-e");
			e.printStackTrace();
		}


	}

	public String operation(String msisdn, String operacion,
			String operaciondetail, String previouspacket, String nextPacket) {
		LogsOperation lgo=new LogsOperation();
		lgo.setLoDate(new Date());
		lgo.setLoMsisdn(Long.parseLong(msisdn));
		lgo.setLoOperation(operacion);
		lgo.setLoOperationDetail(operaciondetail);
		if(nextPacket==null || nextPacket.equals("") )
			nextPacket="0";
		lgo.setLoNextPacket(Integer.parseInt(nextPacket));
		lgo.setLoPreviousPacket(Integer.parseInt(previouspacket));

		em.persist(lgo);
		return String.valueOf(lgo.getLoId());
	}

	/*
	 * (non-Javadoc)
	 * Aplica para cuando el usuario realiza login y actualiza en la tabla users y logs_log-in
	 * @see com.aa.business.ejb.interfaces.BusinessLocal#updateLogLogin(int, java.util.Date)
	 */
	public void updateLogLogin(int login, Date fecha,String operation,boolean registrytableuser) 
	{

		if(registrytableuser)
		{
			User usr=em.find(User.class, login);
			if(usr != null)
			{
				usr.setUsLastDateLogin(fecha);	
				em.merge(usr);
			}
		}

		LogsLog_in loginLo = new LogsLog_in();
		loginLo.setLlDate(fecha);
		loginLo.setLlUsId(login);
		loginLo.setLlOperation(operation);
		em.persist(loginLo);

	}



	public UserDTO getUser(String user,String pass)
	{
		Query query = em.createNamedQuery(User.queryisvaliduser);
		query.setParameter("identification", user);
		User info = (User) query.getSingleResult();

		UserDTO usr = null;
		if(info.getUsPassword().equals(pass))
		{
			usr=new UserDTO(info.getUsId(), info.getUsLastnames(), info.getUsNames(), info.getUsRol());
		}
		else
			usr=new UserDTO();
		return usr;
	}

	public String activatePackage(String msisdn, String operation,
			String reason, String packagea) {
		// TODO Auto-generated method stub
		return null;
	}

	public String cancelatePackage(Long msisdn, String operation,
			String reason, String packagea) {

		//TODO:CANCELAR A EL WEBSERVICES ESPERAR RESPUESTA LLAMAR A METODO

		String idconfirmation=cancelatePackageIntern(msisdn, operation, reason, packagea);
		return idconfirmation;
	}

	public String cancelatePackageIntern(Long msisdn, String operation,
			String reason, String packagea) {
		//long number=Long.parseLong(msisdn.toString().trim());
		
		Information_w info=em.find(Information_w.class, msisdn );
		info.setInPackageActive("0");
		em.merge(info);
		String confirmacion= operation(""+msisdn, operation, reason, packagea, "");

		return confirmacion;

	}



}
