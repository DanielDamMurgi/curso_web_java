<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <h1>Página principal Aplicacion Servlets</h1>
</header>
<nav>
    <a href="index.jsp">Inicio</a>
    <c:catch var="excepcion">
        <jsp:useBean id="usuario" type="com.modelo.Usuario" scope="session">
            <jsp:getProperty property="*" name="usuario"/>
            <jsp:getProperty property="id" name="usuario"/>
            <jsp:getProperty property="email" name="usuario"/>
        </jsp:useBean>
        <a href="listar.jsp">Listado</a>
        <a href="eliminar.jsp">Eliminar</a>
    </c:catch>
    <c:if test="${not empty excepcion}">
        <a href="registro.jsp">Registro</a>
        <a href="login.jsp">Login</a>
    </c:if>
</nav>
<c:if test="${sessionScope.msj_error != null}">
    <h3 style="color: orange">${sessionScope.msj_error != null}</h3>
    <c:remove var="msj_error" scope="session"/>
    <!-- request.getSession().removeAtributte("msj_error"); -->
</c:if>

