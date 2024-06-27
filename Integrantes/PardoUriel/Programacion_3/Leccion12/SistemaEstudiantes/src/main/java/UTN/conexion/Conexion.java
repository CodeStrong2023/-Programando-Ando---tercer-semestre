package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
        Connection conexion = null;
        //Variables para conectarnos a la base de datos
        var baseDatos = "estudiantes2023";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var pasword = "admin";

        //Cargamos la clase del driver de mysql en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, pasword);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error al conectar con la base de datos: " + e.getMessage());
        } //fin catch
        return conexion;
    }//fin metodo Connection
}
