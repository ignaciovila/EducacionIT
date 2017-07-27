/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg07.parte.pkg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author educacionit
 */
class Stream {

    //metodo leer
    public static void leer() throws Exception {
        //define el archivo a utilizar
        File archivoEntrada = new File("c:/fuente.txt");

        //abre el stream
        //agrego un throw
        FileReader in = new FileReader(archivoEntrada);

        int unCaracter;
        while ((unCaracter = in.read()) != -1) {
            System.out.print((char) unCaracter);//print solo para q no quede vertical
        }

        //cerrar el string
        in.close();
    }

    public static void escribir() throws Exception {
        //defino el archivo a escribir
        File archivoSalida = new File("c:/fuente.txt");

        //abro stream
        FileWriter out = new FileWriter(archivoSalida);
        String info = "educacion it";

        //escribe el archivo
        for (int i = 0; i < info.length(); i++) {
            out.write(info.charAt(i));
        }
        //cierro el stream
        out.close();
    }

    public static void agregar() throws Exception {
        //Defino el archivo a escribir
        File archivoSalida = new File("c:/fuente.txt");
        //Abro el Stream de salida ,true parametro de modo append
        FileWriter out = new FileWriter(archivoSalida, true);

        String info = "\n Agregar Texto";

        //Escribo el archivo
        for (int a = 0; a < info.length(); a++) {
            out.write(info.charAt(a));
        }

        //Cierro el Stream
        out.close();
    }
}

class StreamBin {

    public static void copiar() throws Exception {
        //Defino los archivos a usar
        File entrada = new File("c:/Java.jpg");
        File salida = new File("c:/salida.jpg");

        //Abre los Streams necesarios
        FileInputStream in = new FileInputStream(entrada);
        FileOutputStream out = new FileOutputStream(salida);

        int caracter;

        //Copia el archivo fuente al destino
        while ((caracter = in.read()) != -1) {
            out.write(caracter);
        }

        //Cerramos los Streams
        in.close();
        out.close();

    }
}

class Archivo {

    // Instancia un objeto del tipo BufferedReader
    // y BufferedWriter

    static File archivo = new File("c:/fuente.txt");
    static BufferedReader in;
    static BufferedWriter out;

    public static void abrirArchivo() throws Exception {
        in = new BufferedReader(new FileReader(archivo));
    }

    public static String leerLinea() throws Exception {
        //Lee una linea del archivo fuente.txt
        String lineaLeida = in.readLine();
        return lineaLeida;
    }

    public static void cerrarArchivo() throws Exception {
        in.close();
        System.out.println("Archivo cerrado");
    }

    public static void escribirArchivo(String x) throws Exception {
        out = new BufferedWriter(new FileWriter(archivo, true));
        out.write(x);
        out.newLine();
        out.close();
    }

}

public class Clase07Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Versión de Java:" + System.getProperty("java.version"));

//        try {
//            Stream.leer();
//            Stream.escribir();
//            Stream.agregar();
//            
//            StreamBin.copiar();
//
//        } catch (Exception ex) {
//            System.out.println("se produjo un error");
//        }
        // Manejo de buffers
        String x;

        try {
            Archivo.abrirArchivo();

            Archivo.escribirArchivo("lunes");
            Archivo.escribirArchivo("martes");
            Archivo.escribirArchivo("miercoles");
            Archivo.escribirArchivo("jueves");
            Archivo.escribirArchivo("viernes");
            Archivo.escribirArchivo("sabado");
            Archivo.escribirArchivo("domingo");

            do {
                x = Archivo.leerLinea();
                if (x != null) {
                    System.out.println(x);
                }
            } while (x != null);

            Archivo.cerrarArchivo();

        } catch (Exception ex) {
            System.out.println("Se produjo un error");
        }

    }
}
