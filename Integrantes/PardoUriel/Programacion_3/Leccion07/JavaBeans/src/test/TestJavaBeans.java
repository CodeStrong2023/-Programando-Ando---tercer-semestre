package test;

import domain.*;

public class TestJavaBeans {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setAppelido("Perez");
        System.out.println("persona = " + persona);

        System.out.println("Persona nombre: " + persona.getNombre());
        System.out.println("Persona apellido: " + persona.getAppelido());
    }
}