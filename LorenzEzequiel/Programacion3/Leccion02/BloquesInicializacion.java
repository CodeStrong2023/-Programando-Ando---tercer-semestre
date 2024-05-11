package Emiliano_3er_sem.Java_3er_sem.Leccion02;

public class BloquesInicializacion {
    private final int idPersona;
    private static int contadorPersona;

    static{//Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++BloquesInicializacion.contadorPersona;
        //IdPersona = 10; No es estatico un atributo, por eso tenemos un error
    }

    {//Bloque de inicializacion NO estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = BloquesInicializacion.contadorPersona++;//Incrementamos el atributo
    }

    //Los bloques de inicializacion se ejecuta antes del contador

    public BloquesInicializacion(){
        System.out.println("Ejecucion del contructor");
    }

    public int getidPersona(){
        return this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona{"+ "IdPerosna= "+idPersona +"}";
    }
}
