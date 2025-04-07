package co.edu.uniquindio.poo.Ejercicio13;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();

     
        lista.inicio = new NodoLista(9,
                        new NodoLista(4,
                        new NodoLista(6,
                        new NodoLista(8,
                        new NodoLista(5,
                        new NodoLista(4,
                        new NodoLista(4, null)))))));

        int clave = 4;
        int resultado = lista.maximaDistancia(clave);
        System.out.println("Máxima distancia entre elementos con clave " + clave + ": " + resultado);
    }
}
