package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // Bloque de inicialización estático
    static{
        System.out.println("Ejecución del bloque estático");
        ++Persona.contadorPersonas;
        // idPersona = 10; No es un atributo estático, error
    }
    
    // Bloque de inicialización NO estático (contexto dinámico)
    {
        System.out.println("Ejecución del bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; // Incrementamos el atributo
    }
    
    // Los bloques de inicialización se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}