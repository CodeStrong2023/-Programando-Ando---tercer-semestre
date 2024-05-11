package Emiliano_3er_sem.Java_3er_sem.Leccion02;

import Emiliano_3er_sem.Java_3er_sem.Leccion02.Enumeraciones;

public class testEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Enumeraciones.LUNES);
        indicarDiaSemana(Enumeraciones.LUNES);
        System.out.println("Continentes No. 4: "+Continentes.AMERICA);
        System.out.println("No. de paises: "+Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Enumeraciones dias){
        switch (dias) {
            case LUNES:
                    System.out.println("Primer dia de la semana");
            break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
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
            case DOMINDO:
                System.out.println("Septimo dia de la semana");
            break;
            default:
                System.out.println("Valor ingresado incorrecto");
        }
    }
}
