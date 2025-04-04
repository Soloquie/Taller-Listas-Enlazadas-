package co.edu.uniquindio.poo.Ejercicio4;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class App {
    public static void main(String[] args) {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        System.out.println("Lista sin modificar: ");

        lista.add("Par 1");
        lista.add("Impar 1");
        lista.add("Par 2");
        lista.add("Impar 2");
        lista.add("Par 3");
        lista.add("Impar 3");
        lista.add("Par 4");
        lista.add("Impar 4");

        lista.printList();

        System.out.println(" -------- ");
        System.out.println("Lista impares: ");

        ListaEnlazada<String> listaImpares = valoresImpares(lista);
        listaImpares.printList();
    }

    public static <T> ListaEnlazada<T> valoresImpares(ListaEnlazada<T> listaEnlazada){
        int indice = 0;
        ListaEnlazada<T> listaImpares = new ListaEnlazada<>();
        Nodo<T> aux = listaEnlazada.getNodoPrimero();
        while(aux.getSiguienteNodo() != null){
            if(indice % 2 != 0){
                listaImpares.add(aux.getValor());
            }
            indice++;
            aux = aux.getSiguienteNodo();
        }

        return listaImpares;
    } 
}
