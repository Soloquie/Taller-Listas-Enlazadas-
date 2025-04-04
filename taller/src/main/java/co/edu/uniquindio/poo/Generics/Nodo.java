package co.edu.uniquindio.poo.Generics;

public class Nodo <T>{
    private T valor;
    private Nodo<T> siguienteNodo = null;
    
    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor(){
        return this.valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    

}
