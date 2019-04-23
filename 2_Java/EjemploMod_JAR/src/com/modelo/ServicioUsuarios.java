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

    public boolean addUsuario(String nom, String password, int edad, String email) {
        Usuario nuevoUsu = new Usuario(nom, password, edad, email);
        this.listaUsuarios.add(nuevoUsu);
        bdUsu = new DerbyDBUsuario();
        bdUsu.anadir(nuevoUsu);
        return true;
    }

    public boolean validacionPasswd(String email, String passwd) {
        for (Usuario usu : listaUsuarios) {
            if (usu.getEmail().equals(email) && usu.getPassword().equals(passwd)) {
                return true;
            }
        }
        return false;
    }

    public boolean cambiarDatos(Usuario usu) {
        int pos = 0;
        if (bdUsu.cambiarDatosDB(usu)) {
            
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getEmail().equals(usu.getEmail())) {
                    pos = i;
                    break;
                }
            }
            listaUsuarios.set(pos, usu);
            //listaUsuarios.clear();
            //this.listaUsuarios = bdUsu.listar();
            return true;
        } else {
            return false;
        }
    }

    public int cantidadUsuarios() {
        return listaUsuarios.size();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    

    
    public boolean eliminarUsuarios(Usuario usu) {
        
        return bdUsu.eliminar(usu);
           
    }
    
    public ArrayList<Usuario> listar(){
        return this.listaUsuarios;
    }
}
