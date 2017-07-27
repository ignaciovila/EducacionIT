/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitación2;

/**
 *
 * @author Ignacio
 */
public class Ejercitación2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROBLEMA 1
        int a;
        a = 1;
        while (a < 11) {
            System.out.print(a + " ");
            ++a;
        }
        System.out.println();
        //PROBLEMA 2
        int b;
        b = 1;
        while (b < 11) {
            System.out.print(b + " ");
            b = b + 2;
        }
        System.out.println();
        //PROBLEMA 3
        int c;
        c = 10;
        while (c > 0) {
            System.out.print(c + " ");
            --c;
        }
        System.out.println();
        //PROBLEMA 4
        int x;
        for (x = 1; x <= 10; ++x) {
            if (x != 2 && x != 5 && x != 9) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        //PROBLEMA 5
        int y;
        for (y = 1; y <= 30; ++y) {
            if (y <= 10 || y >= 20) {
                System.out.print(y + " ");
            }
        }
        System.out.println("");
        //PROBLEMA 5 bis    
        int z;
        for (z = 1; z <= 30; ++z) {
            if (!(z > 10 && z < 20)) {
                System.out.print(z + " ");
            }
        }
        System.out.println("");
        //PROBLEMA 6
        int d;
        int e;
        e = 0;
        for (d = 1; d <= 10; ++d) {
            e = e + d;
        }
        System.out.println("La suma es " + e);
        //PROBLEMA 7
        int f;
        for (f = 1; f <= 25; ++f) {
            if (f % 2 == 0) {
                System.out.print(f + " ");
            }
        }
        System.out.println("");
        //PROBLEMA 8
        int g;
        int h;
        h = 1;
        for (g = -10; g <= 10; ++g) {
            if (g % 2 == 1 || g % 2 == -1) {
                h = g * h;
            }
        }
        System.out.println("El resultado es " + h);
        //PROBLEMA 9
        int i;
        int j;
        j = 0;
        for (i = 1; i <= 30; ++i) {
            if ((i % 2 == 0) & (i > 9) & (i < 20)) {
                j = i + j;
            }
        }
        System.out.println("El resultado es " + j);
    }

}
