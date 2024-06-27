import java.util.Scanner;
public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ //ciclo infinito
            System.out.println("******* Aplicacion calculadora *******");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, entrada);
                } // fin del ciclo if
                else if (operacion == 5) {
                    System.out.println("hasta pronto...");
                    break; //rompe el ciclo y sale
                } else {
                    System.out.println("opcion erronea: " + operacion);
                }
                // imprimimos un salto de linea antes de repetir el menu
                System.out.println();
            }catch (Exception e){ //fin try, cominezo catch
                System.out.println("ocurrio un error: "+e.getMessage());
            }
        } //fin while
    } // fin main

    private static void mostrarMenu(){
        //mostramos el menu
        System.out.println("""
                    1. suma
                    2. resta
                    3. multiplicacion
                    4. division
                    5. salir
                    """);
        System.out.print("operacion a realizar: ");
    } // fin metodo mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("digite el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("digite el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> { //suma
                resultado = operando1 + operando2;
                System.out.println("resultado de la suma: " + resultado);
            }
            case 2 -> { //resta
                resultado = operando1 - operando2;
                System.out.println("resultado de la resta: " + resultado);
            }
            case 3 -> { //multiplicacion
                resultado = operando1 * operando2;
                System.out.println("resultado de la multiplicacion: " + resultado);
            }
            case 4 -> { //division
                resultado = operando1 / operando2;
                System.out.println("resultado de la division: " + resultado);
            }
            default -> System.out.println("opcion erronea: " + operacion);
        } // fin switch
    } // fin metodo ejecutarOperacion


} // fin clase
