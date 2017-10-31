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

/**
 *
 * @author Mario-Bx
 */
public class EmpleadoJc extends PersonaJc {

    private int idEmpleado;
    private String tipoEmpleado;
    ArrayList<FacturaJc> listaFacturas = new ArrayList<FacturaJc>();

    public EmpleadoJc() {
    }

    public EmpleadoJc(int idEmpleado, String tipoEmpleado, int cedula, String nombre, String Apellido) {
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

    public ArrayList<FacturaJc> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<FacturaJc> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    @Override
    public String toString() {
        return "EmpleadoJc{" + "idEmpleado=" + idEmpleado + ", tipoEmpleado=" + tipoEmpleado + ", listaFacturas=" + listaFacturas + '}';
    }

}
