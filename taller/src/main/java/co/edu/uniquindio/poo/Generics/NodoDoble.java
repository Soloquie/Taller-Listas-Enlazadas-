package co.edu.uniquindio.poo.Generics;

public class NodoDoble<T> {
    private T valor;
    private NodoDoble<T> siguienteNodo = null;
    private NodoDoble<T> nodoAnterior = null;
    
    public NodoDoble(T valor){
        this.valor = valor;
    }

    public T getValor(){
        return this.valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoDoble<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoDoble<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public NodoDoble<T> getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoDoble<T> nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
   
}
