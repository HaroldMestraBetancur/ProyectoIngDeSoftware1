/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.OperacionesUsuario;
import dto.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mbarbosa
 */
@ManagedBean
@ViewScoped
public class beanInsertarUsuario implements Serializable{
    
    private String username; 
    private String password;
    private String sexo; 

    public beanInsertarUsuario() {
    }
    
     public void insertar (){
        if (username == null || username.isEmpty() || password == null || password.isEmpty() || sexo == null || sexo.isEmpty()){
            System.out.println("- -- - - null");
            return ;
        }
        Usuario u = new Usuario();
        u.setUsername(username);
        u.setPassword(password);
        u.setSexo(sexo);
        
        OperacionesUsuario oper = new OperacionesUsuario();
        int rta = oper.insertar(u);
        System.out.println("rta "+rta);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String salir(){
       return "index";
    }
    
}
