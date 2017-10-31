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

public class Factura
{
    private int idFacturaProducto;
    private int numeroFactura;
    private String fechaFactura;
    private int totalFactura;
    private int iDFkEmpleado;
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Factura()
    {}

    public Factura(int idFacturaProducto, int numeroFactura, String fechaFactura, int totalFactura, int iDFkEmpleado)
    {
        this.idFacturaProducto = idFacturaProducto;
        this.numeroFactura = numeroFactura;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
        this.iDFkEmpleado = iDFkEmpleado;
    }

    public int getIdFacturaProducto() {
        return idFacturaProducto;
    }

    public void setIdFacturaProducto(int idFacturaProducto) {
        this.idFacturaProducto = idFacturaProducto;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(int totalFactura) {
        this.totalFactura = totalFactura;
    }

    public int getiDFkEmpleado() {
        return iDFkEmpleado;
    }

    public void setiDFkEmpleado(int iDFkEmpleado) {
        this.iDFkEmpleado = iDFkEmpleado;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "FacturaJc{" + "idFacturaProducto=" + idFacturaProducto + ", numeroFactura=" + numeroFactura + ", fechaFactura=" + fechaFactura + ", totalFactura=" + totalFactura + ", iDFkEmpleado=" + iDFkEmpleado + ", listaProductos=" + listaProductos + '}';
    }
}