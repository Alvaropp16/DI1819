/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.logica;

import dto.Corredor;
import dto.Corredorcondorsal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alvaro Perez
 */
public class TablaParticipantes extends AbstractTableModel {

    private final List<Corredorcondorsal> listaCorredoresdorsal;
    private final String[] columnas = {"Dorsal", "Tiempo", "Dni"};
    private DateFormat formato = new SimpleDateFormat("HH:mm:ss");

    public TablaParticipantes(List<Corredorcondorsal> listaCorredoresdorsal) {
        this.listaCorredoresdorsal = listaCorredoresdorsal;
    }

    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaCorredoresdorsal.size();
    }

    //Devuelve el número de columnas
    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    //Devuelve la columna correspondiente al índice
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    //Este método se llamará una vez por cada una de las celdas que tenga la tabla
    //Evidentemente el número de llamadas a este método depende de lo que haya
    //devuelto la clase en getRowCount y getColumnCount.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCorredoresdorsal.get(rowIndex).getDorsal();
            case 1:
                if (listaCorredoresdorsal.get(rowIndex).getTiempo() != null) {
                    String tiempo = formato.format(listaCorredoresdorsal.get(rowIndex).getTiempo());

                    return tiempo;
                }
                else
                    return "";
            case 2:
                return listaCorredoresdorsal.get(rowIndex).getCorredor().getDni();
        }
        return null;
    }

}
