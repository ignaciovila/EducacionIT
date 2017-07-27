/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Superficie;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Superficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cuadrado;
        double circulo;
        System.out.println("Cálculo de superficie");
        System.out.println("Para saber la superficie de un cuadrado, ingrese 1");
        System.out.println("Para saber la superficie de un círculo, ingrese 2");
        Scanner s = new Scanner(System.in);
        double cod = s.nextDouble();
        if (cod == 1) {
            System.out.println("Ingrese lado");
            cuadrado = s.nextDouble();
            cuadrado = cuadrado * cuadrado;
            System.out.println("La superficie es " + cuadrado);
        } else {
            System.out.println("Ingrese radio");
            circulo = s.nextInt ();
            circulo = 2 * 3.14 * circulo;
            System.out.println("La superficie es " + circulo);
        }
    }

}
