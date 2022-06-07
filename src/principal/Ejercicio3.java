package principal;

public class Ejercicio3 {
    public static void construccion(int num){
        for (int i = 0; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
