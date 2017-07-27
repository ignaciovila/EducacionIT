/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1 + 3;
        String b = "Clase 2";
        boolean c = 5 <= 9;

        int nota = 5;
        switch (nota) {
            case 5:
                System.out.println("desaprobado");
                break;
            case 6:
                System.out.println("regular");
                break;
            default:
                System.out.println("aprobado");
                break; //innecesario
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int m = s.nextInt(); //ingreso de enteros
        System.out.println("Ingrese un texto");
        String n = s.next(); //ingreso de String
        System.out.println("Usted ingresó el número: " + m);
        System.out.println("Usted ingresó el texto: " + n);

    }
}
