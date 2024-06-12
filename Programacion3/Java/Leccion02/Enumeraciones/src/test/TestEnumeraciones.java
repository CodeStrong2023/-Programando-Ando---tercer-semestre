package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Día 1: " + Dias.LUNES);
        //indicarDiaSemana(Dias.LUNES); // Las enumeraciones se tratan como cadenas
        // No se utilizan comillas, se accede a través de el operador de punto.
        
        System.out.println("Continente No. 4: " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4to. Continente: "
                + Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to. Continente: "
                + Continentes.AMERICA.getHabitantes());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No es un día de la semana");
        }
    }
}
