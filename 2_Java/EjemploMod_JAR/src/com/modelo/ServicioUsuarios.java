/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;

/**
 *
 * @author Formacion
 */
public class ServicioUsuarios {

    private DerbyDBUsuario bdUsu;

    //Implementano singleton
    private static ServicioUsuarios instancia = null;

    private ServicioUsuarios() { //Nadie puede hacer new salvo esta misma clase
        //listaUsuarios = new ArrayList<>();
        bdUsu = new DerbyDBUsuario();
        this.listaUsuarios = bdUsu.listar();
    }

    public static ServicioUsuarios getInstancia() { //Unica manera de objtener un objeto de esta clase
        if (instancia == null) {
            instancia = new ServicioUsuarios();
        }

        return instancia;
    }

    //Codigo de la clase
    private ArrayList<Usuario> listaUsuarios;

    public boolean addUsuario(String nom, String password, String edad, String email) {
        try {
            if (nom.equals("") || password.equals("") || edad.equals("") || email.equals("")) {
                return false;
            } else {
                int iEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(null, nom, iEdad, email, password);
                //this.listaUsuarios.add(nuevoUsu);
                bdUsu = new DerbyDBUsuario();
                boolean creado = bdUsu.anadir(nuevoUsu);
                listaUsuarios = bdUsu.listar();
                return listaUsuarios != null && creado;
            }
        } catch (Exception ex) {
            System.err.println("<< Error no se ha podido crear el usuario" + ex.getMessage());
            return false;
        }
    }
    
    public boolean modificarUsuario(String id,String nom, String edad, String email, String password) {
        try {
            if (nom.equals("") || password.equals("") || edad.equals("") || email.equals("")) {
                return false;
            } else {
                int iId = Integer.parseInt(id);
                int iEdad = Integer.parseInt(edad);
                Usuario nuevoUsu = new Usuario(iId, nom, iEdad, email, password);
                bdUsu = new DerbyDBUsuario();
                boolean modificado = bdUsu.cambiarDatosDB(nuevoUsu);
                listaUsuarios = bdUsu.listar();
                return listaUsuarios != null && modificado;
            }
        } catch (Exception ex) {
            System.err.println("<< Error no se ha podido crear el usuario" + ex.getMessage());
            return false;
        }
    }

    public boolean validacionPasswd(String email, String passwd) {
        for (Usuario usu : listaUsuarios) {
            if (usu.getEmail().equals(email) && usu.getPassword().equals(passwd)) {
                return true;
            }
        }
        return false;
    }

    public int cantidadUsuarios() {
        return listaUsuarios.size();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public Usuario obtenerUno(String email){
        return bdUsu.obtenerUno(email);
    }
        
    public boolean eliminarUsuarios(String id) {
        
        if (id.equals("")) {
            return false;
        }else{
            int iId = Integer.parseInt(id);
            boolean eliminado = bdUsu.eliminar(iId);
            this.listaUsuarios = bdUsu.listar();
            return listaUsuarios != null && eliminado;
        }

    }

    public ArrayList<Usuario> listar() {
        return this.listaUsuarios;
    }
}
