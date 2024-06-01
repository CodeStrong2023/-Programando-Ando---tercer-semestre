package Emiliano_3er_sem.Java_3er_sem.Leccion02;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 7);
        imprimirNumeros(2, 6);
        variosParametros("Juan","Perez", 2, 4, 6);
    }

    private static void variosParametros(String nombre,String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int ...numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elementos: "+numeros[i]);
        }
    }
}
