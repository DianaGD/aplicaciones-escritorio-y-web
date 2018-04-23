<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:if test="${sessionScope.admin == null}">
	<jsp:forward page="login.jsp"></jsp:forward>
</c:if>

<a href="ServletListadoUsuariosAdmin">Gestionar usuarios</a>&nbsp;
<a href="ServletListadoAnunciosAdmin">Gestionar anuncios</a>&nbsp;
<a href="ServletLogOutAdmin">Salir</a>&nbsp;
