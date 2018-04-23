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


<jsp:include page="menu.jsp"></jsp:include>
listado de anuncios:<br/>
<%
//recojo los anuncios que ha metido en el request el ServletListadoAnuncios
List<Anuncio> anuncios = (List<Anuncio>)request.getAttribute("anuncios");

for(Anuncio a : anuncios){
	//toda esta incrustacion esta bien para tener un caso practico
	//pero un poco mas adelante se hara usando etiquetas, no va a haber incrustaciones
	%>
	<div style="margin: 10px">
		titulo: <%= a.getTitulo() %> <br/>
		precio: <%= a.getPrecio() %> <br/>
		descripcion: <%= a.getDescripcion() %> <br/>
		telefono: <%= a.getTelefono() %> <br/>
		email: <%= a.getEmail() %> <br/>
	</div>
	
	
	<%
}//end foreach

%>

</body>
</html>