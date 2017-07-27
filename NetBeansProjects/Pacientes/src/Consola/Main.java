package Consola;

import GUI.Frame;

public class Main {

    public static void main(String[] args) {
        try {
            new Frame().setVisible(true);
            DB.Archivo1.crearArchivo();
            DB.Archivo2.crearArchivo();
            Frame.setO(Frame.o());
            Frame.setOnoct(Frame.onoct());
            Frame.setOtros(Frame.otros());
            Frame.setOtrosnoct(Frame.otrosnoct());
        } catch (Exception ex) {
            System.out.println("Error al mostrar Frame");
        }

    }

}
