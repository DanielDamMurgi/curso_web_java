<%@include file = "head.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    ArrayList<Usuario> listaUsu = ServicioUsuarios.getInstancia().listar();
%>

<html>
    <%= head()%>
    <body>  
        <%@include file = "header.jsp" %>

        <%-- Comentario JSP --%>
        <table>
            <thead>
            <th>Nombre</th>
            <th>Email</th>
        </thead>
        <tbody>
            <%
                for (Usuario usu : listaUsu) {
            %>


        <form action="usuarios.do" method="post" name="form_<%= usu.getId()%>">
            <input id="id" name="id" type="text" size="4" readonly="true" value="<%= usu.getId() %>"/>  
            <input id="nom" name="nom" type="text" size="20" value="<%= usu.getNombre() %>"/>
            <input id="eda" name="eda" type="number" size="4" value="<%= usu.getEdad() %>"/>
            <input id="email" name="email" type="text" size="20" value="<%= usu.getEmail() %>"/>
            <input id="pass" name="pass" type="text" size="20" value="<%= usu.getPassword()%>"/>
            <input class="metodo" id="accion" name="accion" readonly="true" value="***"/>
            <input type="submit" value="EDIT" 
                   onclick="Array.from(document.getElementsByClassName('metodo')).forEach((thisInput) => { thisInput.value = 'PUT';})"/>
        </form><br>
        <%
            }
        %>
    </table>
