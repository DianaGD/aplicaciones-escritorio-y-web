<%@page import="modelo.Usuario"%>
<%@page import="modelo.Anuncio"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<%
//recojo los anuncios que ha metido en el request el ServletListadoAnuncios
List<Usuario> usuarios = (List<Usuario>)request.getAttribute("usuarios");

for(Usuario a : usuarios){
	//toda esta incrustacion esta bien para tener un caso practico
	//pero un poco mas adelante se hara usando etiquetas, no va a haber incrustaciones
	%>
	<div style="margin: 10px">
		nombre: <%= a.getNombre() %> <br/>
		email: <%= a.getEmail() %> <br/>
		poblacion: <%= a.getPoblacion() %> <br/>
		pass: <%= a.getPass() %> <br/>
	</div>
	
	
	<%
}//end foreach

%>

</body>
</html>