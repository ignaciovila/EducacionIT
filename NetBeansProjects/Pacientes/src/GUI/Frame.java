package GUI;

import DB.Archivo1;
import DB.Archivo2;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {

    public static int getZ() {
        return z;
    }

    public static void setZ(int aZ) {
        z = aZ;
    }

    private String[][] mat = new String[250][5];
    private int k = 0;
    private int i = 0;
    private int total = 0;
    private int totalf = 0;
    private int totdetot = 0;
    private int totdetotf = 0;
    private int v = 0;
    private int canttot = 0;
    private int first = 0;
    private int first2 = 0;
    private int cop = 0;
    private boolean aceptar;
    private boolean totalplanilla;
    private boolean totaldeplanillas;
    private static int o;
    private static int onoct;
    private static int otros;
    private static int otrosnoct;
    public static InternalFrame actualizar = new InternalFrame();
    private static int z;

    public Frame() {
        initComponents();
        copago.setVisible(false);
        lcopago.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        lcant = new javax.swing.JLabel();
        lplan = new javax.swing.JLabel();
        lnoct = new javax.swing.JLabel();
        lexiste = new javax.swing.JLabel();
        salida = new javax.swing.JLabel();
        salida2 = new javax.swing.JLabel();
        lcopago = new javax.swing.JLabel();
        cant = new javax.swing.JTextField();
        noct = new javax.swing.JCheckBox();
        existe = new javax.swing.JCheckBox();
        copago = new javax.swing.JTextField();
        seguir = new javax.swing.JButton();
        parar = new javax.swing.JButton();
        tot = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        deshacer = new javax.swing.JButton();
        cvalores = new javax.swing.JButton();
        DP = new javax.swing.JDesktopPane();
        plan = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CALCULADORA DE FACTURACIÓN");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titulo.setPreferredSize(new java.awt.Dimension(100, 14));

        lcant.setText("Cantidad de pacientes");

        lplan.setText("Plan (en minúsculas)");

        lnoct.setText("Nocturna");

        lexiste.setText("Copago");

        salida.setText("Ganancia");

        salida2.setText("Deuda prepaga");

        lcopago.setText("¿De cuánto?");

        existe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                existeMouseClicked(evt);
            }
        });

        seguir.setText("Aceptar");
        seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguirMouseClicked(evt);
            }
        });

        parar.setText("Total planilla");
        parar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pararMouseClicked(evt);
            }
        });

        tot.setText("Total de planillas");
        tot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totMouseClicked(evt);
            }
        });

        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        deshacer.setText("Deshacer");
        deshacer.setPreferredSize(new java.awt.Dimension(100, 25));
        deshacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deshacerMouseClicked(evt);
            }
        });

        cvalores.setText("Cambiar valores");
        cvalores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvaloresMouseClicked(evt);
            }
        });

        DP.setBackground(new java.awt.Color(240, 240, 240));
        DP.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout DPLayout = new javax.swing.GroupLayout(DP);
        DP.setLayout(DPLayout);
        DPLayout.setHorizontalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        DPLayout.setVerticalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        plan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "F", "XXI", "Skill" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lnoct)
                        .addGap(86, 86, 86)
                        .addComponent(noct))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lexiste)
                        .addGap(93, 93, 93)
                        .addComponent(existe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lcopago)
                        .addGap(38, 38, 38)
                        .addComponent(copago, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salida2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tot))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deshacer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cvalores, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lcant)
                            .addComponent(lplan))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lcant))
                    .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lplan)
                    .addComponent(plan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lnoct))
                    .addComponent(noct))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lexiste))
                    .addComponent(existe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lcopago))
                    .addComponent(copago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seguir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deshacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvalores))
                        .addGap(18, 18, 18)
                        .addComponent(salida)
                        .addGap(4, 4, 4)
                        .addComponent(salida2))
                    .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguirMouseClicked
        try{
			int p = Integer.parseInt(cant.getText());
		}catch(Exception e){
			JOptionPane.showMessageDialog(this, "Compruebe los datos ingresados");
			return;
		}
		ingreso();
        resetentrada();
        resetsalida();

        setAceptar(true);
        setTotalplanilla(false);
        setTotaldeplanillas(false);
    }//GEN-LAST:event_seguirMouseClicked

    private void pararMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pararMouseClicked
        totales();
        sumadetotales();
        muestro();
        try {
            Archivo1.escribirArchivo(mat);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        resetvalues();
        resetentrada();
        setFirst2(getFirst()); //resguardo valor por si hay que volver para atrás
        setFirst(getK()); //fin de planilla, nuevo puntero de inicio

        setAceptar(false);
        setTotalplanilla(true);
        setTotaldeplanillas(false);
    }//GEN-LAST:event_pararMouseClicked

    private void totMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totMouseClicked
        salida.setText("");
        salida2.setText("La prepaga le debe " + getTotdetotf());

        setAceptar(false);
        setTotalplanilla(false);
        setTotaldeplanillas(true);

    }//GEN-LAST:event_totMouseClicked

    private void existeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_existeMouseClicked
        copago.setVisible(existe.isSelected());
        lcopago.setVisible(existe.isSelected());

    }//GEN-LAST:event_existeMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        resetarray();
		resetvalues();
        resetvalues2();
		resetvalues3();
        resetentrada();
        resetsalida();
        setAceptar(false);
        setTotalplanilla(false);
        setTotaldeplanillas(true);
    }//GEN-LAST:event_resetMouseClicked

    private void deshacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshacerMouseClicked
        if (isAceptar()) {
            setI(getI() - Integer.parseInt(getMat()[getK() - 1][3]));
            for (int j = 0; j < getMat()[j].length; j++) {
                getMat()[getK() - 1][j] = null;
            }
            setK(getK() - 1);
            resetentrada();
            resetsalida();
        }

        if (isTotalplanilla()) {
            for (int m = getFirst2(); m < getK(); m++) {
                setCanttot(getCanttot() - Integer.parseInt(getMat()[m][3]));
                if ("O".equals(getMat()[m][0])) {
                    if ("no".equals(getMat()[m][1])) {
                        setV(getO());
                    } else {
                        setV(getOnoct());
                    }
                } else {
                    if ("no".equals(getMat()[m][1])) {
                        setV(getOtros());
                    } else {
                        setV(getOtrosnoct());
                    }
                    if ("si".equals(getMat()[m][4])) {
                        setCop(getCop() + (Integer.parseInt(getMat()[m][2])) * (Integer.parseInt(getMat()[m][3])));
                    }
                }
                setTotal(getTotal() - getV() * (Integer.parseInt(getMat()[m][3])));
            }
            setTotalf(getTotalf() - getTotal() - getCop());
            setTotdetot(getTotdetot() - getTotal());
            setTotdetotf(getTotdetotf() - getTotalf());

            for (int j = getFirst2(); j < getK(); j++) {
                for (int l = 0; l < getMat()[j].length; l++) {
                    getMat()[j][l] = null;
                }
            }
            resetentrada();
            resetsalida();
            setFirst(getFirst2()); //restauro valor de first
        }

        if (isTotaldeplanillas()) {
            resetsalida();
        }

        setAceptar(false);
        setTotalplanilla(false);
        setTotaldeplanillas(false);

    }//GEN-LAST:event_deshacerMouseClicked

    private void cvaloresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvaloresMouseClicked
        actualizar.setVisible(true);
    }//GEN-LAST:event_cvaloresMouseClicked

    public void ingreso() {
			getMat()[getK()][0] = cant.getText();
            if ("O".equals(plan.getSelectedItem().toString())) {
                getMat()[getK()][1] = "O";
            } else {
                getMat()[getK()][1] = plan.getSelectedItem().toString();
            }
            if (noct.isSelected()) {
                getMat()[getK()][2] = "si";
            } else {
                getMat()[getK()][2] = "no";
            }
            if (existe.isSelected()) {
                getMat()[getK()][3] = "si";
            } else {
                getMat()[getK()][3] = "no";
            }
            getMat()[getK()][4] = copago.getText();
            setI(getI() + Integer.parseInt(cant.getText()));
            setK(getK() + 1);
    }

    public static int o() {
        int x = 0;
        String numero = "";
        try {
            Archivo2.abrirArchivo(Archivo2.archivo);
            char[] vector = Archivo2.leerLinea().toCharArray();
            for (z = 0; ',' != (vector[z]); z++) {
                numero += valueOf(vector[z]);
            }
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            System.out.println("Error 1: " + ex.toString());
        }
        return x;
    }

    public static int onoct() {
        int x = 0;
        String numero = "";
        try {
            Archivo2.abrirArchivo(Archivo2.archivo);
            char[] vector = Archivo2.leerLinea().toCharArray();
            for (z++; ',' != (vector[z]); z++) {
                numero += valueOf(vector[z]);
            }
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            System.out.println("Error 2: " + ex.toString());
        }
        return x;
    }

    public static int otros() {
        int x = 0;
        String numero = "";
        try {
            Archivo2.abrirArchivo(Archivo2.archivo);
            char[] vector = Archivo2.leerLinea().toCharArray();
            for (z++; ',' != (vector[z]); z++) {
                numero += valueOf(vector[z]);
            }
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            System.out.println("Error 3: " + ex.toString());
        }
        return x;
    }

    public static int otrosnoct() {
        int x = 0;
        String numero = "";
        try {
            Archivo2.abrirArchivo(Archivo2.archivo);
            char[] vector = Archivo2.leerLinea().toCharArray();
            for (z++; z < vector.length; z++) {
                numero += valueOf(vector[z]);
            }
            x = Integer.parseInt(numero);
        } catch (Exception ex) {
            System.out.println("Error 4: " + ex.toString());
        }
        return x;
    }

    public void totales() {
        for (int m = getFirst(); m < getK(); m++) {
            if ("O".equals(getMat()[m][1])) {
                if ("no".equals(getMat()[m][2])) {
                    setV(getO());
                } else {
                    setV(getOnoct());
                }
            } else {
                if ("no".equals(getMat()[m][2])) {
                    setV(getOtros());
                } else {
                    setV(getOtrosnoct());
                }
                if ("si".equals(getMat()[m][3])) {
                    setCop(getCop() + (Integer.parseInt(getMat()[m][4])) * (Integer.parseInt(getMat()[m][0])));
                }
            }
            setTotal(getTotal() + getV() * (Integer.parseInt(getMat()[m][0])));
        }
        setTotalf(getTotal() - getCop());
    }

    public void sumadetotales() {
        setTotdetot(getTotdetot() + getTotal());
        setTotdetotf(getTotdetotf() + getTotalf());
        setCanttot(getCanttot() + getI());
    }

    public void muestro() {
        salida.setText("Usted realizó " + getI() + " visita" + (getI() == 1 ? "" : "s") + " y gano " + getTotal() + " pesos");
        salida2.setText("La prepaga le debe " + getTotalf());
    }

    public void resetarray() {
        for (String[] mat1 : getMat()) {
            for (int l = 0; l < mat1.length; l++) {
                mat1[l] = null;
            }
        }
        setK(0);
    }

    public void resetentrada() {
        cant.setText("");
        copago.setText("");
        existe.setSelected(false);
        noct.setSelected(false);
        copago.setVisible(false);
        lcopago.setVisible(false);
    }

    public void resetsalida() {
        salida.setText("Ganancia");
        salida2.setText("Deuda prepaga");

    }

	public void resetvalues() {
        setI(0);
        setCop(0);
        setTotal(0);
        setTotalf(0);
    }
	
    public void resetvalues2() {
        setTotdetot(0);
        setTotdetotf(0);
        setCanttot(0);
    }
	
	public void resetvalues3(){
        setK(0);
        setFirst(0);
        setFirst2(0);
        setV(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DP;
    public static javax.swing.JTextField cant;
    public static javax.swing.JTextField copago;
    private javax.swing.JButton cvalores;
    public static javax.swing.JButton deshacer;
    public static javax.swing.JCheckBox existe;
    public static javax.swing.JLabel lcant;
    public static javax.swing.JLabel lcopago;
    public static javax.swing.JLabel lexiste;
    public static javax.swing.JLabel lnoct;
    public static javax.swing.JLabel lplan;
    public static javax.swing.JCheckBox noct;
    public static javax.swing.JButton parar;
    private javax.swing.JComboBox plan;
    public static javax.swing.JButton reset;
    public static javax.swing.JLabel salida;
    public static javax.swing.JLabel salida2;
    public static javax.swing.JButton seguir;
    public static javax.swing.JLabel titulo;
    public static javax.swing.JButton tot;
    // End of variables declaration//GEN-END:variables

    public String[][] getMat() {
        return mat;
    }

    public void setMat(String[][] mat) {
        this.mat = mat;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalf() {
        return totalf;
    }

    public void setTotalf(int totalf) {
        this.totalf = totalf;
    }

    public int getTotdetot() {
        return totdetot;
    }

    public void setTotdetot(int totdetot) {
        this.totdetot = totdetot;
    }

    public int getTotdetotf() {
        return totdetotf;
    }

    public void setTotdetotf(int totdetotf) {
        this.totdetotf = totdetotf;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getCanttot() {
        return canttot;
    }

    public void setCanttot(int canttot) {
        this.canttot = canttot;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getFirst2() {
        return first2;
    }

    public void setFirst2(int first2) {
        this.first2 = first2;
    }

    public int getCop() {
        return cop;
    }

    public void setCop(int cop) {
        this.cop = cop;
    }

    public boolean isAceptar() {
        return aceptar;
    }

    public void setAceptar(boolean aceptar) {
        this.aceptar = aceptar;
    }

    public boolean isTotalplanilla() {
        return totalplanilla;
    }

    public void setTotalplanilla(boolean totalplanilla) {
        this.totalplanilla = totalplanilla;
    }

    public boolean isTotaldeplanillas() {
        return totaldeplanillas;
    }

    public void setTotaldeplanillas(boolean totaldeplanillas) {
        this.totaldeplanillas = totaldeplanillas;
    }

    public static int getO() {
        return o;
    }

    public static void setO(int o) {
        Frame.o = o;
    }

    public static int getOnoct() {
        return onoct;
    }

    public static void setOnoct(int onoct) {
        Frame.onoct = onoct;
    }

    public static int getOtros() {
        return otros;
    }

    public static void setOtros(int otros) {
        Frame.otros = otros;
    }

    public static int getOtrosnoct() {
        return otrosnoct;
    }

    public static void setOtrosnoct(int otrosnoct) {
        Frame.otrosnoct = otrosnoct;
    }
}
