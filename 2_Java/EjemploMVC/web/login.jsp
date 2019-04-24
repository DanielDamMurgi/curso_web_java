<%@include file = "head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%= head() %>
    <%@include file = "header.jsp" %>
    <body>
        <h2>Login</h2>
        <form name="form1" method="post" action="./usuarios.do">
            <table border="1">
                <tr><td>E-mail:</td><td>
                        <input type="email" name="email" id="email" size="100" required="required" value="email@valido.com"/></td></tr>
                <tr><td>Contraseña:</td><td>
                        <input type="password" name="pass" id="pass" size="25" required="required" value="1234"/></td></tr>
            </table>
            <input type="hidden" name ="accion" id="accion" value="login"/>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
