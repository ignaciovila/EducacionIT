package Clase4;

import java.util.Arrays;
public class Clase4 {

    public static void main(String[] args) {

        System.out.println("PRUEBAS");
        for (int n = 1; n <= 5; n++) {
            System.out.print("0 ");
        }
        System.out.println();
        //CREAR VECTOR CON NÚMEROS DE UNO A DIEZ
        int[] array = new int[10];
        for (int i = 0; i <= 9; i++) {
            array[i] = i + 1;
        }
        //IMPRIMIR DETERMINAD POSICIÓN DE UN VECTOR
        System.out.println(array[4]);
        //IMPRIMIR TODO EL VECTOR
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        //otra forma de crear el array cuando conocemos los valores
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println();

        System.out.println("FUNCIONES CON ARRAYS");
        String ss = Arrays.toString(a);
        System.out.println(ss);
        System.out.println(Arrays.equals(array, a));
        Arrays.sort(a);
        System.arraycopy(array, 0, a, 0, a.length); //(src, srcPos, dest, destPos, cant)
        for (int cont = 0; cont < a.length; cont++) {
            System.out.print(a[cont] + " ");

        }
    }
}
