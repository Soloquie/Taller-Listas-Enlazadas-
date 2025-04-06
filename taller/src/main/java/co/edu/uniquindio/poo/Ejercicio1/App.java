package co.edu.uniquindio.poo.Ejercicio1;


import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class App {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        lista.addFirst(1);
        lista.addFirst(4);
        lista.addFirst(1);
        lista.addFirst(6);
        lista.addFirst(1);
        lista.addFirst(6);

        ListaEnlazada<Integer> impares = obtenerNumerosPosicionesImpares(lista);

        System.out.println("Elementos en posiciones impares:");
        impares.printList();
    }

    public static ListaEnlazada<Integer> obtenerNumerosPosicionesImpares(ListaEnlazada<Integer> listaOriginal) {
        ListaEnlazada<Integer> resultado = new ListaEnlazada<>();
        Nodo<Integer> actual = listaOriginal.getNodoPrimero();
        int posicion = 0;

        while (actual != null) {
            if (posicion % 2 != 0) { // posición impar
                resultado.add(actual.getValor());
            }
            actual = actual.getSiguienteNodo();
            posicion++;
        }

        return resultado;
    }
}
