<%-- 
    Document   : IngresoUsuario
    Created on : 8 oct. 2023, 17:43:57
    Author     : santi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ingreso</title>
    </head>
    <body>
        <h1>PAGINA DE INGRESO USUARIO</h1>
        <br>
        <h2>ingresode datos por formulario metodo post</h2>
        <br>
        <<p>ususario: santiago, contraseña: 123</p>
        <br>
        <form name="formulario1" action="login" method="post">
            <label for="user">Usuario</label>
            <input type="text" id="user" name="user">
            <br/><br/>
            <label for="password">Contraseña:</label>
            <input type="text" id="password" name="password">
            <br/><br/>
            <input type="submit">
            <input type="reset">
        </form>
        
    </body>
</html>
