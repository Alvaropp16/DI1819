/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.logica;

import dto.Corredor;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumnop
 */
public class TablaCorredores extends AbstractTableModel {

    private final List<Corredor> listaCorredores;
    private final String[] columnas = {"Nombre","Dni","Direccion","Telefono","Fecha"};
    private SimpleDateFormat format=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    
    public TablaCorredores(List<Corredor> listaCorredores)
    {
        this.listaCorredores = listaCorredores;
    }
    
    
    //Devuelve el número de filas que tendrá nuestra tabla. Depende del
    //tamaño de la lista
    @Override
    public int getRowCount() {
        return listaCorredores.size();
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
        switch (columnIndex)
        {
            case 0:
                return listaCorredores.get(rowIndex).getNombrecorredor();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
            case 2:
                return listaCorredores.get(rowIndex).getDireccion();
            case 3:
                return listaCorredores.get(rowIndex).getTelefono();
            case 4:
                Date fecha=listaCorredores.get(rowIndex).getFechadenacimineto();
                 String fechaString=format.format(fecha);
                return fechaString;
        }  
        return null;
}

    
}
