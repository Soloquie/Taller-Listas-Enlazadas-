package co.edu.uniquindio.poo.Ejercicio2;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class App {
    public static void main(String[] args) {
        ListaEnlazada<Persona> listaEnlazada = new ListaEnlazada<>();

        listaEnlazada.add(new Persona("Julian", "1234"));
        listaEnlazada.add(new Persona("Alberto", "213"));
        listaEnlazada.add(new Persona("Jose", "43256"));
        listaEnlazada.add(new Persona("Efrain", "5143623"));
        listaEnlazada.add(new Persona("Juan", "543235"));
        listaEnlazada.add(new Persona("Carlos", "21345"));
        listaEnlazada.add(new Persona("Julio", "21345678"));

        ListaEnlazada<Persona> lista = personasConNumerosPar(listaEnlazada);
        lista.printList();
        
    }

    public static <T extends Persona> ListaEnlazada<T> personasConNumerosPar(ListaEnlazada<T> lista){
        ListaEnlazada<T> listaE = new ListaEnlazada<>();
        Nodo<T> nodoAux = lista.getNodoPrimero();
        while(nodoAux!=null){
            if(nodoAux.getValor().getCedula().length() % 2 == 0){
                listaE.add(nodoAux.getValor());
            }
            nodoAux = nodoAux.getSiguienteNodo();
        }

        return listaE;
    }
}
