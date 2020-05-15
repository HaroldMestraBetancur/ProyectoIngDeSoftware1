/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mbarbosa
 */
public class OperacionesUsuario {
    
    public int insertar(Usuario dato){
        AdmConexion c = new AdmConexion();
        Connection con = c.getConnection();
        if (con!= null){
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("INSERT INTO Usuario(Username, Password, Sexo)VALUES (?, ?, ?)");
            ps.setString(1, dato.getUsername());
            ps.setString(2, dato.getPassword());
            ps.setString(3, dato.getSexo());
            
            return ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(OperacionesUsuario.class.getName()).log(Level.SEVERE, "Error al insertar vehiculo", ex);
            }finally{
                c.cerrarConnexion(con);
            }
        }
        return 0;
        
    }
    
    public Usuario consultar(Usuario usuario){
        AdmConexion c = new AdmConexion();
        Connection con = c.getConnection();
        
        try {
            PreparedStatement ps=con.prepareStatement("SELECT Username, Sexo FROM usuario where username = ?");
            ps.setString(1, usuario.getUsername());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 usuario.setUsername(rs.getString(1));
                 usuario.setSexo(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            c.cerrarConnexion(con);
        }
        return usuario;
    }
    
}
