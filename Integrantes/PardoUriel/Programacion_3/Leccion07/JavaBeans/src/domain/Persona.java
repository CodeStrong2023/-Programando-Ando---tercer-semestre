
package domain;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String appelido;
    
    // Constructor vacio (obligatorio para ser un javabeans)
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.appelido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", appelido=" + appelido + '}';
    }
}