<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="testComprasTercerosid" scope="session" class="co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
testComprasTercerosid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        String codigoProveedor_0id=  request.getParameter("codigoProveedor5");
        int codigoProveedor_0idTemp  = Integer.parseInt(codigoProveedor_0id);
        String fechaInicial_1id=  request.getParameter("fechaInicial7");
            java.lang.String fechaInicial_1idTemp = null;
        if(!fechaInicial_1id.equals("")){
         fechaInicial_1idTemp  = fechaInicial_1id;
        }
        String fechaFinal_2id=  request.getParameter("fechaFinal9");
            java.lang.String fechaFinal_2idTemp = null;
        if(!fechaFinal_2id.equals("")){
         fechaFinal_2idTemp  = fechaFinal_2id;
        }
        co.com.colombiamovil.comprasterceros.service.ConsultaProveedoresResponseDTO[] consultaProveedores2mtemp = testComprasTercerosid.consultaProveedores(codigoProveedor_0idTemp,fechaInicial_1idTemp,fechaFinal_2idTemp);
if(consultaProveedores2mtemp == null){
%>
<%=consultaProveedores2mtemp %>
<%
}else{
        String tempreturnp3 = null;
        if(consultaProveedores2mtemp != null){
        java.util.List listreturnp3= java.util.Arrays.asList(consultaProveedores2mtemp);
        tempreturnp3 = listreturnp3.toString();
        }
        %>
        <%=tempreturnp3%>
        <%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>