package DB;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Stream {
//metodo leer
    public static void leer() throws Exception {
        //define el archivo a utilizar
        File archivoEntrada = new File("c:/Pacientes.txt");

        //abre el stream
        //agrego un throw
        FileReader in = new FileReader(archivoEntrada);

        int Caracter;
        while ((Caracter = in.read()) != -1) {
            System.out.print((char) Caracter);//print solo para q no quede vertical
        }

        //cerrar el string
        in.close();
    }

    public static void escribir() throws Exception {
        //defino el archivo a escribir
        File archivoSalida = new File("c:/Pacientes.txt");

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
        File archivoSalida = new File("c:/Pacientes.txt");
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