package com.aa.clientWeb.webservices;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		response.getOutputStream().write(lg.isValidUser(businessLocal).getBytes());
		
	}

}
