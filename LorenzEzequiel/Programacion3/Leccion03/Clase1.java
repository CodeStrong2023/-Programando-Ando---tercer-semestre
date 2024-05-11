package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class Clase1 {
    public String atributoPublic = "Valor atributo public"; 
    protected String atributoProtected = "valor atributo protected";

    public Clase1(){
        System.out.println("Contructor public");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }

    public void metodoPublico(){
        System.out.println("Metodo public");
    }

    public void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
