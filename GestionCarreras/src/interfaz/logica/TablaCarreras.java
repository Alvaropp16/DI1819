/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.logica;

import dto.Carreras;
import dto.Corredor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnop
 */
public class TablaCarreras extends AbstractTableModel {

    private final List<Carreras> listaCarreras;
    private final String[] columnas = {"Nombre", "Lugar", "Max participantes", "Fecha"};
    private SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

    public TablaCarreras(List<Carreras> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
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
                return listaCarreras.get(rowIndex).getNombre();
            case 1:
                return listaCarreras.get(rowIndex).getLugar();
            case 2:
                return listaCarreras.get(rowIndex).getMaxparticipantes();
            case 3:
                Date fecha = listaCarreras.get(rowIndex).getFechadecarrera();
                String fechaString = format.format(fecha);
                return fechaString;
        }
        return null;
    }

}
