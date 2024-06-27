import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definimos la lista fuera del menu
        List<Persona> personas = new ArrayList<Persona>();
        //Empezamos con el menu
        var salir = false;
        while(!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(sc, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: " +e.getMessage());
            }
            System.out.println();
        }//fin del ciclo while
    }//fin metodo main

    private static void mostrarMenu() {
        //Mostramos las opciones
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Eliminar
                3. Salir
                """);
        System.out.println("Digite una de las opciones: ");
    }//Fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner sc, List<Persona> personas) {
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;
        //Revisamos la opcion digitada a traves de un switch
        switch (opcion) {
            case 1 -> {//Agregar una persona a la lista
                System.out.print("Digite el nombre: ");
                var nombre = sc.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = sc.nextLine();
                System.out.print("Digite el correo: ");
                var email = sc.nextLine();
                //creamos el objeto Persona
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+ personas.size()+" elementos");
            }//Fin caso 1
            case 2 -> {//Listar a las personas
                System.out.println("Listado de personas: ");
                //Mejoras con lambda y el metodo de referencia
                //personas.forEach(persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }//Fin caso 2
            case 3 -> {
                System.out.println("Hasta Pronto...");
                salir = true;
            }//Fin caso 3
            default -> System.out.println("Opcion invalida "+opcion);
        }//Fin del switch
        return salir;
    }//Fin del metodo ejecutarOperacion

}//Fin de la clase ListadoPersonasApp