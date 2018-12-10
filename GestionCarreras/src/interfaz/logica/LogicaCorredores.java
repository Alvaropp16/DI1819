/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.logica;

import dto.Corredor;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author alumnop
 */
public class LogicaCorredores implements Serializable {

    private static LogicaCorredores logica;

    private List<Corredor> listaCorredores;

    public LogicaCorredores() {

        listaCorredores = new ArrayList<Corredor>();
    }

    public static LogicaCorredores getInstance() {

        if (logica == null) {
            logica = new LogicaCorredores();
        }
        return logica;
    }

    public void altaCorredores(String nombre, String dni, String direccion, Date fecha, int telefono) {

        Corredor c = new Corredor(nombre, dni, direccion, fecha, telefono);
        listaCorredores.add(c);

    }

    public List<Corredor> getListaCorredores() {

        return listaCorredores;
    }

    public void borrar(int seleccion) {
        listaCorredores.remove(seleccion);

    }

}
