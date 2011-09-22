package com.aa.clientWeb.webservices;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.business.dto.InformationDTO;
import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.login.Login;

/**
 * Servlet implementation class AAWSLogin
 */
public class AAWSLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	BusinessLocal businessLocal;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AAWSLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<InformationDTO> listaInfo = businessLocal.consultarInfo(1);
		for(InformationDTO info:listaInfo)
		{
			System.out.println("Info");
			System.out.println("Estado "+info.getEstado());
			System.out.println("Nombre "+info.getNombreId());
			System.out.println("Numero Id "+info.getNumeroId());
			System.out.println("Tipo Id "+info.getTipoId());
		}
		
		StringBuffer bufer = new StringBuffer();           
		int ch;
		while ( ( ch = request.getInputStream().read() ) != -1 )
		{
			bufer.append( ( char ) ch );
		}
		String user=bufer.toString().split("&")[0].replace("us=", "");
		String pass=bufer.toString().split("&")[1].replace("ps=", "");
		Login lg= new Login(user,pass);
		response.setContentType("application/json");
		response.getOutputStream().write(lg.isValidUser().getBytes());
		
	}

}
