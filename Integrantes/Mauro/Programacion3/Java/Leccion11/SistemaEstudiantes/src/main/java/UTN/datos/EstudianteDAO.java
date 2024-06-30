package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // Método listar
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();

        // Creamos algunos objetos que son necesarios para comunicarnos con la bd
        PreparedStatement ps; // Envia la sentencia a la bd
        ResultSet rs; // Obtenemos el resultado de la bd

        // Creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrió un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return estudiantes;
    }

    // Método Porid = fin by id
    public boolean buscaretudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; // Se encontro un registro
            }
        }catch (Exception e){
            System.out.println("Ocurrió un error al buscar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrió un error al cerrar conexion: "+e.getMessage());
            }
        }
        return false;
    }

    // Método para agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Ocurrió un error al agregar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    // Método para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiante2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes =?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var estudianteDAO = new EstudianteDAO();
        // Modificar Estudiante
        var estudianteModificado = new Estudiante(1, "juan carlos", "juarez", "823599863", "juenQmail.com");
        var modificado = estudianteDAO.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("estudiante modificado: "+estudianteModificado);
        else
            System.out.println("no se modifico el estudiante: "+estudianteModificado);


        // Listar los Estudiantes
        System.out.println("listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listar();
        estudiantes.forEach(System.out::println);//funcion lambda para imprimir

        // Agregar Estudiante
        var nuevoEstudiante = new Estudiante("carlos", "lara", "582367458", "carlosl@mail.com");
        var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("no se ha agregado estudiante: "+nuevoEstudiante);

        // Buscar Estudiante por ID
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de labusqueda: "+estudiante1);
        var encintrado = estudianteDAO.buscaretudiantePorId(estudiante1);
        if(encintrado)
            System.out.println("estudiante escontrado: "+estudiante1);
        else System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());
    }

}
