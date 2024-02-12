import clases.Ejercicios;

public class EjerciciosRunner {
    public static void main(String[] args) {
        int[] x = {};
        int number = 12;

        Ejercicios ejercicio = new Ejercicios();

        System.out.println(ejercicio.reversedArray(x));

        System.out.println(ejercicio.determineAllFactors(number));
    }
}
