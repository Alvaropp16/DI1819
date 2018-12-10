/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import cronometro.LlegadaCorredor;
import interfaz.logica.LogicaCarreras;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.openide.util.Exceptions;

/**
 *
 * @author Alvaro Perez
 */
public class IniciarCarrera extends javax.swing.JDialog {

    private LogicaCarreras logicaCarreras;
    private int seleccion;
    private Date tiempocorredor;
    private SimpleDateFormat formatoDelTexto = new SimpleDateFormat("HH:mm:ss");

    /**
     * Creates new form IniciarCarrera
     */
    public IniciarCarrera(java.awt.Dialog parent, boolean modal, LogicaCarreras logicaCarreras, int seleccion) {
        super(parent, modal);
        this.logicaCarreras = logicaCarreras;
        initComponents();
        this.seleccion = seleccion;
        getContentPane().setBackground(new Color(95, 158, 160));
        cronometro1.addLlegadaCorredor(new LlegadaCorredor() {
            @Override
            public void ejecutar(int dorsal, String tiempo) {
                boolean dorsalcorrecto = true;
                try {
                    tiempocorredor = formatoDelTexto.parse(tiempo);
                } catch (ParseException ex) {
                    Exceptions.printStackTrace(ex);
                }
                while (dorsalcorrecto) {
                    for (int i = 0; i < logicaCarreras.getListaCarreras().get(seleccion).getListaCorredores().size(); i++) {
                        if (logicaCarreras.getListaCarreras().get(seleccion).getListaCorredores().get(i).getDorsal() == dorsal) {
                            logicaCarreras.getListaCarreras().get(seleccion).getListaCorredores().get(i).setTiempo(tiempocorredor);
                            dorsalcorrecto = false;
                        }

                    }
                    if (dorsalcorrecto) {
                        dorsal = Integer.parseInt(JOptionPane.showInputDialog("Dorsal erroneo, escribe el dorsal correcto"));
                    }
                }

            }
        
    }


);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cronometro1 = new cronometro.Cronometro();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cronometro1.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.cronometro1.text")); // NOI18N
        cronometro1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        jButton1.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(org.openide.util.NbBundle.getMessage(IniciarCarrera.class, "IniciarCarrera.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cronometro1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cronometro1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cronometro1.start();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cronometro1.setCarrerafinzalizada(true);
        JOptionPane.showMessageDialog(this,"La Carrera a sido finalizada");
        logicaCarreras.getListaCarrerasFinalizadas().add(logicaCarreras.getListaCarreras().get(seleccion));
        logicaCarreras.getListaCarreras().remove(seleccion);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cronometro.Cronometro cronometro1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}