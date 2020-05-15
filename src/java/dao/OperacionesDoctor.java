/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author mbarbosa
 */
public class OperacionesDoctor {
    
    public void consultar(){
        AdmConexion c = new AdmConexion();
        Connection con = c.getConnection();
    }
    
}
