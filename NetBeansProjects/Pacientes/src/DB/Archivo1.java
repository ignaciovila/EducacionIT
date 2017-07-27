package DB;

import GUI.Frame;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Archivo1 extends Archivo {

    public static File archivo;
    static FileWriter fw = null;

    public static void crearArchivo() {
        archivo = new File("Pacientes.txt");
        if (!archivo.exists()) {
            try {
                fw = new FileWriter("Pacientes.txt");
                archivo = new File("Pacientes.txt");
            } catch (IOException ex) {
                System.out.println("Error 5");
            }
        }
    }

    public static void escribirArchivo(String[][] x) throws Exception {
        out = new BufferedWriter(new FileWriter(archivo, true));
        for (int i = 0; x[i][2] != null; i++) {
            int V = 0;
            int cop = 0;
            out.write(LocalDateTime.now().toLocalDate().toString());
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] != null) {
                    switch (j) {
                        case 0:
                            out.write("\t | \t" + "Cantidad: " + x[i][j]);
                            break;
                        case 1:
                            out.write("\t | \t" + "Plan: " + x[i][j]);
                            break;
                        case 2:
                            out.write("\t | \t" + "Nocturna: " + x[i][j]);
                            break;
                        case 3:
                            out.write("\t | \t" + "Copago: " + x[i][j]);
                            break;
                        case 4:
                            if ("si".equals(x[i][3])) {
                                out.write("\t | \t" + "Valor: " + x[i][j]);
                            }
                            break;
                    }
                }
            }
            if ("O".equals(x[i][1])) {
                if ("no".equals(x[i][2])) {
                    V = Frame.getO();
                } else {
                    V = Frame.getOnoct();
                }
            } else {
                if ("no".equals(x[i][2])) {
                    V = Frame.getOtros();
                } else {
                    V = Frame.getOtrosnoct();
                }
            }
            if ("si".equals(x[i][3])) {
                cop += (Integer.parseInt(x[i][4])) * (Integer.parseInt(x[i][0]));
            }

            V = Integer.parseInt(x[i][0]) * V + cop;

            out.write("\t | \t" + "Ganancia: " + V);
            
            out.newLine();
        }

        out.close();
    }
}
