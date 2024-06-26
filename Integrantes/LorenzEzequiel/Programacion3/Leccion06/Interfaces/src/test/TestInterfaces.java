package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        //imprimir(datos);
        datos = new ImpleamentacionOracle();
        //datos.listar();
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
