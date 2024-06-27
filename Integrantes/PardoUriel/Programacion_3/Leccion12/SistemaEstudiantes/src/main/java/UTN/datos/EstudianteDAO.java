package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metodo listar
    public List<Estudiante> listar() {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        //Creamos objetos necesarios para comunicar la BD
        PreparedStatement ps = null;//Envia la sentencia a la BD
        ResultSet rs = null;//Obtiene el resultado de la BD
        //Creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes ORDER BY estudiantes2023";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes"));
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar datos "+e.getMessage());
        }
    }
}
