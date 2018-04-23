<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	if(session.getAttribute("identificado")==null){
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
%>

<a href="index.jsp">volver a inicio</a><br/>
Introduce los datos de tu anuncio:<br/>
<form action="ServletRegistroAnuncio" method="post">

	titulo: <input type="text" name="campoTitulo"/><br/>
	precio: <input type="text" name="campoPrecio"/><br/>
	descripcion: <br/>
	<textarea rows="3" cols="20" name="campoDescripcion"></textarea>
	<br/>
	telefono: <input type="text" name="campoTelefono"/><br/>
	email: <input type="text" name="campoEmail"/><br/>
	<input type="submit" value="ACEPTAR"/>
</form>




</body>
</html>