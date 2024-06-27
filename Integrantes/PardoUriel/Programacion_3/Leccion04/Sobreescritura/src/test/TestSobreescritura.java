package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Uriel", 900000);
        imprimir(empleado1);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        Gerente gerente1 = new Gerente("Pedro", 640000, "Personal y sala");
        imprimir(gerente1);
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
