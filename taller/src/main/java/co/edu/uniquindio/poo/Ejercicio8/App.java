package co.edu.uniquindio.poo.Ejercicio8;

import co.edu.uniquindio.poo.Ejercicio2.Persona;
import co.edu.uniquindio.poo.Generics.ListaDoblementeEnlazada;
import co.edu.uniquindio.poo.Generics.NodoDoble;

public class App {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<Persona> lista = new ListaDoblementeEnlazada<>();

        lista.add(new Persona("Julian", "1234"));
        lista.add(new Persona("Alberto", "213"));
        lista.add(new Persona("Jose", "43256"));
        lista.add(new Persona("Efrain", "5143623"));
        lista.add(new Persona("Juan", "543235"));
        lista.add(new Persona("Carlos", "21345"));
        lista.add(new Persona("Julio", "21345678"));

        cantidadParDoble(lista).printList();

    }

    public static <T extends Persona> ListaDoblementeEnlazada<T> cantidadParDoble(ListaDoblementeEnlazada<T> lista){

        ListaDoblementeEnlazada<T> listaN = new ListaDoblementeEnlazada<>();
        NodoDoble<T> actual = lista.getLastNodo();
        while(actual != null){
            if(actual.getValor().getCedula().length() % 2 == 0){
                listaN.add(actual.getValor());
            }
            actual = actual.getNodoAnterior();
        }

        return listaN;
    }
}
