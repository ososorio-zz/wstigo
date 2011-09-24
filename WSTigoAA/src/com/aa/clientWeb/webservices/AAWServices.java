package com.aa.clientWeb.webservices;

import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aa.business.ejb.interfaces.BusinessLocal;
import com.aa.logic.LogicServices;

/**
 * Servlet implementation class AAWServices
 */
public class AAWServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	BusinessLocal businessLocal;
	
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
		
		
		
		/*List<InformationDTO> listaInfo = businessLocal.consultarInfo(1);
        for(InformationDTO info:listaInfo)
        {
                System.out.println("Info");
                System.out.println("Estado "+info.getEstado());
                System.out.println("Nombre "+info.getNombreId());
                System.out.println("Numero Id "+info.getNumeroId());
                System.out.println("Tipo Id "+info.getTipoId());
        }
        try{
        InformationDTO dto= businessLocal.consultaMSISDN("3164146742");
        System.out.println(dto.getNombreId());
        }catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		response.setContentType("application/json");
		
		
		
		StringBuffer bufer = new StringBuffer();           
		int ch;
		while ( ( ch = request.getInputStream().read() ) != -1 )
		{
			bufer.append( ( char ) ch );
		}
		OutputStreamWriter writer = new OutputStreamWriter(response.getOutputStream());

		
		LogicServices logic=new LogicServices(bufer.toString(),writer,businessLocal);
		logic.transaction();
	}

}
