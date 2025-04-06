package co.edu.uniquindio.poo.Ejercicio5;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;


public class App {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        lista.add(1);
        lista.add(4);
        lista.add(1);
        lista.add(6);
        lista.add(1);
        lista.add(6);

        int valorRepetido = 1;

        System.out.println("El valor "+ valorRepetido+" se repite "+valorRepetido(lista, valorRepetido)+" veces en la lista enlazada");

    }

    public static <T> int valorRepetido(ListaEnlazada<T> listaEnlazada, T valor){
        int count = 0;
        
        Nodo<T> nodoAux = listaEnlazada.getNodoPrimero();
        while(nodoAux != null){
            if(valor == nodoAux.getValor()){
                count++;
            }
            nodoAux = nodoAux.getSiguienteNodo();
        }
        
        return count;
    }
}