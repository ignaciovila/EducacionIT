package clase3;

import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = s.nextInt(); //ingreso de enteros
        if (numero >= 10) {
            System.out.println("El número es mayor que diez");
        } else {
            System.out.println("El número NO es mayor que diez");
        }
        int a = 1;
        do {
            System.out.print(a+" ");
            a++;
        } while (a <= 10);

        while (a < 10) {
            a++;
            while (a < 5) {
                a++;
                break; //sale de este while
            }
            //no sale de este while
        }

        while (a < 10) {
            a++;
            while (a < 5) {
                a++;
                continue; //sale de esta iteración
            } //no sale del while
        } //porsupuesto tampoco sale de este while

    }

}
