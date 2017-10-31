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

public class Cliente extends Persona
{
    private int idCliente;
    private int nivelCliente;
    private int totalComprasCliente;
    ArrayList<Cotizacion> listaCotizaciones = new ArrayList<Cotizacion>();

    public Cliente()
    {}

    public Cliente(int idCliente, int cedula, String nombre, String Apellido, int nivelCliente, int totalComprasCliente)
    {
        super(cedula, nombre, Apellido);
        this.idCliente = idCliente;
        this.nivelCliente = nivelCliente;
        this.totalComprasCliente = totalComprasCliente;
    }

    public int getClientID() {
        return idCliente;
    }

    public void setClientID(int clientID) {
        this.idCliente = clientID;
    }

    public int getNivle() {
        return nivelCliente;
    }

    public void setNivle(int nivle) {
        this.nivelCliente = nivle;
    }

    public int getTotalCompras() {
        return totalComprasCliente;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalComprasCliente = totalCompras;
    }

    public ArrayList<Cotizacion> getListacotizaciones() {
        return listaCotizaciones;
    }

    public void setListacotizaciones(ArrayList<Cotizacion> listacotizaciones) {
        this.listaCotizaciones = listacotizaciones;
    }

    @Override
    public String toString()
    {
        return "ClienteJc{" + "idCliente=" + idCliente + ", nivelCliente=" + nivelCliente + ", totalComprasCliente=" + totalComprasCliente + ", listaCotizaciones=" + listaCotizaciones + '}';
    }
}