/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnop
 */
public class Carreras implements Serializable{

    private String nombre;
    private Date fechadecarrera;
    private String lugar;
    private int maxparticipantes;
    private List<Corredorcondorsal> listaCorredoresdorsal=new ArrayList<>();
    private int dorsal=0;
    private boolean enmarcha=true;

    public Carreras(String nombre, Date fechadecarrera, String lugar, int maxparticipantes) {
        this.nombre = nombre;
        this.fechadecarrera = fechadecarrera;
        this.lugar = lugar;
        this.maxparticipantes = maxparticipantes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadecarrera() {
        return fechadecarrera;
    }

    public void setFechadecarrera(Date fechadecarrera) {
        this.fechadecarrera = fechadecarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaxparticipantes() {
        return maxparticipantes;
    }

    public void setMaxparticipantes(int maxparticipantes) {
        this.maxparticipantes = maxparticipantes;
    }

    public List<Corredorcondorsal> getListaCorredores() {
        return listaCorredoresdorsal;
    }

    public void setListaCorredores(List<Corredorcondorsal> listaCorredores) {
        this.listaCorredoresdorsal = listaCorredores;
    }

    public boolean isEnmarcha() {
        return enmarcha;
    }

    public void setEnmarcha(boolean enmarcha) {
        this.enmarcha = enmarcha;
    }
    
    
    public void inscribirparticipante(Corredor corredor){
        Corredorcondorsal participantes=new Corredorcondorsal(dorsal, null, corredor);
        listaCorredoresdorsal.add(participantes);
        dorsal++;
    }

}
