package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class ForEach{

    public static void main(String[] args) {
        int edades[] = {0,1,2,3};
        for(int edad: edades){//Sintaxis del Foreach
            System.out.println("Edad: "+edad);
        }

        Persona personas[] = {new Persona("Juan"), new  Persona("Romina"), new  Persona("Ramon")};

        //FprEach
        for(Persona persona: personas){
            System.out.println("persona= "+persona);
        }
    }
}