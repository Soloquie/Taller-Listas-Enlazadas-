package co.edu.uniquindio.poo.Generics;

public class ListaDoblementeEnlazada<T> {
    private int tamaño = 0;
    private NodoDoble<T> firstNodo;
    private NodoDoble<T> lastNodo;

    public ListaDoblementeEnlazada(){
    }

    public boolean isEmpty(){
        if(tamaño == 0){
            return true;
        }
        return false;
    }

    public void addFirst(T valor){
        if(isEmpty()){
            firstNodo = new NodoDoble<T>(valor);
            lastNodo = firstNodo;
        }
        else{
            NodoDoble<T> nuevoNodo = new NodoDoble<T>(valor);
            nuevoNodo.setSiguienteNodo(firstNodo);
            firstNodo = nuevoNodo;
            
        }
        tamaño++;
    }

    public void add(T valor){
        if(isEmpty()){
            firstNodo = new NodoDoble<T>(valor);
            lastNodo = firstNodo;
        }
        else{
            NodoDoble<T> nodoActual = firstNodo;
            while(nodoActual.getSiguienteNodo() != null){
                nodoActual = nodoActual.getSiguienteNodo();
            }
            NodoDoble<T> nuevoNodo = new NodoDoble<T>(valor);
            nodoActual.setSiguienteNodo(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoActual);
            lastNodo = nuevoNodo;
        }
        tamaño++;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            NodoDoble<T> actual = firstNodo;
            while(actual != null){
                System.out.println(actual.getValor());
                actual = actual.getSiguienteNodo();
            }
        }
    }

    //ejercicio 6
    public void printReverseList(){
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            NodoDoble<T> actual = lastNodo;
            while(actual != null){
                System.out.println(actual.getValor());
                actual = actual.getNodoAnterior();
            }
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public NodoDoble<T> getFirstNodo() {
        return firstNodo;
    }

    public void setFirstNodo(NodoDoble<T> firstNodo) {
        this.firstNodo = firstNodo;
    }

    public NodoDoble<T> getLastNodo() {
        return lastNodo;
    }

    public void setLastNodo(NodoDoble<T> lastNodo) {
        this.lastNodo = lastNodo;
    }



}
