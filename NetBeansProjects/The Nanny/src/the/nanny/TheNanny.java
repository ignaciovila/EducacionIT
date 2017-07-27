/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.nanny;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class TheNanny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] capxtemp = new int[6];
        capxtemp[0] = 22;
        capxtemp[1] = 26;
        capxtemp[2] = 27;
        capxtemp[3] = 26;
        capxtemp[4] = 22;
        capxtemp[5] = 22;
        int temp;
        int cap;
        System.out.println("Averigue cuantos capítulos de The Nanny le faltan ver");
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Ingrese temporada por la que va");
            temp = s.nextInt();
        } while (temp < 0);
        do {
            System.out.println("Ingrese el último capítulo que vio");
            cap = s.nextInt();
        } while (cap < 0);
        int total = 0;
        for (int i = capxtemp.length - 1; i + 1 >= temp; i--) {
            total = total + capxtemp[i] - cap;
        }
        if (total > 1) {
            System.out.println("Le faltan ver " + total + " capítulos");
        } else if (total == 1) {
            System.out.println("Le falta ver " + total + " capítulo");
        } else {
            System.out.println("Felicitaciones!!! Usted terminó la serie");
        }
    }

}
