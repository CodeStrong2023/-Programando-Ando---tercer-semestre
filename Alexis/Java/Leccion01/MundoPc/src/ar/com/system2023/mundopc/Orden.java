package ar.com.system2023.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[]; //arreglo de objetos
    private static int computadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.computadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //metodo para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("has superado el limite: "+Orden.MAX_COMPUTADORAS);
        }
    }
    
    //mostrar orden
    public void mostrarOrden(){
        System.out.println("orden #"+this.idOrden);
        System.out.println("computadoras de la orden #: "+this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
    
    
    
    
    
}
