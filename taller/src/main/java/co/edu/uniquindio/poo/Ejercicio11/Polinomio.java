package co.edu.uniquindio.poo.Ejercicio11;



public class Polinomio {
    private Termino primero;

    public Polinomio() {
        this.primero = null;
    }

    public void AgregarTermino(int coeficiente, int exponente) {
        Termino nuevo = new Termino(coeficiente, exponente);

        if (primero == null || exponente > primero.getExponente()) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            Termino actual = primero;
            while (actual.getSiguiente() != null &&
                   actual.getSiguiente().getExponente() > exponente) {
                actual = actual.getSiguiente();
            }

            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Termino actual = primero;

        while (actual != null) {
            resultado += actual.getCoeficiente() * Math.pow(x, actual.getExponente());
            actual = actual.getSiguiente();
        }

        return resultado;
    }
}
