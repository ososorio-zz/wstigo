package com.aa.business.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.mail.MessagingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.rpc.ServiceException;

import co.com.colombiamovil.comprasterceros.service.ProcessActionEnum;
import co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO;
import co.com.colombiamovil.comprasterceros.service.ShoppingService;
import co.com.colombiamovil.comprasterceros.service.ShoppingServiceServiceLocator;

import com.aa.business.dto.CancelateDTO;
import com.aa.business.dto.InformationDTO;
import com.aa.business.dto.PackageDTO;
import com.aa.business.dto.UserDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.dao.entity.Cancellation;
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
	
	ResourceBundle rb = ResourceBundle.getBundle("com.aa.business.properties.conf");

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
				infoDto.setEstadocuenta(info.getInEstCta());
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
			infoDto.setEstadocuenta(info.getInEstCta());
			Query querypa = em.createNamedQuery(Package.queryInfoPackageName);
			System.out.println("Consulta"+info.getInPackageActual());
			querypa.setParameter("idpackage", info.getInPackageActual());
			Package packageinfo = (Package) querypa.getSingleResult();
			infoDto.setNombrepaquete( packageinfo.getDescription() );

			return infoDto;
	
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<PackageDTO> getAvailablePackage(String packageactual,String activate)
	{
		Query query=null;
		
		if(activate.equals("1")){
		 query = em.createNamedQuery(Package.queryInfoPackage);
		query.setParameter("idpackage", Integer.parseInt(packageactual));
		}
		else
		{
			 query = em.createNamedQuery(Package.queryInfoPackage1);
		}
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
	 * @return 
	 */
	public int error(String mssdn,String message,String errorcode)
	{
		int iderror=errorDatabase(mssdn, message, errorcode);

		SendMail sm=new SendMail();
		try {
			sm.sendSSLMessage("Ha Ocurrido un error en el aplicativo \n Codigo Asignado "+iderror+" \n Numero: "+mssdn+" \n Codigo del error:"+errorcode+"\n Causa:"+message);
		} catch (MessagingException e) {
			System.out.println("Revise la configuracion del aplicativo no fue posible enviar el correo-e");
			e.printStackTrace();
		}
		return iderror;

	}

	public int errorDatabase(String mssdn,String message,String errorcode)
	{
		LogsError logError = new LogsError();
		logError.setLeDate(new Date());
		logError.setLeErrorcode(errorcode);
		logError.setLeMessage(message);
		logError.setLeMsisdn(Long.parseLong(mssdn));
		em.persist(logError);
		return logError.getLeIdError();
	}

	public String operation(String msisdn, String operacion,
			String operaciondetail, String previouspacket, String nextPacket,String user) {
		
		if(user==null){
			user="1";//Default de tigo;
		    operaciondetail+=":::::Usuario Nulo";
		}
		LogsOperation lgo=new LogsOperation();
		lgo.setLoDate(new Date());
		lgo.setLoMsisdn(Long.parseLong(msisdn));
		lgo.setLoOperation(operacion);
		lgo.setLoOperationDetail(operaciondetail);
		if(nextPacket==null || nextPacket.equals("") )
			nextPacket="0";
		lgo.setLoNextPacket(Integer.parseInt(nextPacket));
		lgo.setLoPreviousPacket(Integer.parseInt(previouspacket));
		lgo.setLousr(Integer.parseInt(user));
		
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

	public List<UserDTO> getUsers()
	{
		Query query = em.createNamedQuery(User.querygetusers);
		@SuppressWarnings("unchecked")
		List<User> resultList = (List<User>)query.getResultList();
		List<UserDTO> lista=new ArrayList<UserDTO>();
		for(User info:resultList)
		{
			lista.add(new UserDTO(info.getUsId(),info.getUsEmail(),info.getUsIdentification(),info.getUsLastDateLogin(),info.getUsLastnames(),info.getUsNames(),info.getUsPassword(),info.getUsRol(),info.getUsTypeidentification()));
		}
		return lista;
	}

	public String activatePackage(Long msisdn, String operation,
			String reason, String packageactual,String packageold,String user) {
			
		//invocar el ws
		ShoppingServiceServiceLocator locator = new ShoppingServiceServiceLocator();
		ShoppingService service;
		String idconfirmation = null;
		try 
		{
			ShoppingRequestDTO requestDTO = new ShoppingRequestDTO();
			requestDTO.setMobileNumber(msisdn.toString());
			requestDTO.setReason(reason);
			if(!user.equals("american-assist"))
    		{
    			user = rb.getString("userSeller");
    		}
			if(packageactual != null)
			{
				requestDTO.setPurchasedProductId(Integer.parseInt(packageactual));
			}
			requestDTO.setUserSeller(user);
			requestDTO.setAction(ProcessActionEnum.ACQUIRE);
			service = locator.getShoppingServicePort();
			ShoppingResponseDTO response = service.processService(requestDTO);
			if(response != null)
			{
				user = "1";
				idconfirmation="Operacion Exitosa(Activacion) codigo de transaccion:"+activatePackageIntern(msisdn, operation, reason, packageactual,packageold, user);
			}
		
		} 
		catch (ServiceException e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error activando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "404");

		} catch (RemoteException e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error activando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "405");

		}
		catch (Exception e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error activando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "406");

		}
		return idconfirmation;		
	}
	public String activatePackageIntern(Long msisdn, String operation,
			String reason, String packageactual,String packageold,String user) {

		try{

			Information_w info=em.find(Information_w.class, msisdn );
			info.setInPackageActive("1");
			info.setInPackageActual(Integer.parseInt(packageactual));
			em.merge(info);
			String confirmacion = operation(""+msisdn, operation, reason, packageactual, packageold,user);

			return confirmacion;

		}catch (Exception e) {

			int errorcode=error(String.valueOf(msisdn), "datos a activar:"+msisdn+","+ operation+","+ reason+","+ packageactual+","+ packageold+", Error interno:"+e.getMessage(), "ERR:activatePackage Intern");
			return "Error:currio un error por favor realize seguimiento correspondiente con el codigo:"+errorcode;
		}

	}


	public String cancelatePackage(Long msisdn, String operation,
			String reason, String packagea,String user) {

		//invocar el ws
		ShoppingServiceServiceLocator locator = new ShoppingServiceServiceLocator();
		ShoppingService service;
		String idconfirmation = null;
		try 
		{
			if(!user.equals("american-assist"))
    		{
    			user = rb.getString("userSeller");
    		}
			ShoppingRequestDTO requestDTO = new ShoppingRequestDTO();
			requestDTO.setMobileNumber(msisdn.toString());
			requestDTO.setReason(reason);
			if(packagea != null)
			{
				requestDTO.setPurchasedProductId(Integer.parseInt(packagea));
			}
			requestDTO.setAction(ProcessActionEnum.CANCEL);
			requestDTO.setUserSeller(user);
			service = locator.getShoppingServicePort();
			ShoppingResponseDTO response = service.processService(requestDTO);
			if(response != null)
			{
				user = "1";
				idconfirmation ="Operacion Exitosa(cancelacion) codigo de transaccion"+cancelatePackageIntern(msisdn, operation, reason, packagea, user);
			}
			
		} 
		catch (ServiceException e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error cancelando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "407");

		} catch (RemoteException e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error cancelando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "408");

		}
		catch (Exception e) {
			e.printStackTrace();
			//TODO: deberiamos si se peude como identificarlo o personalizar el texto del error o etc para poder identificar el codigo de error
			String message="Error:"+e.getMessage();
			idconfirmation="Error:Ocurrio un error cancelando el paquete(servicio) OBS:servicio externo tigo  codigo Asignado:"+error(String.valueOf(msisdn), message, "409");

		}
		return idconfirmation;
	}

	public String cancelatePackageIntern(Long msisdn, String operation,
			String reason, String packagea,String user) {
		try{

			Information_w info=em.find(Information_w.class, msisdn );
			info.setInPackageActive("0");
			em.merge(info);
			String confirmacion = operation(""+msisdn, operation, reason, packagea, "",user);

			return confirmacion;

		}catch (Exception e) {

			int errorcode=error(String.valueOf(msisdn), "datos a cancelar:"+msisdn+","+ operation+","+ reason+","+ packagea+", Error interno:"+e.getMessage(), "ERR:cancelatePackage Intern");
			return "Error:Ocurrio un error por favor realize seguimiento correspondiente con el codigo:"+errorcode;
		}

	}

	public String eliminateUser(String id,String userid) {
		try{
			User user=em.find(User.class, Integer.parseInt( id ) );
			em.remove(user);
			String confirmacion = operation(""+user.getUsId(), "Eliminar usuario", "Elimino usuario CC:"+user.getUsIdentification()+"date:"+new Date(),"0","0",userid);
			return confirmacion;
		}catch (Exception e) {
			System.out.println("a borrar"+id+"--"+Integer.parseInt( id ) );
			e.printStackTrace();
			return null;
		}

	}

	public String editUser(String us_id, String typedoc, String numdoc,
			String names, String apelidos, String pass, String rol,
			String email, String ultlogin,String userid) 
	{

		try{
			User user=em.find(User.class, Integer.parseInt( us_id ) );
			
			user.setUsTypeidentification(typedoc);
			user.setUsIdentification(numdoc);
			user.setUsNames(names);
			user.setUsLastnames(apelidos);
			user.setUsPassword(pass);
			user.setUsRol(Integer.parseInt( rol ));
			user.setUsEmail(email);
			em.merge(user);	
			String confirmacion = operation(""+user.getUsId(), "Editar usuario", "Edito al usuario CC:"+user.getUsIdentification()+"date:"+new Date(),"0","0",userid);
			return confirmacion;
		}catch (Exception e) {
			System.out.println("a borrar"+us_id+"--"+Integer.parseInt( us_id ) );
			e.printStackTrace();
			return null;
		}
		
	}

	public String createUser(String typedoc, String numdoc, String names,
			String apelidos, String pass, String rol, String email,String userid) {
		
		try{
		User user=new User();
		user.setUsTypeidentification(typedoc);
		user.setUsIdentification(numdoc);
		user.setUsNames(names);
		user.setUsLastnames(apelidos);
		user.setUsPassword(pass);
		user.setUsRol(Integer.parseInt(rol));
		user.setUsEmail(email);
		
		em.persist(user);
		String confirmacion = operation(""+user.getUsId(), "Crear usuario", "Creo al usuario CC:"+user.getUsIdentification()+"date:"+new Date(),"0","0",userid);
		return confirmacion;
		
		}catch (Exception e) {
			return "ERROR:"+e.getMessage();
		}		
	}

	public List<CancelateDTO> availableCancelateReasons(String us_id,
			String packagea) {
		Query query = em.createNamedQuery(Cancellation.selectall);
		@SuppressWarnings("unchecked")
		List<Cancellation> resultList = (List<Cancellation>)query.getResultList();
		List<CancelateDTO> lista=new ArrayList<CancelateDTO>();

		for(Cancellation info:resultList)
		{
			CancelateDTO tmppackage=new CancelateDTO(info.getCaId(),info.getCaReasonCancellation());
			lista.add(tmppackage);
		}
		return lista;	
	}



}
