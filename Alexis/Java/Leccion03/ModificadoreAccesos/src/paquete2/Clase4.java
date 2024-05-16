
package paquete2;

public class Clase4 {
    private String atributoPrivate = "atributo privado";
    
    private Clase4(){
        System.out.println("constructor privado");
    }
    
    //creamos un costructor public
    public Clase4(String argumento){// aqui se puede llamar al constructor vacio
        this();
        System.out.println("constructor public");
    }
    
    //metodo private
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
    
}
