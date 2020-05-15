/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.OperacionesUsuario;
import dto.Usuario;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author mbarbosa
 */
@ManagedBean
@ViewScoped
public class beanListarUsuario {
    
    private List<Usuario> usuario;
    private OperacionesUsuario oper;

    public beanListarUsuario() {
        oper = new OperacionesUsuario();
        Map session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        Usuario usu = (Usuario)session.get("usuario");
        System.out.println("Username: "+usu.getUsername()+ ". Sexo: "+usu.getSexo());
    }
    
    @PostConstruct
    public void init() {
        //usuario = cargarUsu();
    }
    
    public String regresar(){
       return "Vehiculo";
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    public void setOper(OperacionesUsuario oper) {
        this.oper = oper;
    }
    
    private Usuario cargarUsu() {
      //return oper.consultar();
        return null;
   }
    
}
