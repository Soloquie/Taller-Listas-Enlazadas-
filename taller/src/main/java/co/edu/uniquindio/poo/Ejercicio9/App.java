package co.edu.uniquindio.poo.Ejercicio9;

public class App {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(10);
        lista.insertar(30);

        lista.printList();

        System.out.println("Buscar 20: " + lista.buscar(20));
        System.out.println("Repeticiones de 10: " + lista.contarRepeticiones(10));
    }
}
