
package enviospractica1.Backend;


public class Paquete {
    private int peso;
    private Destino destino;
    private boolean prioridad;
    private Cliente remitente;
    private String estado;
    private int NumeroGuia;
    private int prioridadPrecio;

    public Paquete(int peso, Destino destino, boolean prioridad, Cliente remitente, String estado, int NumeroGuia) {
        this.peso = peso;
        this.destino = destino;
        this.prioridad = prioridad;
        this.remitente = remitente;
        this.estado = estado;
        this.NumeroGuia = NumeroGuia;
    }
    
    

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino Destino) {
        this.destino = Destino;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    public Cliente getRemitente() {
        return remitente;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroGuia() {
        return NumeroGuia;
    }

    public void setNumeroGuia(int NumeroGuia) {
        this.NumeroGuia = NumeroGuia;
    }

    public int getPrioridadPrecio() {
        return prioridadPrecio;
    }

    public void setPrioridadPrecio(int prioridadPrecio) {
        this.prioridadPrecio = prioridadPrecio;
    }
    
    
}
