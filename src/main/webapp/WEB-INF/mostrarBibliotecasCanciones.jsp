<%-- 
    Document   : mostrarBibliotecasCanciones
    Created on : 6 oct. 2023, 16:06:29
    Author     : Alumno
--%>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> BIBLIOTECA</title>
    </head>
    <body>
        <h1>ACA TIENEM QUE APARECER LA BIBLIOTECA O LISTA DE CANCIONES HARDCODEADAS</h1>
        <table>
            <c:forEach items="${listaCanciones}" var="cancion">
                <tr>
                    <td>${cancion.nombreCancion}</td>
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
