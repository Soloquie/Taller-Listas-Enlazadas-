package co.edu.uniquindio.poo.Ejercicio12;

import java.io.IOException;

import co.edu.uniquindio.poo.Ejercicio12.Persistencia.Persistencia;
import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class App {
    public static void main(String[] args) {
        Persistencia persistencia = new Persistencia();

        ListaEnlazada<Double> lista = new ListaEnlazada<>();

        lista.add(4.4);
        lista.add(3.2);
        lista.add(5.2);
        lista.add(1.4);

        try {
            persistencia.guardarNumeros(lista);
            System.out.println(media(persistencia.cargarNumeros()));
            System.out.println(dvEstandar(lista));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

    public static Double media(ListaEnlazada<Double> lista){
        Double suma = 0.0;
        Nodo<Double> nodoAux = lista.getNodoPrimero();

        while(nodoAux != null){
            suma += nodoAux.getValor();
            nodoAux = nodoAux.getSiguienteNodo();
        }

        return suma/lista.getTamaño();
    }

    public static Double dvEstandar(ListaEnlazada<Double> lista){
        Double media = media(lista);
        Double dvEs = 0.0;
        Nodo<Double> nodoAux = lista.getNodoPrimero();

        while(nodoAux != null){
            dvEs += Math.pow(nodoAux.getValor()-media, 2);
            nodoAux = nodoAux.getSiguienteNodo();
        }

        return Math.sqrt(dvEs/(lista.getTamaño()-1));
    }

}
