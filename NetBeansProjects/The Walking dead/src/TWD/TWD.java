/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TWD;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class TWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp1 = 6;
        int temp2 = 13;
        int temp3 = 16;
        int temp;
        int cap;
        System.out.println("Averigue cuantos capítulos de The Walking Dead le faltan ver");
        System.out.println("Ingrese temporada por la que va");
        Scanner s = new Scanner (System.in);
        temp = s.nextInt();
        System.out.println("Ingrese último capítulo que vio");
        cap = s.nextInt();
        switch (temp) {
            case 1:
                System.out.println("Le faltan " + (temp1+temp2+temp3-cap) + " capítulos");
                break;
            case 2:
                System.out.println("Le faltan " + (temp2+temp3-cap) + " capítulos");
                break;
            case 3:
                System.out.println("Le faltan " + (temp3-cap) + " capítulos");
                break;
        }
    }
    
}
