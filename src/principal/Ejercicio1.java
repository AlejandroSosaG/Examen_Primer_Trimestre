package principal;

import java.util.Scanner;

public class Ejercicio1 {
    public static void capicua() {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(null), aux, capicua=0;
        do {
            System.out.println("Escriba un número de más de una cifra. Para salir introduzca un 0");
            try {
                num = s.nextInt();
                if (num < 0) {
                    System.out.println("Debe ser un número positivo");
                } else {
                    if (num < 10) {
                        System.out.println("Debe ser un número mayor con más de una cifra");
                    } else {
                        while (num != 0) {
                            aux = num % 10;
                            capicua = (capicua * 10) + aux;
                            num = num / 10;
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Ha de introducir un número");
            }
        }while(num!=0);
    }
}
