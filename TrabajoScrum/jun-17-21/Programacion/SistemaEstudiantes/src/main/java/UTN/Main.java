package UTN;

import UTN.conexion.Conexion;

public class Main {
    public static void main(String[] args){
        var conexion = Conexion.getConnection();
        if(conexion != null)
            System.out.println("conexion exitosa: "+conexion);
        else
            System.out.println("error al conectarse");
    }//fin main
}//fin clase