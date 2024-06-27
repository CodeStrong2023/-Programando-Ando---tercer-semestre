package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{//Bloque de inicializacion estatico. Se ejecuta una sola vez al crear el objeto
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {//Bloque de inicializacion NO estatico (contexto dinamico
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //Los bloques de inicializacion se ejecutan antes del constructor.
    
    
    public Persona(){
        System.out.println("Esta es la ejecucion del constructor");
        
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{ " + "idPersona= " + idPersona + '}';
    }
    
    
}
