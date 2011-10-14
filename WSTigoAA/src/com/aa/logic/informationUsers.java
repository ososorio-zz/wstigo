package com.aa.logic;

import java.io.IOException;
import java.io.Writer;
import org.codehaus.jettison.json.JSONObject;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.mail.client.SendMail;

public class informationUsers implements Services {

	private String activity;

	public informationUsers(String operation) {
		setActivity(operation);
	}

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		String id = null;

		try {
			if(getActivity().equals("informationeliminateUsers"))
			{
				JSONObject jsonobj=new JSONObject(jsonRequest);
				String uid=jsonobj.getString("uid");
				JSONObject informationeliminateUsers=jsonobj.getJSONObject("informationeliminateUsers");
				id= informationeliminateUsers.getString("id");
				String response=businessLocal.eliminateUser(id,uid);
				if(response==null)
					throw new Exception("No se pudo eliminar el usuario");
				else
					response(writer,"{\"responseinfo\":{ \"response\":\"Se elimino correctamente el usuario codigo de operacion:"+response+"\" }}");
			}
			else
				if(getActivity().equals("informationEditUsers"))
				{
					JSONObject jsonobj=new JSONObject(jsonRequest);
					String uid=jsonobj.getString("uid");
					JSONObject informationEditUsers=jsonobj.getJSONObject("informationEditUsers");
					id=informationEditUsers.getString("us_id");
					
					String response=businessLocal.editUser(
							informationEditUsers.getString("us_id"),
							informationEditUsers.getString("typedoc"),
							informationEditUsers.getString("numdoc"),
							informationEditUsers.getString("names"),
							informationEditUsers.getString("apelidos"),
							informationEditUsers.getString("pass"),
							informationEditUsers.getString("rol"),
							informationEditUsers.getString("email"),
							informationEditUsers.getString("ultlogin"),uid);
				
					if(response==null)
						throw new Exception("No se pudo actualizar el usuario");
					else
						response(writer,"{\"responseinfo\":{ \"response\":\"Se actualizo correctamente el usuario codigo de operacion:"+response+"\" }}");
		
					
				}
				else 
					if(getActivity().equals("informationCreateUsers"))
					{
						
						JSONObject jsonobj=new JSONObject(jsonRequest);
						String uid=jsonobj.getString("uid");
						JSONObject informationCreateUsers=jsonobj.getJSONObject("informationCreateUsers");
						id="New User";
						String response=businessLocal.createUser(
								informationCreateUsers.getString("typedoc"),
								informationCreateUsers.getString("numdoc"),
								informationCreateUsers.getString("names"),
								informationCreateUsers.getString("apelidos"),
								informationCreateUsers.getString("pass"),
								informationCreateUsers.getString("rol"),
								informationCreateUsers.getString("email"),
								uid
								);
						
						if(response==null)
							throw new Exception("No se pudo crear el usuario");
						else{
							
							if(response.indexOf("ERROR:")!=-1)
							{
								if(response.contains("Could not execute JDBC batch update"))
								{
									response(writer,"{\"responseinfo\":{ \"error\":\"No fue posible crear el usuario Ingrese los datos de nuevo por favor. *El numero de identificacion ya existe en el aplicativo.\" ,\"value\":\""+response+"\" }}");
									return;
								}
								
								response(writer,"{\"responseinfo\":{ \"error\":\"No fue posible crear el usuario Ingrese los datos de nuevo por favor.\" ,\"value\":\""+response+"\" }}");
								return;
								
							}
							
							
							
							try{
								
								SendMail sendm=new SendMail();
								sendm.sendSSLMessageEmail("<p>WS TIGO COMPRA TERCERO</p></br><p>Usuario asignado al sistema:"+informationCreateUsers.getString("numdoc")+"</p></br>Password:"+informationCreateUsers.getString("pass"),informationCreateUsers.getString("email"));
								
							}catch (Exception e) {
								e.printStackTrace();
							}
							
							response(writer,"{\"responseinfo\":{ \"response\":\"Se creo correctamente el usuario codigo de operacion:"+response+"\" }}");
							

						}
						
					}
			
			
			
		} catch (Exception e) {
			System.out.println("error eliminate user");
			e.printStackTrace();
			response(writer,"{\"responseinfo\":{ \"error\":\""+e.getMessage()+" id:"+id+"\" }}");
		}
	}

	@Override
	public void response(Writer writer, String response) {
		try {
			writer.write(response);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getActivity() {
		return activity;
	}

}
