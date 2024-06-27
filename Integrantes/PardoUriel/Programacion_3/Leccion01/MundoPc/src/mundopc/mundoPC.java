package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Monitor monitorAsus = new Monitor("Asus", 27);
        Teclado tecladoAsus = new Teclado("Cableado", "Asus");
        Raton ratonAsus = new Raton("Cableado", "Asus");
        Computadora computadoraAsus = new Computadora("ComputadoraAsus", monitorAsus, tecladoAsus, ratonAsus);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("ComputadoraLenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorBangho = new Monitor("Bangho", 35);
        Teclado tecladoBangho = new Teclado("Cableado", "Bangho");
        Raton ratonBangho = new Raton("Cableado", "Bangho");
        Computadora computadoraBangho = new Computadora("ComputadoraBangho", monitorBangho, tecladoBangho, ratonBangho);
        
        Monitor monitorApple = new Monitor("Apple", 32);
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Computadora computadoraApple = new Computadora("ComputadoraApple", monitorApple, tecladoApple, ratonApple);
        
        Monitor monitorAcer = new Monitor("Acer", 40);
        Teclado tecladoAcer = new Teclado("Cableado", "Acer");
        Raton ratonAcer = new Raton("Cableado", "Acer");
        Computadora computadoraAcer = new Computadora("ComputadoraAcer", monitorAcer, tecladoAcer, ratonAcer);
        
        Monitor monitorRazer = new Monitor("Razer", 41);
        Teclado tecladoRazer = new Teclado("Bluetooth", "Razer");
        Raton ratonRazer = new Raton("Bluetooth", "Razer");
        Computadora computadoraRazer = new Computadora("ComputadoraRazer", monitorRazer, tecladoRazer, ratonRazer);
        
        Monitor monitorDell = new Monitor("Dell", 28);
        Teclado tecladoDell = new Teclado("Cableado", "Dell");
        Raton ratonDell = new Raton("Cableado", "Dell");
        Computadora computadoraDell = new Computadora("ComputadoraDell", monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorMSI = new Monitor("MSI", 34);
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");
        Computadora computadoraMSI = new Computadora("ComputadoraMSI", monitorMSI, tecladoMSI, ratonMSI);
        
        Computadora computadoraFrankenstein = new Computadora("Computadora Frankenstein", monitorAcer, tecladoApple, ratonRazer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraAcer);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraBangho);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraFrankenstein);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraMSI);
        orden1.agregarComputadora(computadoraRazer);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraAsus);
        orden2.agregarComputadora(computadoraRazer);
        orden2.mostrarOrden();
        
    }
}
