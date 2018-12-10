/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Cronometro extends JLabel implements Serializable {

    private int dorsal;
    private boolean carrerafinzalizada = false;
    private int numsegundos, numminutos, numhoras;
    String tiempo;
    private LlegadaCorredor llegadaCorredor;

    public Cronometro() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                dorsal = Integer.parseInt(JOptionPane.showInputDialog("Escribe el dorsal"));

                if (llegadaCorredor != null) {
                    llegadaCorredor.ejecutar(dorsal, tiempo);
                }
            }

        });
    }

    public void addLlegadaCorredor(LlegadaCorredor llegadaCorredor) {
        this.llegadaCorredor = llegadaCorredor;
    }

    public void start() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (carrerafinzalizada == false) {

                    tiempo = (numhoras <= 9 ? "0" : "") + numhoras + ":" + (numminutos <= 9 ? "0" : "") + numminutos + ":" + (numsegundos <= 9 ? "0" : "") + numsegundos;
                    setText(Integer.toString(numhoras) + ":" + Integer.toString(numminutos) + ":" + Integer.toString(numsegundos));
                    numsegundos++;
                    setText(tiempo);
                    if (numsegundos == 60) {
                        numminutos++;
                        numsegundos = 0;
                    }
                    if (numminutos == 60) {
                        numhoras++;
                        numminutos = 0;
                    }
                } else {
                    this.cancel();
                }
            }
        }, 0, 1000);

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getNumsegundos() {
        return numsegundos;
    }

    public void setNumsegundos(int numsegundos) {
        this.numsegundos = numsegundos;
    }

    public boolean isCarrerafinzalizada() {
        return carrerafinzalizada;
    }

    public void setCarrerafinzalizada(boolean carrerafinzalizada) {
        this.carrerafinzalizada = carrerafinzalizada;
    }
    

}
