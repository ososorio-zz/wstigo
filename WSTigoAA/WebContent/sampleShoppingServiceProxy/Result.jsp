<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleShoppingServiceProxyid" scope="session" class="co.com.colombiamovil.comprasterceros.service.ShoppingServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleShoppingServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        String msisdn_0id=  request.getParameter("msisdn5");
            java.lang.String msisdn_0idTemp = null;
        if(!msisdn_0id.equals("")){
         msisdn_0idTemp  = msisdn_0id;
        }
        String categoryId_1id=  request.getParameter("categoryId7");
            java.lang.Integer categoryId_1idTemp = null;
        if(!categoryId_1id.equals("")){
         categoryId_1idTemp  = java.lang.Integer.valueOf(categoryId_1id);
        }
        co.com.colombiamovil.comprasterceros.service.Service[] availableServices2mtemp = sampleShoppingServiceProxyid.availableServices(msisdn_0idTemp,categoryId_1idTemp);
if(availableServices2mtemp == null){
%>
<%=availableServices2mtemp %>
<%
}else{
        String tempreturnp3 = null;
        if(availableServices2mtemp != null){
        java.util.List listreturnp3= java.util.Arrays.asList(availableServices2mtemp);
        tempreturnp3 = listreturnp3.toString();
        }
        %>
        <%=tempreturnp3%>
        <%
}
break;
case 9:
        gotMethod = true;
        String userSeller_3id=  request.getParameter("userSeller22");
            java.lang.String userSeller_3idTemp = null;
        if(!userSeller_3id.equals("")){
         userSeller_3idTemp  = userSeller_3id;
        }
        String purchasedProductId_4id=  request.getParameter("purchasedProductId24");
            java.lang.Integer purchasedProductId_4idTemp = null;
        if(!purchasedProductId_4id.equals("")){
         purchasedProductId_4idTemp  = java.lang.Integer.valueOf(purchasedProductId_4id);
        }
        String reason_5id=  request.getParameter("reason26");
            java.lang.String reason_5idTemp = null;
        if(!reason_5id.equals("")){
         reason_5idTemp  = reason_5id;
        }
        String mobileNumber_6id=  request.getParameter("mobileNumber28");
            java.lang.String mobileNumber_6idTemp = null;
        if(!mobileNumber_6id.equals("")){
         mobileNumber_6idTemp  = mobileNumber_6id;
        }
        %>
        <jsp:useBean id="co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id" scope="session" class="co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO" />
        <%
        co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id.setUserSeller(userSeller_3idTemp);
        co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id.setPurchasedProductId(purchasedProductId_4idTemp);
        co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id.setReason(reason_5idTemp);
        co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id.setMobileNumber(mobileNumber_6idTemp);
        co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO processService9mtemp = sampleShoppingServiceProxyid.processService(co1com1colombiamovil1comprasterceros1service1ShoppingRequestDTO_2id);
if(processService9mtemp == null){
%>
<%=processService9mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userMessage:</TD>
<TD>
<%
if(processService9mtemp != null){
java.lang.String typeuserMessage12 = processService9mtemp.getUserMessage();
        String tempResultuserMessage12 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserMessage12));
        %>
        <%= tempResultuserMessage12 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">txCode:</TD>
<TD>
<%
if(processService9mtemp != null){
java.lang.String typetxCode14 = processService9mtemp.getTxCode();
        String tempResulttxCode14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetxCode14));
        %>
        <%= tempResulttxCode14 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">answer:</TD>
<TD>
<%
if(processService9mtemp != null){
java.lang.String typeanswer16 = processService9mtemp.getAnswer();
        String tempResultanswer16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeanswer16));
        %>
        <%= tempResultanswer16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">txStatus:</TD>
<TD>
<%
if(processService9mtemp != null){
java.lang.String typetxStatus18 = processService9mtemp.getTxStatus();
        String tempResulttxStatus18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetxStatus18));
        %>
        <%= tempResulttxStatus18 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 30:
        gotMethod = true;
        String msisdn_7id=  request.getParameter("msisdn33");
            java.lang.String msisdn_7idTemp = null;
        if(!msisdn_7id.equals("")){
         msisdn_7idTemp  = msisdn_7id;
        }
        co.com.colombiamovil.comprasterceros.service.Service[] purchasedServices30mtemp = sampleShoppingServiceProxyid.purchasedServices(msisdn_7idTemp);
if(purchasedServices30mtemp == null){
%>
<%=purchasedServices30mtemp %>
<%
}else{
        String tempreturnp31 = null;
        if(purchasedServices30mtemp != null){
        java.util.List listreturnp31= java.util.Arrays.asList(purchasedServices30mtemp);
        tempreturnp31 = listreturnp31.toString();
        }
        %>
        <%=tempreturnp31%>
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