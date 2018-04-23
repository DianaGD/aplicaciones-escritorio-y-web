<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
LISTADO DE NOVEDADES:<br/>

<script type="text/javascript">
//esto es javascript
//este codigo sí que le llega al navegador, el cual lo ejecuta
alert("hola desde javascript");
</script>

<%
//esto es java
String frase = "frase creada con java";
out.print(frase); //muestra la frase en html
ArrayList<String> novedades = new ArrayList<String>();
novedades.add("NUEVA VERSION DE JAVA DISPONIBLE<br/>");
novedades.add("Charla de uso de eclipse para el 22/3/2018");
//out.print(novedades+)
novedades.add("Sale a la venta el nuevo libro aprenda java9");

for(String novedad : novedades){
	out.print(novedad+"<br/>");
}
%>

</body>
</html>