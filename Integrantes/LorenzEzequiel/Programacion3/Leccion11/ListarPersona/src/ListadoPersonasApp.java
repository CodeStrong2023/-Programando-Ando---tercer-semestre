
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // empezamos con el menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            try {
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        } //fin ciclo while
    }// fin metodo main

    private static void mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ******* Listado de personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("digite una de las opciones: ");
    }// fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //revisamos la opcion digita a tarvez de un switch
        switch (opcion){
            case 1 -> { //agregar una persona a la lista
                System.out.print("dijite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("dijite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("dijite el correo: ");
                var email = entrada.nextLine();
                //creamos el objeto Persona
                var persona = new Persona(nombre, tel, email);
                //agregamos la persona a la lista
                personas.add(persona);
                System.out.println("la lista tiene: "+personas.size()+" elementos");
            }//fin caso 1
            case 2 -> {// listar a las personas
                System.out.println("listado de personas: ");
                //mejoras con lambda y el metodo de refencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            } //fin caso 2
            case 3 -> { //fin del ciclo
                System.out.println("hasta pronto...");
                salir = true;
            }// fin caso 3
            default -> System.out.println("opcion incorrecta "+opcion);
        }// fin del switch
        return salir;
    }// fin del metodo ejecutarOperacion
}// fin de la clase ListadoPersonasApp