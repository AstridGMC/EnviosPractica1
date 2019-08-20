
package enviospractica1.Backend.Cola;

public class Nodo<T> {
    
    private T elemeto;
    private Nodo<T> siguiente;
    
    public Nodo(T elemento, Nodo<T> siguiente){
        this.elemeto = elemento;
        this.siguiente = siguiente;
    }

    public T getElemeto() {
        return elemeto;
    }

    public void setElemeto(T elemeto) {
        this.elemeto = elemeto;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "elemeto=" + elemeto ;
    }
    
    
}
