
package ar.com.system2023.mundopc;

public class DispositivoEntrada {
    private String tipoEntada;
    private String marca;
    
    public DispositivoEntrada(String tipoEntada, String marca){
        this.tipoEntada = tipoEntada;
        this.marca = marca;
    }

    public String getTipoEntada() {
        return this.tipoEntada;
    }

    public void setTipoEntada(String tipoEntada) {
        this.tipoEntada = tipoEntada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntada=" + tipoEntada + ", marca=" + marca + '}';
    }
    
    
    
    
    
    
    
}
