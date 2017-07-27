/*[
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boca;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Boca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese fecha del campeonato para saber rival");
        Scanner s = new Scanner(System.in);
        int fecha = s.nextInt();        
        switch (fecha) {
            case 1: 
                System.out.println("Newell's");
                break;
            case 2:
                System.out.println("Belgrano");
                break;
            case 3: System.out.println("Atlético de Rafaela");
                break;
            case 4: System.out.println("Estudiantes de La Plata");
                break;
            case 5: System.out.println("Vélez");
                break;
            case 6: System.out.println("Olimpo");
                break;
            case 7: System.out.println("Racing");
                break;
            case 8: System.out.println("Banfield");
                break;
            case 9: System.out.println("Quilmes");
                break;
            case 10: System.out.println("Riber");
                break;
            case 11: System.out.println("Rosario Central");
                break;
            case 12: System.out.println("Godoy Cruz");
                break;
            case 13: System.out.println("Defensa y Justicia");
                break;
            case 14: System.out.println("San Lorenzo");
                break;
            case 15: System.out.println("Tigre");
                break;
            case 16: System.out.println("Arsenal");
                break;
            case 17: System.out.println("Independiente");
                break;
            case 18: System.out.println("Lanús");
                break;
            case 19: System.out.println("Gimnasia");
                break;
        }

    }

}
