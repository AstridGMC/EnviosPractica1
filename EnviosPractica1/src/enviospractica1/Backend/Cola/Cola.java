
package enviospractica1.Backend.Cola;

public class Cola<T> {
    
    private Nodo <T> primero;
    private Nodo <T> ultimo;
    private int tamaño;
    
    public Cola(){
        primero = null;
        ultimo = null;
        tamaño =0;
    }
    
    public boolean estaVacia(){
        return primero == null;
    }
    
    public int Tamaño(){
        return tamaño;
    }
    
    
    public T Primero(){
        if(estaVacia()){
            return null;
        }
        return primero.getElemeto();
    }
    
    public T SacarCola(){
        if(estaVacia()){
            return null;
        }
        
        T elemento = primero.getElemeto();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;
        
        primero = aux;
        tamaño --;
        if(estaVacia()){
            ultimo = null;
        }
        return elemento;
    }
    
    public T InsertarCola(T elemento){
        Nodo<T> aux = new Nodo(elemento, null);
    
        if(estaVacia()){
            primero = aux;
            ultimo = aux;
        } else{
            if(Tamaño()==1){
                primero.setSiguiente(aux);
            }else{
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }
    
        tamaño ++;
        return aux.getElemeto();
    }
    
    
}
