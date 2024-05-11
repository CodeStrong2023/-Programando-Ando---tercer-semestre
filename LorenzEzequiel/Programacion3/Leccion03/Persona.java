package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }


    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Persona{ " + "nombre=" + nombre + "}";
    }
}
