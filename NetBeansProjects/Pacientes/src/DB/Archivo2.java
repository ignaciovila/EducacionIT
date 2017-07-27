package DB;

import GUI.InternalFrame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo2 extends Archivo {

    public static File archivo;
    static FileWriter fw = null;

    public static void crearArchivo() {
    archivo = new File("Valores.txt");
        if (!archivo.exists()) {
            try {
                fw = new FileWriter("Valores.txt");
                archivo = new File("Valores.txt");
                try {
                    escribirArchivo(168,212,146,168);
                } catch (Exception ex) {
                    System.out.println("Error de escritura");
                }
            } catch (IOException ex) {
                System.out.println("Error 5");
            }
        }
    }

    public static void escribirArchivo() throws Exception {
        out = new BufferedWriter(new FileWriter(archivo, false));
        out.write(InternalFrame.txtO.getText() + ","
                + InternalFrame.txtOnoct.getText() + ","
                + InternalFrame.txtOtros.getText() + ","
                + InternalFrame.txtOtrosnoct.getText());
        out.close();
    }
    
     public static void escribirArchivo(int o, int onoct, int otros, int otrosnoct) throws Exception {
        out = new BufferedWriter(new FileWriter(archivo, false));
        out.write(o + "," + onoct + "," + otros + "," + otrosnoct);
        out.close();
    }
}
