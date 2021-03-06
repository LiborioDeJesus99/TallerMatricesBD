/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liborio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
        cmbOperaciones.setEnabled(false);
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizResultante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInicial = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        txtNumeroColumnas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Operaciones con Matrices");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 410, 50));

        tblMatrizResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizResultante.setEnabled(false);
        jScrollPane1.setViewportView(tblMatrizResultante);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 320, 180));

        tblMatrizInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatrizInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblMatrizInicial);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, 180));

        cmbOperaciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diagonal Secundaria", "Triangular Superior", "Triangular Inferior", "Traspuesta A La Ingresada", "La Letra A", "La Letra Z", "La Letra T", "La Letra V", "La Letra E", "La Letra F", "La Letra P", "La Letra I", "La Letra N", "La Letra Y", "La Letra X" }));
        jPanel2.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 180, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 30, 80, -1));

        cmdLlenadoManual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, -1));

        cmdLlenadoAutomatico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 100, -1));

        cmdLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        cmdOperacion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdOperacion.setText("Operación");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 470, 70));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Número de Columnas: ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Número de Filas: ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        txtNumeroFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroFilasKeyTyped(evt);
            }
        });
        jPanel5.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, -1));

        txtNumeroColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColumnasKeyTyped(evt);
            }
        });
        jPanel5.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 40, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(894, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        if (txtNumeroFilas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El Numero De Filas");
            txtNumeroFilas.requestFocusInWindow();
            JButton botonesH[] = {cmdCrear, cmdLimpiar};
            JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
            Helper.HabilitarBotones(botonesH);
            Helper.DeshabilitarBotones(botonesD);
        } else if (txtNumeroColumnas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por Favor Ingrese El Numero De Columnas");
            txtNumeroColumnas.requestFocusInWindow();
            JButton botonesH[] = {cmdCrear, cmdLimpiar};
            JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
            Helper.HabilitarBotones(botonesH);
            Helper.DeshabilitarBotones(botonesD);
        } else {
            DefaultTableModel tm, tm2;
            int nf, nc;
            tm = (DefaultTableModel) tblMatrizInicial.getModel();
            tm2 = (DefaultTableModel) tblMatrizResultante.getModel();

            nf = Integer.parseInt(txtNumeroFilas.getText());
            nc = Integer.parseInt(txtNumeroColumnas.getText());

            tm.setRowCount(nf);
            tm.setColumnCount(nc);

            tm2.setRowCount(nf);
            tm2.setColumnCount(nc);

            JButton botonesH[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar};
            JButton botonesD[] = {cmdCrear, cmdOperacion};
            txtNumeroFilas.setEditable(false);
            txtNumeroColumnas.setEditable(false);
            cmbOperaciones.setEnabled(false);
            Helper.HabilitarBotones(botonesH);
            Helper.DeshabilitarBotones(botonesD);

        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed

        int nf, nc, res, aux;
        double n;
        boolean sw = true;

        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.RecibirDatos(this, "Por Favor Digite Elemento En La Posiciòn: [" + i + "][" + j + "]"));
                        tblMatrizInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Por Favor Ingrese Los Valores Correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            cmbOperaciones.setEnabled(false);
                            Helper.TablaPorDefecto(tblMatrizInicial);
                            Helper.TablaPorDefecto(tblMatrizResultante);
                        } else {
                            cmbOperaciones.setEnabled(true);

                            aux = 0;
                        }
                    }
                } while (aux == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed

        int aux, nf, nc;

        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) (Math.random() * 25 + 1);
                tblMatrizInicial.setValueAt(aux, i, j);
            }
            JButton botonesH[] = {cmdOperacion, cmdLimpiar};
            JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
            cmbOperaciones.setEnabled(true);
            Helper.HabilitarBotones(botonesH);
            Helper.DeshabilitarBotones(botonesD);
        }
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed

        int op, nf, nc, Aux;

        op = cmbOperaciones.getSelectedIndex();
        nf = tblMatrizInicial.getRowCount();
        nc = tblMatrizInicial.getColumnCount();

        Helper.LimpiarTabla(tblMatrizResultante);
        switch (op) {
            case 0:
                Helper.DiagonalSecundaria(tblMatrizInicial, tblMatrizResultante);
                break;
            case 1:
                Helper.TriangularSuperior(tblMatrizInicial, tblMatrizResultante);
                break;
            case 2:
                Helper.TriangularInferior(tblMatrizInicial, tblMatrizResultante);
                break;
            case 3:
                Helper.TraspuestaALaIngresada(tblMatrizInicial, tblMatrizResultante);
                break;
            case 4:
                Helper.LaLetraA(tblMatrizInicial, tblMatrizResultante);
                break;
            case 5:
                Helper.LaLetraZ(tblMatrizInicial, tblMatrizResultante);
                break;
            case 6:
                Helper.LaLetraT(tblMatrizInicial, tblMatrizResultante);
                break;
            case 7:
                Helper.LaLetraV(tblMatrizInicial, tblMatrizResultante);
                break;
            case 8:
                Helper.LaLetraE(tblMatrizInicial, tblMatrizResultante);
                break;
            case 9:
                Helper.LaLetraF(tblMatrizInicial, tblMatrizResultante);
                break;
            case 10:
                Helper.LaLetraP(tblMatrizInicial, tblMatrizResultante);
                break;
            case 11:
                Helper.LaLetraI(tblMatrizInicial, tblMatrizResultante);
                break;
            case 12:
                Helper.LaLetraN(tblMatrizInicial, tblMatrizResultante);
                break;
            case 13:
                Helper.LaLetraY(tblMatrizInicial, tblMatrizResultante);
                break;
            case 14:
                Helper.LaLetraX(tblMatrizInicial, tblMatrizResultante);
                break;
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoAutomatico, cmdLlenadoManual};
        cmbOperaciones.setEnabled(true);
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        Helper.TablaPorDefecto(tblMatrizInicial);
        Helper.TablaPorDefecto(tblMatrizResultante);

        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.setEditable(true);
        txtNumeroColumnas.setEditable(true);
        txtNumeroFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
        cmbOperaciones.setEnabled(false);
        Helper.HabilitarBotones(botonesH);
        Helper.DeshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumeroFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroFilasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroFilasKeyTyped

    private void txtNumeroColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColumnasKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColumnasKeyTyped
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMatrizInicial;
    private javax.swing.JTable tblMatrizResultante;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
