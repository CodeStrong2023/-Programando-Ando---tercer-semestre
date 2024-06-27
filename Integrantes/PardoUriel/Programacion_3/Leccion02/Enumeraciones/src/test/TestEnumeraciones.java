package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES);
        
        System.out.println("Continente: "+Continentes.AMERICA);
        System.out.println("No. de paises: "+Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente: "+Continentes.AFRICA);
        System.out.println("No. de paises: "+Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.AFRICA.getHabitantes());
        
        System.out.println("Continente: "+Continentes.ASIA);
        System.out.println("No. de paises: "+Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente: "+Continentes.OCEANIA);
        System.out.println("No. de paises: "+Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.OCEANIA.getHabitantes());
        
        System.out.println("Continente: "+Continentes.EUROPA);
        System.out.println("No. de paises: "+Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.EUROPA.getHabitantes());
    }
    
    public static void indicarDiaSemana(Dias dias){
        switch(dias){
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
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
