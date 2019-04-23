<%@include file = "head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <%= head() %>
    <body>  
        <%@include file = "header.jsp" %>
        <h2>Registro</h2>
        <form name="form1" method="post" action="./usuarios.do">
            <table border="1">
                <tr><td>Nombre:</td><td>
                        <input type="text" name="nom" id="nom" size="25" required="required" value="Dani Prueba"/></td></tr>
                <tr><td>Contraseña:</td><td>
                        <input type="password" name="pass" id="pass" size="25" required="required" value="1234"/></td></tr>
                <tr><td>Edad:</td><td>
                        <input type="number" name="eda" id="eda" size="25" required="required" value="22"/></td></tr>
                <tr><td>E-mail:</td><td>
                        <input type="email" name="email" id="email" size="100" required="required" value="email@valido.com"/></td></tr>
            </table>
            <input type="submit" value="Enviar"/>
        </form>
            
    </body>
</html>
