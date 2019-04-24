package com.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {
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
                Usuario usu = new Usuario(id, nombre, edad, email, password);
                usuarios.add(usu);
            }

            return usuarios;
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return null;
        }
    }
    
    public Usuario obtenerUno(String email){
        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {
            String consulta = "SELECT id, nombre, edad, email, password FROM usuario where email = '" + email + "'";
            
            Statement sentencia = con.createStatement();
            ResultSet res = sentencia.executeQuery(consulta);
            Usuario usu = null;
            if (res.next()) {
                int id = res.getInt("id");
                String nom = res.getString("nombre");
                int edad = res.getInt("edad");
                String password = res.getString("password");
                return usu = new Usuario(id, nom, edad, email, password);
            }
        }catch(Exception ex){
            System.err.println(">>>>>" + ex.getMessage());
        }
        return null;
    }
    


    public boolean anadir(Usuario usu) {
        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {

            String insert = "INSERT INTO usuario (nombre, edad, email, password) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, usu.getNombre());
            st.setInt(2, usu.getEdad());
            st.setString(3, usu.getEmail());
            st.setString(4, usu.getPassword());
            st.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }

    public boolean cambiarDatosDB(Usuario usu) {
        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {

            String update = "UPDATE usuario SET nombre = ?, edad = ?,email = ? , password = ?, WHERE id = ?";

            PreparedStatement st = con.prepareStatement(update);
            st.setString(1, usu.getNombre());
            st.setInt(2, usu.getEdad());
            st.setString(3, usu.getEmail());
            st.setString(4, usu.getPassword());
            st.setInt(4, usu.getId());
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println(">>>>>> " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {

        try (Connection con = DriverManager.getConnection(Constantes.CONEX_DB, Constantes.USUARIO_DB, Constantes.PASSWORD_DB)) {

            String delete = "DELETE FROM USUARIO WHERE id = ?";
            
            PreparedStatement st = con.prepareStatement(delete);;
            st.setInt(1, id);
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.println(" >>>>> ERROR: al emilinar  " + ex.getMessage());

        }
        return false;
    }

}
