package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Uriel", 900000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Pedro", 640000, "Personal y sala");
        //determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //((Gerente) empleado).getDepartamento();
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if( empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
