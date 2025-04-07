package co.edu.uniquindio.poo.Ejercicio9;

import co.edu.uniquindio.poo.Generics.Nodo;



public class ListaCircular<T> {
    private Nodo<T> firstNodo;
    private Nodo<T> lastNodo;
    private int tamaño;

    public ListaCircular() {
        firstNodo = null;
        lastNodo = null;
        tamaño = 0;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void insertar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);

        if (isEmpty()) {
            firstNodo = nuevoNodo;
            lastNodo = nuevoNodo;
            nuevoNodo.setSiguienteNodo(nuevoNodo); 
        } else {
            lastNodo.setSiguienteNodo(nuevoNodo);
            nuevoNodo.setSiguienteNodo(firstNodo);
            lastNodo = nuevoNodo;
        }

        tamaño++;
    }

    public boolean buscar(T valor) {
        if (isEmpty()) {
            return false;
        }

        Nodo<T> actual = firstNodo;
        do {
            if (actual.getValor().equals(valor)) {
                return true;
            }
            actual = actual.getSiguienteNodo();
        } while (actual != firstNodo);

        return false;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo<T> actual = firstNodo;
        do {
            System.out.println(actual.getValor());
            actual = actual.getSiguienteNodo();
        } while (actual != firstNodo);
    }

    public void eliminarLista() {
        firstNodo = null;
        lastNodo = null;
        tamaño = 0;
    }

    public int contarRepeticiones(T valor) {
        if (isEmpty()) return 0;

        int contador = 0;
        Nodo<T> actual = firstNodo;

        do {
            if (actual.getValor().equals(valor)) {
                contador++;
            }
            actual = actual.getSiguienteNodo();
        } while (actual != firstNodo);

        return contador;
    }
}
