<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="modelo.Usuario"%>
<%@page import="modelo.Anuncio"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Bienvenido a mi portal de anuncios<br/>
<a href="registrarAnuncio.jsp">registrar mi anuncio</a>
<a href="registrarUsuario.jsp">registrar usuario</a><br/>
listado de usuarios:<br/>
<c:forEach items="${usuarios}" var="usuario">
	<div style="margin: 10px">
		nombre:${usuario.nombre}<br/>
		email:${usuario.email}<br/>
		poblacion:${usuario.poblacion}<br/>
		contraseņa:${usuario.pass}<br/>
	</div>
</c:forEach>
</body>
</html>