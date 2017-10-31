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

public class Cotizacion extends MedidasJc
{

    private int iDCotizacion;
    private int numeroCotizacion;
    private Date fechaCotizacion;
    private int precioCotizacion;
    private int idFKCliente;
    ArrayList<ProductoJc> listaProductos = new ArrayList<ProductoJc>();

    public Cotizacion()
    {}

    public Cotizacion(int otizacionProductoID, int cotizacionN, Date fechaCotizacion, int precioCotizacion, int idFKCliente, int Ancho, int Alto, int Grosor, int Cantidad) {
        super(Ancho, Alto, Grosor, Cantidad);
        this.iDCotizacion = otizacionProductoID;
        this.numeroCotizacion = cotizacionN;
        this.fechaCotizacion = fechaCotizacion;
        this.precioCotizacion = precioCotizacion;
        this.idFKCliente = idFKCliente;
    }

    public int getOtizacionProductoID() {
        return iDCotizacion;
    }

    public void setOtizacionProductoID(int otizacionProductoID) {
        this.iDCotizacion = otizacionProductoID;
    }

    public int getCotizacionN() {
        return numeroCotizacion;
    }

    public void setCotizacionN(int cotizacionN) {
        this.numeroCotizacion = cotizacionN;
    }

    public Date getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(Date fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public int getPrecioCotizacion() {
        return precioCotizacion;
    }

    public void setPrecioCotizacion(int precioCotizacion) {
        this.precioCotizacion = precioCotizacion;
    }

    public int getIdFKCliente() {
        return idFKCliente;
    }

    public void setIdFKCliente(int idFKCliente) {
        this.idFKCliente = idFKCliente;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "CotizacionJc{" + "otizacionProductoID=" + iDCotizacion + ", cotizacionN=" + numeroCotizacion + ", fechaCotizacion=" + fechaCotizacion + ", precioCotizacion=" + precioCotizacion + ", idFKCliente=" + idFKCliente + ", listaProductos=" + listaProductos + '}';
    }

}
