<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Bienvenido a mi portal de noticias <br/>
<a href="ServletNoticias">ir a las noticias</a>

<br/>listado de webs amigas:<br/>
<% 
	out.println("listado recibido de una base de datos:");
	List<String> webs = new ArrayList<String>();
	webs.add("mitienda.es");
	webs.add("portalanuncaios.com");
	webs.add("portalVentaCoches.es");
	for(String w: webs){
		out.print("<p>");
		out.print(w);
		out.print("</p>");
	}
%>

</body>
</html>