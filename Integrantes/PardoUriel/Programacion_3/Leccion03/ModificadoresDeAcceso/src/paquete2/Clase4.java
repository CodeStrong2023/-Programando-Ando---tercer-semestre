package paquete2;

public class Clase4 {
    private String atributoPrivate = "atributo Privado";
    
    
    private Clase4(){
        System.out.println("Cinstructor privado");
    }
    //Creamos un constructor public para poder crear objetos
    public Clase4(String aumento){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
