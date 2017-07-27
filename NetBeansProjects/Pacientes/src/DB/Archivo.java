package DB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {
    
    static BufferedReader in;
    static BufferedWriter out;
    
    public static void abrirArchivo(File archivo) throws Exception {
        in = new BufferedReader(new FileReader(archivo));
    }

    public static String leerLinea() throws Exception {
        String lineaLeida = in.readLine();
        return lineaLeida;
    }

    public static void escribirArchivo(String x, File archivo) throws Exception {
        out = new BufferedWriter(new FileWriter(archivo, true));
        out.write(x);
        out.newLine();
        out.close();
    }

    public static void cerrarArchivo() throws Exception {
        in.close();
        System.out.println("Archivo cerrado");
    }

}
