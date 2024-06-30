package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {

    public static void main(String[] args) {
        // Objeto 1
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        // Objeto 2
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden(); // Inicializamos el arreglo vacio
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Computadora computadoraVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoGamer, ratonGamer);
        Orden orden2 = new Orden(); // Nueva lista para el objeto orden2
        orden2.agregarComputadora(computadoraVarias);
        orden2.mostrarOrden();

        // Crear mas objetos de tipo computadora con todos sus elementos
        // Completar una lista en el objeto orden1 que llegue a los 10 elementos.
        
        // Objeto 3
        Monitor monitorDell = new Monitor("Dell", 24);
        Teclado tecladoDell = new Teclado("Cableado", "Dell");
        Raton ratonDell = new Raton("Cableado", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        // Objeto 4
        Monitor monitorApple = new Monitor("Apple", 27);
        Teclado tecladoApple = new Teclado("Inalámbrico", "Apple");
        Raton ratonApple = new Raton("Inalámbrico", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);

        // Objeto 5
        Monitor monitorSamsung = new Monitor("Samsung", 21);
        Teclado tecladoSamsung = new Teclado("Bluetooth", "Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);

        // Objeto 6
        Monitor monitorAsus = new Monitor("Asus", 28);
        Teclado tecladoAsus = new Teclado("Inalámbrico", "Asus");
        Raton ratonAsus = new Raton("Inalámbrico", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);

        // Objeto 7
        Monitor monitorLG = new Monitor("LG", 29);
        Teclado tecladoLG = new Teclado("Cableado", "LG");
        Raton ratonLG = new Raton("Cableado", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);

        // Objeto 8
        Monitor monitorLenovo = new Monitor("Lenovo", 23);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        // Objeto 9
        Monitor monitorAcer = new Monitor("Acer", 30);
        Teclado tecladoAcer = new Teclado("Inalámbrico", "Acer");
        Raton ratonAcer = new Raton("Inalámbrico", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);

        // Objeto 10
        Monitor monitorMSI = new Monitor("MSI", 34);
        Teclado tecladoMSI = new Teclado("Cableado", "MSI");
        Raton ratonMSI = new Raton("Cableado", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);
        
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraLG);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraMSI);
        
        orden1.mostrarOrden();
    }
}
