package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolvententes de tipo entero
            int = la clase envolvente es Integer
        */
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; //Tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue());//Autoboxing
        
        int entero2 = entero;
        System.out.println("entero2 = " + entero2); //Unboxing
    }
}
