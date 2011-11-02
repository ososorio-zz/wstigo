package com.aa.clientWeb.webservices;

import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.logic.LogicAdmin;

/**
 * Servlet implementation class AAWAdmin
 */
public class AAWAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	BusinessLocal businessLocal;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AAWAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		StringBuffer bufer = new StringBuffer();           
		int ch;
		while ( ( ch = request.getInputStream().read() ) != -1 )
		{
			bufer.append( ( char ) ch );
		}
		OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());

		
		LogicAdmin logic=new LogicAdmin(bufer.toString(),writer,businessLocal);
		logic.transaction();
		
	}

}
