
package domain;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departemento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //sobreescribimos el metodo
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle()+", departemento: "+this.departamento;
    }
    
    
    
    
    
    
    
}
