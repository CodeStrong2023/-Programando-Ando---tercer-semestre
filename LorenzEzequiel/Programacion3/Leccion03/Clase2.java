package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class Clase2{
    String atributoDefault = "Valor del atributo default";

    /*Clase2(){
        System.out.println("Contructor default");
    }/**/

    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    
    void metodoDefault(){
        System.out.println("Metodo default");
    }
}
