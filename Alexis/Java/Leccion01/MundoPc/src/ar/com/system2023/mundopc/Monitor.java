package ar.com.system2023.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitor= ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamaño){
        this(); //llamado al constructor vacio
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    //ingrasamos manualmente el gutIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
