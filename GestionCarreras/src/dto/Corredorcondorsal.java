/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import interfaz.logica.LogicaCorredores;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alumnop
 */
public class Corredorcondorsal implements Serializable{


    private int dorsal;

    private Date tiempo;

    private Corredor corredor;

    public Corredorcondorsal(int dorsal,Date tiempo, Corredor corredor) {
        this.dorsal = dorsal;
        this.corredor = corredor;
        this.tiempo=tiempo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }
    
    

}
