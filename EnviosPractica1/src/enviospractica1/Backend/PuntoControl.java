
package enviospractica1.Backend;

public class PuntoControl {
    
    private String nombre;
    private Destino destino;
    private Operario operario;

    public PuntoControl(String nombre, Destino destino) {
        this.nombre = nombre;
        this.destino = destino;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }
    
    
}
