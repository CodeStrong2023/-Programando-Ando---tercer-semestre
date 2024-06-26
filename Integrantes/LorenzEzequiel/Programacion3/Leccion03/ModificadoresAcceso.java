package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class ModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 ="+clase1.atributoPublic);
        clase1.metodoPublico(); 
        Clase3 claseHija = new Clase3();
        System.out.println("Clase hija: "+claseHija);
    }
}
