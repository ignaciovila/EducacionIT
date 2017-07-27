/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese " + (array.length) + " números");
        for (int i = 0; i < array.length; i++) {
           switch (i) {
                case 0:
                    System.out.println("El primero"); break;
                case 1:
                    System.out.println("El segundo"); break;
                case 2:
                    System.out.println("El tercero"); break;
                case 3:
                    System.out.println("El cuarto, último y no por eso menos importante"); break;
            }
            array[i] = s.nextInt();
        }
        double promedio = 0;
        for (int i = 0; i < array.length; i++) {
            promedio = array [i] + promedio;
        }
        System.out.println("El promedio es " + promedio/array.length);

    }

}
