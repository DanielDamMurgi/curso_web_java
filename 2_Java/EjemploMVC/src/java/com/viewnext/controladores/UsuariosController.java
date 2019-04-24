/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viewnext.controladores;

import com.modelo.ServicioUsuarios;
import com.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Formacion
 */
public class UsuariosController extends HttpServlet {

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
            String accion = request.getParameter("accion");
            
            String nom = request.getParameter("nom");
            String pass = request.getParameter("pass");
            String edad = request.getParameter("eda");
            String email = request.getParameter("email");

            switch (accion) {
                case "login":
                    if (ServicioUsuarios.getInstancia().validacionPasswd(email, pass)) {
                        //out.println("<h3>Usuario logueado</h3>");
                        
                        HttpSession sesion = request.getSession();
                        Usuario usu = ServicioUsuarios.getInstancia().obtenerUno(email);
                        sesion.setAttribute("usuario", usu);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    } else {
                        out.println("<h3>No se ha iniciado sesion</h3>");
                    }
                    break;
                case "registro":
                    if (ServicioUsuarios.getInstancia().addUsuario(nom, pass, edad, email)) {
                        out.println("<h3>Registrado correctamente</h3>");
                    } else {
                        out.println("<h3>No se ha registrado</h3>");
                    }
                    break;
                case "eliminar":
                   
                        if (ServicioUsuarios.getInstancia().eliminarUsuarios(null)) {
                            out.println("<h1>USUARIO Eliminado Correctamente<h1>");
                        }else {
                        out.println("<p style='background-color: red'> CONTRASEÑA o USUARIO INCORRECTO </p>");
                    }
                    break;
                default:
                    break;
            }

        } catch (Exception ex) {
            System.out.println(">>>> " + ex.getMessage());
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
