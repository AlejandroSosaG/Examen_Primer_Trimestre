package principal;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Introduzca el tamaño del triángulo que desea dibujar");
        int tamaño = pedirVariables();
        Ejercicio3.construccion(tamaño);
    }
    public static int pedirVariables() {
        Scanner s = new Scanner(System.in);
        int num = 0;
            try {
                num = s.nextInt();
                if (num < 1) throw new Exception("Error");
            } catch (Exception e) {
                System.out.println("Debe introducir un número entero mayor de 0");
            }

        return num;
    }
}
