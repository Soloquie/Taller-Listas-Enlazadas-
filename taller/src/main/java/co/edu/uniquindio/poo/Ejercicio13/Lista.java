package co.edu.uniquindio.poo.Ejercicio13;

public class Lista {
    NodoLista inicio;

    public Lista() {
        inicio = null;
    }


    public int maximaDistancia(int clave) {
        return maximaDistanciaRecursiva(inicio, clave, 0, -1, 0);
    }


    private int maximaDistanciaRecursiva(NodoLista nodo, int clave, int posicion, int primeraPos, int maxDist) {
        if (nodo == null) {
            return maxDist;
        }

        if (nodo.dato == clave) {
            if (primeraPos == -1) {
                primeraPos = posicion;
            } else {
                int distancia = posicion - primeraPos;
                if (distancia > maxDist) {
                    maxDist = distancia;
                }
            }
        }

        return maximaDistanciaRecursiva(nodo.sig, clave, posicion + 1, primeraPos, maxDist);
    }
}
