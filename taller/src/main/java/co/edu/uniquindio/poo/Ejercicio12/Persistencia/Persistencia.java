package co.edu.uniquindio.poo.Ejercicio12.Persistencia;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniquindio.poo.Generics.ListaEnlazada;
import co.edu.uniquindio.poo.Generics.Nodo;

public class Persistencia {
    private final String rutaNumeros = "src\\main\\java\\co\\edu\\uniquindio\\poo\\Ejercicio12\\Persistencia\\Numeros";

    public void guardarNumeros(ListaEnlazada<Double> lista) throws IOException {
        StringBuilder contenido = new StringBuilder();
        Nodo<Double> aux = lista.getNodoPrimero();

        while (aux != null) {
            contenido.append(aux.getValor()).append("\n");
            aux = aux.getSiguienteNodo();
        }

        ArchivoUtil.guardarArchivo(rutaNumeros, contenido.toString(), false);
    }  

        public ListaEnlazada<Double> cargarNumeros() throws IOException {
        ListaEnlazada<Double> lista = new ListaEnlazada<>();
        ArrayList<String> lineas = ArchivoUtil.leerArchivo(rutaNumeros);

        for (String linea : lineas) {
            try {
                double numero = Double.parseDouble(linea.trim());
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.err.println("Línea inválida (no es número): " + linea);
            }
        }

        return lista;
    }
}
