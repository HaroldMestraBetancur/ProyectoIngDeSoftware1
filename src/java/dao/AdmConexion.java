/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbarbosa
 */
public class AdmConexion {
    
    public AdmConexion() { 
    }
     public Connection getConnection()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://bdingenieria.ca4fziayudme.eu-west-2.rds.amazonaws.com:3306/EMOCIONAL", "desarollo", "desarollo");
            return c;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmConexion.class.getName()).log(Level.SEVERE, "Error en la conexion", ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void cerrarConnexion(Connection con){
         try {
             con.close();
         } catch (SQLException ex) {
              Logger.getLogger(AdmConexion.class.getName()).log(Level.SEVERE, "Error al cerrar la conexion", ex);
         }
    }
    
}
