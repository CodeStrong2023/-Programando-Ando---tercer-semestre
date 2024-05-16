
package paquete1;

public class Clase2 extends Clase1{
    String atributoDefault = "valor de atributo default";
    
//    Clase2(){
//        System.out.println("constructor default");
//    }
    
    public Clase2(){
        super();
        this.atributoDefault = "modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("metodo default");
    }
    
    
    
}
