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
public class Pokemon {
    private String nombre;
    private String tipo;
    private String sexo;
    private String habilidades;
    private String fortalizas;
    private String debilidades;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, String sexo, String habilidades, String fortalizas, String debilidades) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sexo = sexo;
        this.habilidades = habilidades;
        this.fortalizas = fortalizas;
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getFortalizas() {
        return fortalizas;
    }

    public void setFortalizas(String fortalizas) {
        this.fortalizas = fortalizas;
    }

    public String getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String debilidades) {
        this.debilidades = debilidades;
    }
    
    
}
