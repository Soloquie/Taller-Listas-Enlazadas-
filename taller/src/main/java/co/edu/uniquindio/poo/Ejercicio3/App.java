package co.edu.uniquindio.poo.Ejercicio3;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class App {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        lista.addFirst(1);
        lista.addFirst(4);
        lista.addFirst(2);
        lista.addFirst(6);
        lista.addFirst(5);
        lista.addFirst(3);

        System.out.println("Lista original:");
        lista.printList();

        eliminarNumerosPares(lista);

        System.out.println("\nLista después de eliminar los números pares:");
        lista.printList();
    }

    public static void eliminarNumerosPares(ListaEnlazada<Integer> lista) {
        Nodo<Integer> actual = lista.getNodoPrimero();
        Nodo<Integer> anterior = null;

        while (actual != null) {
            if (actual.getValor() % 2 == 0) { // si es par
                if (anterior == null) {
                    
                    lista.setNodoPrimero(actual.getSiguienteNodo());
                    actual = lista.getNodoPrimero();
                } else {
                    anterior.setSiguienteNodo(actual.getSiguienteNodo());
                    actual = actual.getSiguienteNodo();
                }
                lista.setTamaño(lista.getTamaño() - 1);
            } else {
                anterior = actual;
                actual = actual.getSiguienteNodo();
            }
        }
    }
}
