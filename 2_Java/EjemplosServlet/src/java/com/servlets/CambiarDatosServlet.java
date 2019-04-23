/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.modelo.ServicioUsuarios;
import com.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Formacion
 */
public class CambiarDatosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CambiarDatosServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CambiarDatosServlet at " + request.getContextPath() + "</h1>");
            String nombre = request.getParameter("nom");
            String pass = request.getParameter("pass");
            String edad = request.getParameter("eda");
            String email = request.getParameter("email");

            boolean campoOk = true;

            if (nombre.equals("")) {
                campoOk = false;
                out.println("<p style='background-color: red'>Rellene el nombre</p>");
            }
            if (pass.equals("")) {
                campoOk = false;
                out.println("<p style='background-color: red'>Rellene la contraseña</p>");
            }
            if (edad.equals("")) {
                campoOk = false;
                out.println("<p style='background-color: red'>Rellene la edad</p>");
            }
            if (email.equals("")) {
                campoOk = false;
                out.println("<p style='background-color: red'>Rellene el email</p>");
            }

            if (campoOk) {
                ServicioUsuarios su = ServicioUsuarios.getInstancia();

                int iEdad = Integer.parseInt(edad);

                Usuario usu = new Usuario(nombre, pass, iEdad, email);

                if(su.cambiarDatos(usu)){
                    out.println("<h1 style='color: green'>Datos cambiados</h1>");
                    
                    out.println("<p>Email: " + usu.getEmail() + "</p>");
                    out.println("<p>Nombre: " + usu.getNombre() + "</p>");
                    out.println("<p>Clave: " + usu.getPassword() + "</p>");
                    out.println("<p>Edad: " + usu.getEdad() + "</p>");
                    
                }else{
                    out.println("<h1 style='color: red'>Error al cambiar los datos</p>");
                }
                
                
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
