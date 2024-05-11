package Emiliano_3er_sem.Java_3er_sem.Leccion03;

public class autoBoxingUnBoxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
         Clases envolventes de tipo primitivos
         int = la clase envolvente es Integer
         long = la clase envolvente es Long
         float = la clase envolvente es Float
         double = la clase envolvente es Double
         boolean = la clase envolvente es Boolean
         byte = la clase envolvente en Byte
         char = la clase envolvente en Character
         short = la clase envolvente es Short
         */

        int enteroPrim = 10;//Tipo primitivo
        System.out.println("EnteroPrim = "+enteroPrim);
        Integer entero = 10;//Tipo object con la clase Integer
        System.out.println("Entero = "+entero.doubleValue());//Autoboxing

        int entero2 = entero; //Unboxing
        System.out.println("entero2 = "+entero2);
        
    }
}
