package com.aa.clientWeb.webservices;

import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.logic.LogicServices;

/**
 * Servlet implementation class AAWServices
 */
public class AAWServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AAWServices() {
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
		OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());

		
		LogicServices logic=new LogicServices(bufer.toString(),writer);
		logic.transaction();
	}

}
