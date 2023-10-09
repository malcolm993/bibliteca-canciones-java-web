/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ProyectoServets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */

public class SV_Ingreso extends HttpServlet {

    private static String usuarioHarcodeado = "santiago";
    private static String passwordHarcodeado = "123";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("password");
        
        boolean verificacionUsuario = user.equals(usuarioHarcodeado) && pass.equals(passwordHarcodeado);
        if (!verificacionUsuario){
            response.sendError(response.SC_UNAUTHORIZED, "usuario o contraseña incorrecta");      
        } else{
            
        }
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
          
        
    }


}
