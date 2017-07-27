/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercitación1;

/**
 *
 * @author Ignacio
 */
public class Ejercitación1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Problema 1
        int nro1 = 100, nro2 = 500, nro3 = 700;
        if (nro1 > nro2 && nro1 > nro3) {
            System.out.println("el número 1 es el mayor");
        } else if (nro2 > nro1 && nro2 > nro3) {
            System.out.println("el número 2 es el mayor");
        } else {
            System.out.println("el número 3 es el mayor");
        }
        //Problema 1 variante
        if (nro1 > nro2) {
            if (nro1 > nro3) {
                System.out.println("el número 1 es el mayor");
            } else {
                System.out.println("el número 3 es el mayor");
            }

        } else if (nro2 > nro3) {
            System.out.println("el número 2 es el mayor");
        } else {
            System.out.println("el número 3 es el mayor");
        }

        //Problema 2
        int a = 10, b = -2, c = 5;
        if (a < 0) {
            System.out.println(b * c);
        } else if (b < 0) {
            System.out.println(a * c);
        } else {
            System.out.println(a * b);
        }
        //Problema 3
        String usuario = "Pepito", clave = "educacionIT";
        if (usuario.equals("Pepito") & clave.equals("educacionIT")) {
            System.out.print("Bienvenido ");
            System.out.println(usuario);
        } else if (!(usuario.equals("Pepito"))) {
            System.out.println("Usuario inexistente");
        } else {
            System.out.println("El usuario y la contraseña no coinciden");
        }
        //Problema 3 bis
        if (usuario.equals("Pepito")) {
            if (clave.equals("educacionIT")) {
                System.out.print("Bienvenido ");
                System.out.println(usuario);
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Usuario inexistente");
        }
       
    }

}
