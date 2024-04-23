
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{ //bloque de inicializcion estatico
        System.out.println("ejecucion del bloque estatico");
        ++Persona.contadorPersona;
        // idPersoba = 10; no es un atributo estatico por eso tenemos un error
    }
    
    { //bloque de inicializacion NO estatico (contexto dinamico)
        System.out.println("ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersona++; //increentams el atributo
    }
    
    //los bloques de inicializacion se ejecutan antes del contructor
    
    public Persona(){
        System.out.println("ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
    
    
    
    
}
