<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="index.jsp">volver a inicio</a><br/>
Introduce tus datos para registrarte en el portal:<br/>
<form action="ServletRegistroUsuario" method="post">
	nombre: <input type="text" name="campoNombre"/><br/>
	email: <input type="text" name="campoEmail"/><br/>
	poblacion: <input type="text" name="campoPoblacion"/><br/>
	contrase�a: <input type="password" name="campoPass"/><br/>
	<input type="submit" value="REGISTRARME"/>
</form>

<script>

</script>

</body>
</html>