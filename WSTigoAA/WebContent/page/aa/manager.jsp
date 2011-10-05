<%@page import="com.aa.cache.CacheUsers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	 import="java.util.* "
	%>
	<%
	String token=request.getParameter("token");
	if(token==null)
		response.sendRedirect("../login/loginAAWST.html");
	else
	{
		boolean isvalid= CacheUsers.getInstance().isValidToken(token);
		if(!isvalid)
		{
			response.sendRedirect("../login/loginAAWST.html");
		}
	}
	String rol=request.getParameter("rl");
	String uid=request.getParameter("uid");
	
	%>
	
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">var rl="<%=rol%>"; var ses="<%=token %>"; var uid="<%=uid%>";</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AMERICAN ASSIST TIGO WS</title>
<link type="text/css" href="css/custom-theme/jquery-ui-1.8.16.custom.css" rel="stylesheet" />
<link type="text/css" href="css/main.css" rel="stylesheet" />
<link rel="stylesheet" href="css/form.css" type="text/css" media="all" />

<!--[if lte IE 7]>
<style>
.content { margin-right: -1px; } /* this 1px negative margin can be placed on any of the columns in this layout with the same corrective effect. */
ul.nav a { zoom: 1; }  /* the zoom property gives IE the hasLayout trigger it needs to correct extra whiltespace between the links */
</style>
<![endif]-->
<script type="text/javascript" src="js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="js/jquery.json-2.2.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/operation.js"></script>
<script type="text/javascript" src="js/users.js"></script>

</head>
<body>

<div class="container">
  <div class="header"><a href="javascript:void(0)"><img src="images/AmeLogo.jpg" alt="American Assist" name="American Assist" width="159" height="115" id="logo_ame" style="background: #8090AB; display:block;" /></a><!-- end .header --></div>
  <div class="sidebar1">
    <ul class="nav">
      <li><a href="javascript:opload();">Operaciones</a></li>
      <% if(rol.equals("3")){ %>
      <li><a href="javascript:adminusr();">Administracion Usuarios</a></li>
      <%}%>
      <li><a href="javascript:closesession();">Cerrar Session</a></li>
    </ul>
    <!-- end .sidebar1 --></div>
  <div class="content">
  <center>
  <div id="loadingdiv" style="display:none;left:50%;position:absolute;top:50%;z-index:1004;"><img src="images/ajax-loader.gif"  alt="cargando" /> </div>
  </center>
  <div id="divoperaciones">
  <%@ include file="operation.jsp" %> 
  </div>
  <div id="divusuarios" style="display:none;">
  <%@ include file="users.jsp" %> 
  </div>
  
  
  <!-- end .content --></div>
  <div class="footer">
	<p align="right">American Assist 2011</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>




</html>