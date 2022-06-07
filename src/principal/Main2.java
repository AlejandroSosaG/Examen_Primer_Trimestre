package principal;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Introduzca la base de la potencia");
        double a = pedirVariables();
        System.out.println("Introduzca el exponente de la potencia");
        double n = pedirVariables();
        System.out.println("Iterativo: " + Ejercicio2.iterativo(a,n));
        System.out.println("Recursivo: " + Ejercicio2.recursivo(a,n));
    }
    public static double pedirVariables() {
        Scanner s = new Scanner(System.in);
        double num = 0;
        try {
            num = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Debe introducir un número real positivo");
        }
        return num;
    }
}