package co.edu.uniquindio.poo.Generics;

public class ListaDoblementeEnlazada<T> {
    private int tamaño = 0;
    private NodoDoble<T> firstNodo;
    private NodoDoble<T> lastNodo;

    public ListaDoblementeEnlazada() {
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public void addFirst(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (isEmpty()) {
            firstNodo = lastNodo = nuevoNodo;
        } else {
            nuevoNodo.setSiguienteNodo(firstNodo);
            firstNodo.setNodoAnterior(nuevoNodo);
            firstNodo = nuevoNodo;
        }
        tamaño++;
    }

    public void add(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        if (isEmpty()) {
            firstNodo = lastNodo = nuevoNodo;
        } else {
            lastNodo.setSiguienteNodo(nuevoNodo);
            nuevoNodo.setNodoAnterior(lastNodo);
            lastNodo = nuevoNodo;
        }
        tamaño++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble<T> actual = firstNodo;
            while (actual != null) {
                System.out.println(actual.getValor());
                actual = actual.getSiguienteNodo();
            }
        }
    }

    public void printReverseList() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            NodoDoble<T> actual = lastNodo;
            while (actual != null) {
                System.out.println(actual.getValor());
                actual = actual.getNodoAnterior();
            }
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public NodoDoble<T> getFirstNodo() {
        return firstNodo;
    }

    public void setFirstNodo(NodoDoble<T> firstNodo) {
        this.firstNodo = firstNodo;
    }

    public NodoDoble<T> getLastNodo() {
        return lastNodo;
    }

    public void setLastNodo(NodoDoble<T> lastNodo) {
        this.lastNodo = lastNodo;
    }

   
    public void agregar(T valor, int posicion) {
        if (posicion < 0 || posicion > tamaño) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }

        if (posicion == 0) {
            addFirst(valor);
            return;
        }

        if (posicion == tamaño) {
            add(valor);
            return;
        }

        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);
        NodoDoble<T> actual = firstNodo;

        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguienteNodo();
        }

        nuevoNodo.setSiguienteNodo(actual);
        nuevoNodo.setNodoAnterior(actual.getNodoAnterior());
        actual.getNodoAnterior().setSiguienteNodo(nuevoNodo);
        actual.setNodoAnterior(nuevoNodo);

        tamaño++;
    }

    public void remove(T valor) {
        NodoDoble<T> actual = firstNodo;

        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                NodoDoble<T> anterior = actual.getNodoAnterior();
                NodoDoble<T> siguiente = actual.getSiguienteNodo();

                if (anterior != null) {
                    anterior.setSiguienteNodo(siguiente);
                } else {
                    firstNodo = siguiente;
                }

                if (siguiente != null) {
                    siguiente.setNodoAnterior(anterior);
                } else {
                    lastNodo = anterior;
                }

                tamaño--;
                return;
            }
            actual = actual.getSiguienteNodo();
        }

        throw new RuntimeException("Elemento no encontrado en la lista");
    }
}
