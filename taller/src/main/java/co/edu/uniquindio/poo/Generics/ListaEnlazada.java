package co.edu.uniquindio.poo.Generics;

public class ListaEnlazada <T>{
    private int tamaño = 0;
    private Nodo<T> firstNodo;
    private Nodo<T> lastNodo;

    public ListaEnlazada(){
    }

    public void addFirst(T valor){
        if(isEmpty()){
            firstNodo = new Nodo<T>(valor);
            lastNodo = firstNodo;
        }
        else{
            Nodo<T> nuevoNodo = new Nodo<T>(valor);
            nuevoNodo.setSiguienteNodo(firstNodo);
            firstNodo = nuevoNodo;
            
        }
        tamaño++;
    }

    public void add(T valor){
        if(isEmpty()){
            firstNodo = new Nodo<T>(valor);
            lastNodo = firstNodo;
        }
        else{
            Nodo<T> nodoActual = firstNodo;
            while(nodoActual.getSiguienteNodo() != null){
                nodoActual = nodoActual.getSiguienteNodo();
            }
            Nodo<T> nuevoNodo = new Nodo<T>(valor);
            nodoActual.setSiguienteNodo(nuevoNodo);
            lastNodo = nuevoNodo;
        }
        tamaño++;
    }

    public boolean isEmpty(){
        if(tamaño == 0){
            return true;
        }
        return false;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }
        else{
            Nodo<T> actual = firstNodo;
            while(actual != null){
                System.out.println(actual.getValor());
                actual = actual.getSiguienteNodo();
            }
        }
    }

    public void removeList(){
        this.firstNodo = null;
        tamaño = 0;
    }

    public void add(int pos, T value) {
        if(pos == 0){
            addFirst(value);
            return;
        }
        
        int i = 0;
        Nodo<T> nodoActual = firstNodo;
        while(i < pos - 1 && nodoActual != null){
            nodoActual = nodoActual.getSiguienteNodo();
            i++;
        }
        
        if(nodoActual == null){
            System.out.println("No es posible añadir el elemento a la posición dada");
        } else {
            Nodo<T> nuevoNodo = new Nodo<>(value);
            nuevoNodo.setSiguienteNodo(nodoActual.getSiguienteNodo());
            nodoActual.setSiguienteNodo(nuevoNodo);
            tamaño++;
            if(nuevoNodo.getSiguienteNodo() == null){
                lastNodo = nuevoNodo;
            }
        }
        
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("No existen elementos en la lista");
        }
        else{
            firstNodo = firstNodo.getSiguienteNodo();
            tamaño--;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("No existen elementos en la lista");
            return;
        }
        if(firstNodo == lastNodo){ 
            firstNodo = null;
            lastNodo = null;
        } else {
            Nodo<T> actual = firstNodo;
            while(actual.getSiguienteNodo() != lastNodo){
                actual = actual.getSiguienteNodo();
            }
            actual.setSiguienteNodo(null);
            lastNodo = actual;
        }
        tamaño--;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Nodo<T> getNodoPrimero() {
        return firstNodo;
    }

    public void setNodoPrimero(Nodo<T> nodoPrimero) {
        this.firstNodo = nodoPrimero;
    }

    public Nodo<T> getNodoUltimo() {
        return lastNodo;
    }

    public void setNodoUltimo(Nodo<T> nodoUltimo) {
        this.lastNodo = nodoUltimo;
    }
    
    public ListaEnlazada<T> obtenerPosicionesImpares(){
        Nodo<T> aux = firstNodo;
        ListaEnlazada<T> oddPosicion = new ListaEnlazada<>();
        int count = 0;
        while(aux != null){
            if(count % 2 != 0){
                oddPosicion.add(aux.getValor());
            }
            aux = aux.getSiguienteNodo();
            count++;
        }
        return oddPosicion;
    }

    public void eliminarPosicionesPares(){
        Nodo<T> aux = firstNodo;
        int count = 0;
        while(aux != null){
            if(count % 2 != 0){
                aux.setSiguienteNodo(aux.getSiguienteNodo());
            }
            aux = aux.getSiguienteNodo();
            count++;
        }
        printList();
    }

    public int repeticionValor(T valor){
        int count = 0;
        Nodo<T> aux = firstNodo;
        while(aux != null){
            if(valor == aux.getValor()){
                count++;
            }
            aux.getSiguienteNodo();
        }
        return count;
    }
}
