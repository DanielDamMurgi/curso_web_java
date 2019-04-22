package com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formacion
 */
public class DerbyDBUsuario {

    public DerbyDBUsuario() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (Exception ex) {
            Logger.getLogger(DerbyDBUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuario> listar() {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")) {
            ArrayList<Usuario> usuarios = new ArrayList<>();
            String consulta = "SELECT id, nombre, edad, email, password FROM usuario";
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consulta);
            while (res.next()) {
                int id = res.getInt("id");
                String nombre = res.getString("nombre");
                String email = res.getString("email");
                int edad = res.getInt("edad");
                String password = res.getString("password");
                Usuario usu = new Usuario(nombre, password, edad, email);
                usuarios.add(usu);
            }

            return usuarios;
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return null;
        }
    }

    public boolean anadir(Usuario usu) {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")) {
            String sqlId = "SELECT COUNT(id) AS ultId FROM usuario";

            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(sqlId);
            
            if (res.next()) {
                int ultId = res.getInt("ultId");
                ultId++;
                String insert = "INSERT INTO usuario (id, nombre, email, password, edad) "
                        + "VALUES (" + ultId + ", '" + usu.getNombre() + "', '" + usu.getEmail() + "', '" + usu.getPassword() + "', " + usu.getEdad() + ")";
                
                sentencia = con.createStatement();
                sentencia.executeUpdate(insert);
            }

          return true;
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }
}