package principal;

public class Ejercicio2 {
    public static double recursivo(double a, double n) {
        double resultado = 1;
        if (n==0) resultado*=1;
        else {
                resultado = a * recursivo(a, n - 1);
        }
        return resultado;
    }

    public static double iterativo(double a, double n) {
        double resultado = 1;
        while (n>0){
            resultado=resultado*a;
            n--;
        }
        return resultado;
    }
}