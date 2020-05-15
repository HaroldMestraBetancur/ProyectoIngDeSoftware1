/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author mbarbosa
 */
public class Cita {
    
    private Doctor doctor;
    private Usuario usuario;
    private String fecha;
    private String sentimientosAngustia; 
    private String estresLaboral;
    private String inconformidadLaboral;
    private String depresionLaboral;
    private String memoriaCita; 
    private String comentariosDoctor;
    private String estado; 

    public Cita() {
    }

    public Cita(Doctor doctor, Usuario usuario, String fecha, String sentimientosAngustia, String estresLaboral, String inconformidadLaboral, String depresionLaboral, String memoriaCita, String comentariosDoctor, String estado) {
        this.doctor = doctor;
        this.usuario = usuario;
        this.fecha = fecha;
        this.sentimientosAngustia = sentimientosAngustia;
        this.estresLaboral = estresLaboral;
        this.inconformidadLaboral = inconformidadLaboral;
        this.depresionLaboral = depresionLaboral;
        this.memoriaCita = memoriaCita;
        this.comentariosDoctor = comentariosDoctor;
        this.estado = estado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSentimientosAngustia() {
        return sentimientosAngustia;
    }

    public void setSentimientosAngustia(String sentimientosAngustia) {
        this.sentimientosAngustia = sentimientosAngustia;
    }

    public String getEstresLaboral() {
        return estresLaboral;
    }

    public void setEstresLaboral(String estresLaboral) {
        this.estresLaboral = estresLaboral;
    }

    public String getInconformidadLaboral() {
        return inconformidadLaboral;
    }

    public void setInconformidadLaboral(String inconformidadLaboral) {
        this.inconformidadLaboral = inconformidadLaboral;
    }

    public String getDepresionLaboral() {
        return depresionLaboral;
    }

    public void setDepresionLaboral(String depresionLaboral) {
        this.depresionLaboral = depresionLaboral;
    }

    public String getMemoriaCita() {
        return memoriaCita;
    }

    public void setMemoriaCita(String memoriaCita) {
        this.memoriaCita = memoriaCita;
    }

    public String getComentariosDoctor() {
        return comentariosDoctor;
    }

    public void setComentariosDoctor(String comentariosDoctor) {
        this.comentariosDoctor = comentariosDoctor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
