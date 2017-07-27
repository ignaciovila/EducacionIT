/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Ignacio
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         String[] array = new String[4];
         array[0] = "Juan";
         array[1] = "Pedro";
         array[2] = "María";
         array[3] = "Carlos";
         */
        String[] array = {"Juan", "Pedro", "María", "Carlos"};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hola " + array[i]);
        }
    }

}
