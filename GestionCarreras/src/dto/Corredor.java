/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alumnop
 */
public class Corredor implements Serializable{
     
   private String nombrecorredor;
   private String dni;
   private String direccion;
   private  int telefono;
   private  Date fechadenacimineto;


    public Corredor(String nombre, String dni,  String direccion,Date fecha, int telefono) {
        this.nombrecorredor = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechadenacimineto = fecha;
    }


    public String getNombrecorredor() {
        return nombrecorredor;
    }

    public void setNombrecorredor(String nombrecorredor) {
        this.nombrecorredor = nombrecorredor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechadenacimineto() {
        return fechadenacimineto;
    }

    public void setFechadenacimineto(Date fechadenacimineto) {
        this.fechadenacimineto = fechadenacimineto;
    }

    @Override
    public String toString() {
        return "Nombrecorredor=" + nombrecorredor + ", Dni=" + dni + ", Direccion=" + direccion + ", Telefono=" + telefono + ", Fechadenacimineto=" + fechadenacimineto;
    }



}
    

