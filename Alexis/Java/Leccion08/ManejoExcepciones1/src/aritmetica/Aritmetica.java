
package aritmetica;

import excepciones.OperacionException;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador ==0){
            throw new OperacionException("division entre cero");
        }
        return numerador / denominador;
    }
}
