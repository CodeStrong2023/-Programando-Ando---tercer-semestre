
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde Oracle");
    }
    
}
