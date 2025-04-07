package co.edu.uniquindio.poo.Ejercicio7;



import java.util.Iterator;

import co.edu.uniquindio.poo.Generics.ListaDoblementeEnlazada;
import co.edu.uniquindio.poo.Generics.NodoDoble;

public class Iterador<T> implements Iterator<T> {

    private NodoDoble<T> nodoActual;
    private int indice;
    private ListaDoblementeEnlazada<T> lista;

    public Iterador(NodoDoble<T> nodoInicial, ListaDoblementeEnlazada<T> lista) {
        this.nodoActual = nodoInicial;
        this.indice = 0;
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return nodoActual != null;
    }

    @Override
    public T next() {
        T valor = nodoActual.getValor();
        nodoActual = nodoActual.getSiguienteNodo();
        indice++;
        return valor;
    }

    public boolean hasPrevious() {
        return nodoActual != null;
    }

    public T previous() {
        T valor = nodoActual.getValor();
        nodoActual = nodoActual.getNodoAnterior();
        indice--;
        return valor;
    }

    public int nextIndex() {
        return indice;
    }

    public int previousIndex() {
        return indice - 1;
    }

    public void remove() {
        if (nodoActual != null) {
            lista.remove(nodoActual.getValor());
        }
    }

    public void set(T nuevoValor) {
        if (nodoActual != null) {
            nodoActual.setValor(nuevoValor);
        }
    }

    public void add(T nuevoValor) {
        lista.agregar(nuevoValor, indice);
    }

    public int getIndice() {
        return indice;
    }
}
