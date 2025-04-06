package co.edu.uniquindio.poo.Ejercicio7;

import co.edu.uniquindio.poo.Generics.ListaDoblementeEnlazada;

public class App {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();

        lista.addFirst(3);
        lista.addFirst(4);
        lista.add(3);
        lista.addFirst(9);
        lista.addFirst(3);
        lista.add(2);

        Iterador<Integer> iterador = new Iterador<>(lista.getFirstNodo(), lista);

        System.out.println("Elementos recorridos con iterador:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}