/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitación4;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Ejercitación4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese " +  (array.length-i) + " números");
            array[i] = s.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("PROBLEMA 1");
        int[] b = {10, 20, 5, 15, 30, 20};
        int total = 0;
        int mayor = b[0];
        int cont = 0;
        for (int j = 0; j < b.length; j++) {
            System.out.println("Índice: " + j);
            System.out.println("Valor: " + b[j]);
            if (j % 2 == 0) {
                System.out.println();
            }
            total = total + b[j];
            if (j % 2 == 1) {
                System.out.println("El índice es impar, el valor es " + b[j]);
                System.out.println("");
            }
            if (b[j] > mayor) {
                mayor = b[j];
            }
            if (b[j] == 20) {
                cont++;
            }
        }
        System.out.println("La suma es " + total);
        System.out.println("El mayor es " + mayor);
        System.out.println("El número 20 aparece " + cont + " veces");
        System.out.println();

        System.out.println("PROBLEMA 2");
        double[] c = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        double sumatoria = 0;
        double menor = c[0];
        int mesmayor;
        mesmayor = 1;
        int j;
        int mesmenor;
        mesmenor = 1;
        double nmayor = c[0];
        for (int k = 0; k < c.length; k++) {
            sumatoria = sumatoria + c[k];
            if (c[k] < menor) {
                menor = c[k];
            }
            if (c[k] > nmayor) {
                nmayor = c[k];
            }
        }
        for (j = 0; j < c.length; j++) {
            if (c[j] == menor) {
                mesmenor = j + 1;
            }
            if (c[j] == nmayor) {
                mesmayor = j + 1;
            }
        }
        switch (mesmayor) {
            case 1:
                System.out.println("Mes Enero" + " = " + nmayor);
            case 2:
                System.out.println("Mes Febrero" + " = " + nmayor);
            case 3:
                System.out.println("Mes Marzo" + " = " + nmayor);
            case 4:
                System.out.println("Mes Abril" + " = " + nmayor);
            case 5:
                System.out.println("Mes Mayo" + " = " + nmayor);
            case 6:
                System.out.println("Mes Junio" + " = " + nmayor);
            case 7:
                System.out.println("Mes Julio" + " = " + nmayor);
            case 8:
                System.out.println("Mes Agosto" + " = " + nmayor);
            case 9:
                System.out.println("Mes Septiembre" + " = " + nmayor);
            case 10:
                System.out.println("Mes Octubre" + " = " + nmayor);
            case 11:
                System.out.println("Mes Noviembre" + " = " + nmayor);
            case 12:
                System.out.println("Mes Diciembre" + " = " + nmayor);

        }

        System.out.println("Mes " + mesmenor + " = " + menor);
        System.out.println("La inflación anual es " + sumatoria + "%");
        System.out.println("El promedio de inflación es " + sumatoria / 12 + "%");
    }

}
