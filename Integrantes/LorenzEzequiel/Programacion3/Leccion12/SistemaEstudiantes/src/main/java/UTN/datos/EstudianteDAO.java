package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //metodo listar
    public List<Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //creamos algunos objetosque son necesarios para comunicarnoscon la base de datos
        PreparedStatement ps; //envia la sentencia a la base de datos
        ResultSet rs; //obtenemos el resultado de la base de datos
        //creamos un objeto de tipo conexion
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
                //falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        }catch (Exception e){
            System.out.println("ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("ocurrio un error al cerrar la conexion: "+e.getMessage());
            }
        }// fin finally
        return estudiantes;
    }//fin metodo listar

    //metodo porid -> fin by id
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
                return true; //se encontro un registro
            }//fin if
        }catch (Exception e){
            System.out.println("ocurrio un error al buscar estudiante: "+e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("ocurrio un error al cerrar conexion: "+e.getMessage());
            }//fin catch
        }// fin finally
        return false;
    }

    //metodo agregar un nuevo estudiante
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
            System.out.println("ocurrio un error al agregar estudiante: "+e.getMessage());
        }// fin catch
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }//fin catch
        }// fin finally
        return false;
    }// fin metodo agregarEstudiante

    //metodo para modificar estudiante
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
            System.out.println("error al modificar estudiante: "+e.getMessage());
        }//fin catch
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("error al cerrar la conexion: "+e.getMessage());
            }//fin catch
        }//fin finally
        return false;
    }// fin metodo modificarEstudiante

    public static void main(String[] args) {
        var estudianteDAO = new EstudianteDAO();
        //modificarestudiante
        var estudianteModificado = new Estudiante(1, "juan carlos", "juarez", "823599863", "juenQmail.com");
        var modificado = estudianteDAO.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("estudiante modificado: "+estudianteModificado);
        else
            System.out.println("no se modifico el estudiante: "+estudianteModificado);


        //listar los estudiantes
        System.out.println("listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDAO.listar();
        estudiantes.forEach(System.out::println);//funcion lambda para imprimir

        //agregar estudiante
        var nuevoEstudiante = new Estudiante("carlos", "lara", "582367458", "carlosl@mail.com");
        var agregado = estudianteDAO.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("no se ha agregado estudiante: "+nuevoEstudiante);

        //buscar por id
        var estudiante1 = new Estudiante(1);
        System.out.println("Estudiantes antes de labusqueda: "+estudiante1);
        var encintrado = estudianteDAO.buscaretudiantePorId(estudiante1);
        if(encintrado)
            System.out.println("estudiante escontrado: "+estudiante1);
        else System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());
    }

}
