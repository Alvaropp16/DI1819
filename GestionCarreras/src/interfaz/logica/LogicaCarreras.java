/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.logica;

import dto.Carreras;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnop
 */
public class LogicaCarreras implements Serializable {

    //private static LogicaCarreras logica;
    private List<Carreras> listaCarreras;
    private List<Carreras> listaCarrerasFinalizadas=new ArrayList<>();;

    public LogicaCarreras() {
        listaCarreras = new ArrayList<>();
    }

    public void altaCarreras(String nombre, Date fechadecarrera, String lugar, int maxparticipantes) {

        Carreras c = new Carreras(nombre, fechadecarrera, lugar, maxparticipantes);
        listaCarreras.add(c);

    }

    public List<Carreras> getListaCarreras() {
        return listaCarreras;
    }

    public List<Carreras> getListaCarrerasFinalizadas() {
        return listaCarrerasFinalizadas;
    }
    
}
