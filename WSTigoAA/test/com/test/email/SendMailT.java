package com.test.email;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Security;

import javax.mail.MessagingException;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.mail.client.SendEmailJB;
import com.aa.mail.client.SendMail;

/**
 * Servlet implementation class SendMailT
 */
public class SendMailT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String HTML = "text/html";

	/** static final HTML setting for content type */
	private static final String PLAIN = "text/plain";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMailT() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType(PLAIN);
		PrintWriter out = response.getWriter();
	

		//Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		SendMail sendMailThroughJava = new SendMail();
		try {
			sendMailThroughJava.sendSSLMessage("000000", "messageerror");
			out.println("test susessok");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}


}
