/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liborio
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String RecibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void HabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void DeshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void LimpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void TablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void DiagonalSecundaria(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (nc - 1 - i == j) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void TriangularSuperior(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == j || j >= i) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void TriangularInferior(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == j || j <= i) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void TraspuestaALaIngresada(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(Aux, j, i);
            }
        }
    }

    public static void LaLetraA(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == (nf - 1) / 2 || j == (nc - 1)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraZ(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == (nf - 1) || nc - 1 - i == j) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraT(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == (nc / 2)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraV(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (j == i / 2 || j == nf - 1 - i / 2) {
                    tabla2.setValueAt(Aux, i, j);

                }
            }
        }
    }

    public static void LaLetraE(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == (nf - 1) || j == 0 || i == (nf / 2)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraF(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == 0 || i == (nf / 2)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraP(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == nf / 2) || (j == nc - 1 && j / i >= 2)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraI(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (j == (nc / 2)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraN(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == j || j == (nc - 1)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraY(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 && j <= i || (i + j == nf - 1 && i <= j) || (i == j && i + j <= nf)) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }

    public static void LaLetraX(JTable tabla1, JTable tabla2) {

        int nf, nc, Aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                Aux = (int) tabla1.getValueAt(i, j);
                if ((i) == j || nc - 1 - i == j) {
                    tabla2.setValueAt(Aux, i, j);
                }
            }
        }
    }
}
