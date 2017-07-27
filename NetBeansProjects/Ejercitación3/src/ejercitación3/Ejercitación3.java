/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitación3;

/**
 *
 * @author Ignacio
 */
public class Ejercitación3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Problema 1
        for (int z = 1; z < 11; ++z) {
            System.out.print(z + " ");
        }
        System.out.println("");
        //Problema 2
        for (int z = 1; z < 11; z = z + 2) {
            System.out.print(z + " ");
        }
        System.out.println("");
        //Problema 3
        for (int z = 10; z > 0; --z) {
            System.out.print(z + " ");
        }
        System.out.println("");
        //Problema 4 con for
        int a = 0;
        for (int b = 1; b < 11; ++b) {
            if (b % 2 == 1) {
                a = a + b;
            }
        }
        System.out.println(a);
        //Problema 4 con while
        int d = 1;
        int e = 0;
        while (d < 11) {
            if (d % 2 == 1) {
                e = e + d;
            }
            ++d;
        }
        System.out.println(e);
        //Problema 5
        int g;
        g = 1;
        for (int f = 1; f < 6; ++f) {
            g = g * f;
        }

        int h = 0;
        boolean j;
        j = true;
        for (int i = 1; i < 6; ++i) {
            if (j) {
                h = i;
                j = false;
            } else {
                h = h - i;
            }
        }
        System.out.println(h + g);
        System.out.println("");
        //Problema 6
        for (int k = 1; k <= 4; ++k) {
            System.out.println("@");
        }
        System.out.println();
        //Problema 7
        for (int l = 1; l <= 5; ++l) {
            if (l % 2 == 1) {
                System.out.println("@");
            } else {
                System.out.println("@@");
            }
        }
        System.out.println();
        //Problema 8
        for (int m = 1; m <= 5; ++m) {
            for (int n = 1; n <= m; ++n) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
        //Problema 9
        for (int o = 1; o <= 5; ++o) {
            for (int p = 5; p >= o; --p) {
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
        //Problema 10
        for (int q = 1; q <= 7; ++q) {
            if (q <= 4) {
                for (int r = 1; r <= q; ++r) {
                    System.out.print("@");
                }
            } else {
                for (int s = 8 - q; s >= 1; --s) {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Problema 11
        for (int t = 9; t >= 1; t -= 2) {
            if (t >= 5) {
                for (int u = t - 4; u >= 1; --u) {
                    System.out.print("@");
                }
            } else {
                for (int v = t; v <= 5; ++v) {
                    System.out.print("@");
                }
            }

            System.out.println();
        }

    }
}
