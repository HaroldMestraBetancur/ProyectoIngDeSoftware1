/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author mbarbosa
 */
public class Usuario {
    
    private String username; 
    private String password;
    private String sexo; 

    public Usuario() {
    }

    public Usuario(String username, String password, String sexo) {
        this.username = username;
        this.password = password;
        this.sexo = sexo;
    }

    public Usuario(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String usuario) {
        this.username = usuario;
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
    
}
