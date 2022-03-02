/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Laura Trujillo
 */
public class Entrenador {
    private String usuario;
    private String contraseña;
    private String region;

    public Entrenador() {
    }

    public Entrenador(String usuario, String contraseña, String region) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.region = region;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    
    
}
