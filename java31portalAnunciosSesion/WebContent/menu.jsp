Bienvenido a mi portal de anuncios<br/>
<a href="ServletListadoUsuarios">IR AL LISTADO DE USUARIOS</a><br/>


<%
if(session.getAttribute("identificado")==null){
	%>
	<span style="color: gray;">
		debes identificarte para registrar tu anuncio</span>
	<a href="login.jsp">Identificarme</a><br/>
	<a href="registrarUsuario.jsp">Registrarme</a><br/>
	<%
}else{
%>
<a href="registrarAnuncio.jsp">registrar mi anuncio</a><br/>
<a href="ServletLogOut">cerrar sesion</a><br/>
<%	
}
%>
