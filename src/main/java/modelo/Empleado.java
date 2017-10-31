/*
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package modelo;

import java.util.*;

public class Empleado extends Persona
{
    private int idEmpleado;
    private String tipoEmpleado;
    ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

    public Empleado()
    {}

    public Empleado(int idEmpleado, String tipoEmpleado, int cedula, String nombre, String Apellido)
    {
        super(cedula, nombre, Apellido);
        this.idEmpleado = idEmpleado;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    @Override
    public String toString()
    {
        return "EmpleadoJc{" + "idEmpleado=" + idEmpleado + ", tipoEmpleado=" + tipoEmpleado + ", listaFacturas=" + listaFacturas + '}';
    }
}