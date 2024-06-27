package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        //Creamos on¿bjetos necesarios para conectar a la BD
        PreparedStatement ps = null;//Envia la sentencia  a la BD
        ResultSet rs = null;//Obtenemos el resultado de la BD
        //Creamos objeto tipo Connection
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2023 ORDER BY idestudiantes";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                var estudiante = new Estudiante();
                //Obtenemos los valores de cada columna
                estudiante.setIdEstudiante(rs.getInt("idestudiantes"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }//Fin finally
        return estudiantes;
    }//Fin listar

    //Metodo por id-> find by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2023 WHERE idestudiantes = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }//Fin if
        }
        catch (Exception e){
            System.out.println("Ocurrio un error al buscar estudiante: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }

        return false;
    }

    //Metodo agregar nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2023 (nombre, apellido, telefono, email) VALUES(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al agregar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }//Fin metodo agregar estudiante

    //Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2023 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e){
            System.out.println("Error al modificar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }
            catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var estudianteDAO = new EstudianteDAO();

        //Modificar estudiantes
        var estudanteModificado = new Estudiante(3, "Maximo Decimo", "Meridio", "25252525", "mdmeridio@email.com");
        var modificado = estudianteDAO.modificarEstudiante(estudanteModificado);
        if(modificado){
            System.out.println("Estudiante modificado: "+estudanteModificado);
        } else{
            System.out.println("No se modifico el estudiante: "+estudanteModificado);
        }

        //Agregar estudiantes
        /*var nuevoEstudiante = new Estudiante("Gabriela", "Zapata", "21212121", "gzapata@email.com");
        var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        if(agregado){
            System.out.println("Estudiante agregado: "+nuevoEstudiante);
        }
        else{
            System.out.println("No se ha agregado un nuevo estudiante: "+nuevoEstudiante);
        }*/

        //Listar estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println);//funcion lambda para imprimir




        //Buscar por id
        /*var estudiante1 = new Estudiante(2);
        System.out.println("Estudiantes antes de la busqueda: "+estudiante1);
        var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante1);
        if(encontrado){
            System.out.println("Estudiante encontrado: "+estudiante1);
        }
        else
            System.out.println("No se encontro al estudiante: "+estudiante1.getIdEstudiante());*/
    }
}
