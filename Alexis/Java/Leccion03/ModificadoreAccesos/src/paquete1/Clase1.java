
package paquete1;

public class Clase1 {
    public String atributoPulic = "valor atributo public";
    protected String atributoProtected = "ariel";
    
    public Clase1(){
        System.out.println("constructor public");
    }
    
    protected Clase1(String atributoPublic){
        System.out.println("costructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("metodo public");
    }
    
    protected void metodoProtected(){
        System.out.println("metodo protected");
    }
    
    
    
    
}
