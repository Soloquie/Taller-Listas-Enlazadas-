package co.edu.uniquindio.poo.Ejercicio10;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;

public class App {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista1 = new ListaEnlazada<>();
        ListaEnlazada<Integer> lista2 = new ListaEnlazada<>();
        
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);

        concatenarListas(lista1, lista2).printList();


        
    }

    public static <T> ListaEnlazada<T> concatenarListas(ListaEnlazada<T> lista1 ,ListaEnlazada<T> lista2){
        ListaEnlazada<T> listaConcatenada = lista1;
        listaConcatenada.getNodoUltimo().setSiguienteNodo(lista2.getNodoPrimero());
        
        return listaConcatenada;
    }
}
