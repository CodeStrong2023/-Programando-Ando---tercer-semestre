package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificacion  del atributo default";
        System.out.println("atrubutoDefault = "+ this.atributoDefault);
        this.metodoDefault();
    }
}
