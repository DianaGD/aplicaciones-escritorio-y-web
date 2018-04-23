<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<form action="ServletGuardarCambiosUsuario" method="post">
	nombre: <input type="text" name="campoNombre" value="${usuarioAeditar.nombre}"/><br/>
	email: <input type="text" name="campoEmail" value="${usuarioAeditar.email}"/><br/>
	poblacion: <br/>
	<textarea rows="3" cols="20" name="campoPoblacion">${usuarioAeditar.poblacion}</textarea>
	<br/>
	contraseña: <input type="text" name="campoPass" value="${usuarioAeditar.pass}"/><br/>
	
	<input type="hidden" name="campoId" value="${usuarioAeditar.id}"/>
	<br/>
	<input type="submit" value="GUARDAR CAMBIOS"/>
</form>

</body>
</html>