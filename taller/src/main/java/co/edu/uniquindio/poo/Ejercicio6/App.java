package co.edu.uniquindio.poo.Ejercicio6;

import co.edu.uniquindio.poo.Generics.ListaDoblementeEnlazada;

public class App {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Integer> lista = new ListaDoblementeEnlazada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        //ejercicio 6
        lista.printReverseList();
    }
}
