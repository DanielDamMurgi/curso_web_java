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
                String password = res.getString("password");
                int edad = res.getInt("edad");
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

    public boolean cambiarDatosDB(Usuario usu) {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")) {

            String email = "SELECT email FROM usuario where email = '" + usu.getEmail() + "'";

            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(email);

            if (res.next()) {
                String update = "UPDATE usuario SET "
                        + "password = '" + usu.getPassword() + "', edad = " + usu.getEdad() + ", nombre = '" + usu.getNombre() + "' "
                        + "WHERE email = '" + usu.getEmail() + "'";
                sentencia.executeUpdate(update);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminar(Usuario persona) {

        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/UsuariosVNext", "administrador", "1234")) {

            String sqlID = "SELECT EMAIL, PASSWORD FROM Usuario WHERE EMAIL = '" + persona.getEmail() + "' AND PASSWORD = '" + persona.getPassword() + "'";
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery(sqlID);

            if (res.next()) {
                String sqlInsert = "DELETE FROM USUARIO WHERE EMAIL = '" + persona.getEmail() + "'";

                System.out.println(" >>>>  Se ha Eliminado el usuario correctamente");
                s = con.createStatement();
                s.executeUpdate(sqlInsert);
                return true;
            } else {
                return false;

            }

        } catch (SQLException ex) {
            System.err.println(" >>>>> ERROR: al emilinar  " + ex.getMessage());

        }
        return false;
    }

}
