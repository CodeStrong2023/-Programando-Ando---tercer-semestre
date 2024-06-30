package UTN;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        var conexion = Connection.getConnection();
        if(conexion != null)
            System.out.println("Conexión exitosa: "+conexion);
        else
            System.out.println("Error al Conectarse!");
    }
}