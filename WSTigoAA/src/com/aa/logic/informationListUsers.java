package com.aa.logic;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.aa.business.dto.UserDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;

public class informationListUsers implements Services {

	@Override
	public void invoke(String jsonRequest, Writer writer,
			BusinessLocal businessLocal) {
		List<UserDTO> lista=  businessLocal.getUsers();

		StringBuffer jsonResponse=new StringBuffer();
		jsonResponse.append( "{ " );
        jsonResponse.append( "\"data\": [" );
        int i = 0;	
		for(UserDTO usr:lista)
		{
							StringBuffer str=new StringBuffer("{");
							str.append("\"id\":\""+usr.getUsId()+"\"");
							str.append(",\"ide\":\""+ usr.getUsIdentification()+"\"");
							str.append(",\"tipoide\":\""+ usr.getUsTypeidentification()+"\"");
							str.append(",\"name\":\""+ usr.getUsNames()+"\"");
							str.append(",\"apll\":\""+ usr.getUsLastnames()+"\"");
							str.append(",\"rol\":\""+ usr.getUsRol()+"\"");
							str.append(",\"email\":\""+ usr.getUsEmail()+"\"");
							str.append(",\"login\":\""+ usr.getUsLastDateLogin()+"\"");
							str.append(",\"opr\":\""+
									"<button onclick='editeuserjq("+usr.getUsId()+")'>Editar</button>"+
									"<button onclick='eliminateuserjq("+usr.getUsId()+")'>Borrar</button>"
																						  
									+"\"");
							str.append(",\"pass\":\""+ usr.getUsPassword()+"\"");
							str.append("}");
							jsonResponse.append(str.toString());
				        	jsonResponse.append((i == lista.size()-1)?"":",");
				        	i++;
		}	
		jsonResponse.append( "]}" );
		response(writer, jsonResponse.toString());
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

}
