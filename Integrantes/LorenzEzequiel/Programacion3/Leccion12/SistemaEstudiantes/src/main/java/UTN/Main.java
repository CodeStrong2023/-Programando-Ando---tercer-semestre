package UTN;

import java.sql.Connection;

public class Main {
    public static void main(String[] args){
        var conexion = Connection.getConnection();
        if(conexion != null)
            System.out.println("conexion exitosa: "+conexion);
        else
            System.out.println("error al conectarse");
    }//fin main
}//fin clase