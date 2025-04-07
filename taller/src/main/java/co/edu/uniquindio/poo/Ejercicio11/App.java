package co.edu.uniquindio.poo.Ejercicio11;


public class App {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();


        polinomio.AgregarTermino(2, 1);
        polinomio.AgregarTermino(1, 5);
        polinomio.AgregarTermino(30, 2);
        polinomio.AgregarTermino(-9, 0);

        System.out.println("Tabla de valores del polinomio:");

        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double y = polinomio.evaluar(x);
            System.out.printf("x = %.1f | y = %.4f%n", x, y);
        }
    }
}
