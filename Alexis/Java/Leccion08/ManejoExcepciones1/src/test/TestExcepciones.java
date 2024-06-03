package test;

import aritmetica.Aritmetica;
import excepciones.OperacionException;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionException e){
            System.out.println("ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("ocurrio un error");
            e.printStackTrace(System.out);//se conoce como pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("se reviso la division entre cero");
        }
        System.out.println("la variable de resultado tiene como valor: "+ resultado);
    }
    
}
