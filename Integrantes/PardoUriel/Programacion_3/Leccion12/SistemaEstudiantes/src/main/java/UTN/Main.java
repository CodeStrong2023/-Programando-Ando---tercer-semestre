package UTN;

import UTN.conexion.Conexion;

public class Main {
    public static void main(String[] args) {
        var conexion = new Conexion().getConnection();
        if (conexion != null) {
            System.out.println("Conexion establecida: "+conexion);
        }
        else
            System.out.println("No se puede establecer conexion");
    }
}