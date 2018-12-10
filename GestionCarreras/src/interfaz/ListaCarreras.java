/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.Carreras;
import dto.Corredor;
import dto.Corredorcondorsal;
import interfaz.logica.LogicaCarreras;
import interfaz.logica.LogicaCorredores;
import interfaz.logica.TablaCarreras;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;

/**
 *
 * @author alumnop
 */
public class ListaCarreras extends javax.swing.JDialog {

    private LogicaCarreras logicaCarreras;
    private LogicaCorredores logicaCorredores;
    private DateFormat formato = new SimpleDateFormat("HH:mm:ss");

    /**
     * Creates new form ListaCarreras
     */
    public ListaCarreras(java.awt.Frame parent, boolean modal, LogicaCorredores lc, LogicaCarreras logicaCarreras) {
        super(parent, modal);
        getContentPane().setBackground(new Color(95, 158, 160));
        this.logicaCarreras = logicaCarreras;
        logicaCorredores = lc;
        initComponents();
        rellenarTablaCarreras();
        if (jTableCarreras.getSelectedRow() == -1) {
            jButtonCorredores.setEnabled(false);
            jButtonIniciar.setBackground(Color.red);
        }
    }

    private void rellenarTablaCarreras() {
        jTableCarreras.setModel(new TablaCarreras(logicaCarreras.getListaCarreras()));
        jTableCarreras1.setModel(new TablaCarreras(logicaCarreras.getListaCarrerasFinalizadas()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarreras = new javax.swing.JTable();
        jButtonModificar = new javax.swing.JButton();
        jButtonCorredores = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCarreras1 = new javax.swing.JTable();
        jButtonIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonAlta.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jTableCarreras.setBackground(new java.awt.Color(240, 240, 240));
        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarrerasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCarreras);

        jButtonModificar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonModificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonCorredores.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCorredores.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCorredores.setText("Corredores");
        jButtonCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresActionPerformed(evt);
            }
        });

        jTableCarreras1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCarreras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarreras1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCarreras1);

        jButtonIniciar.setText("INICIAR CARRERA");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Añadir/Ver Corredores:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CARRERAS PROGRAMADAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CARRERAS FINALIZADAS");

        Exportar.setText("Exportar");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exportar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonCorredores)
                                    .addComponent(jLabel1))
                                .addGap(76, 76, 76))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlta)
                            .addComponent(jButtonModificar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCorredores))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        // TODO add your handling code here:

        PantallaCarreras pca = new PantallaCarreras(this, true, logicaCarreras);
        pca.setLocationRelativeTo(null);
        pca.setVisible(true);
        rellenarTablaCarreras();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        int seleccion = jTableCarreras.getSelectedRow();
        int seleccion2 = jTableCarreras1.getSelectedRow();
        if (seleccion != -1) {
            Carreras seleccionado = logicaCarreras.getListaCarreras().get(seleccion);
            PantallaCarreras modificado = new PantallaCarreras(this, true, seleccionado);
            modificado.setLocationRelativeTo(null);
            modificado.setVisible(true);
            rellenarTablaCarreras();
        } else if (seleccion2 != -1) {
            JOptionPane.showMessageDialog(this, "No puedes modificar una carrera ya finalizada");
        }

    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresActionPerformed
        // TODO add your handling code here:
        int seleccion = jTableCarreras.getSelectedRow();
        int seleccion2 = jTableCarreras1.getSelectedRow();
        if (seleccion != -1) {
            ListaCorredoresCarrera lcc = new ListaCorredoresCarrera(this, true, logicaCarreras, logicaCorredores, seleccion,false);
            lcc.setLocationRelativeTo(null);
            lcc.setVisible(true);
        } else if (seleccion2 != -1) {
            ListaCorredoresCarrera lcc = new ListaCorredoresCarrera(this, true, logicaCarreras, logicaCorredores, seleccion2,true);
            lcc.getjButtonAlta().setVisible(false);
            lcc.getjLabelAgregarparticipantes().setVisible(false);
            lcc.getjButtonBorrar().setVisible(false);
            lcc.setLocationRelativeTo(null);
            lcc.setVisible(true);
        }
    }//GEN-LAST:event_jButtonCorredoresActionPerformed

    private void jTableCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarrerasMouseClicked
        // TODO add your handling code here:
        jButtonCorredores.setEnabled(true);
        jButtonIniciar.setBackground(Color.GREEN);
    }//GEN-LAST:event_jTableCarrerasMouseClicked

    private void jTableCarreras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarreras1MouseClicked
        // TODO add your handling code here:4
        jButtonCorredores.setEnabled(true);
    }//GEN-LAST:event_jTableCarreras1MouseClicked

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        // TODO add your handling code here:
        int seleccion = jTableCarreras.getSelectedRow();
        IniciarCarrera iniciarCarrera = new IniciarCarrera(this, true, logicaCarreras, seleccion);
        iniciarCarrera.setVisible(true);
        iniciarCarrera.setLocationRelativeTo(null);
rellenarTablaCarreras();

    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog("Nombre del archivo");
        File archivo = new File(nombre + ".csv");
        int seleccion = jTableCarreras1.getSelectedRow();
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(archivo));
            StringBuilder sb = new StringBuilder();
            sb.append(logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).toString());
            for (int i = 0; i < logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).getListaCorredores().size(); i++) {
                String tiempo = formato.format(logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).getListaCorredores().get(i).getTiempo());
                System.out.println(tiempo);
                String cadena = logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).getListaCorredores().get(i).getDorsal() + "/" + formato.format(logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).getListaCorredores().get(i).getTiempo()) + "/" + logicaCarreras.getListaCarrerasFinalizadas().get(seleccion).getListaCorredores().get(i).getCorredor().getNombrecorredor();
                sb.append(cadena);
                System.out.println(cadena);
            }
            br.append(sb);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }


    }//GEN-LAST:event_ExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exportar;
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonCorredores;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableCarreras1;
    // End of variables declaration//GEN-END:variables
}
