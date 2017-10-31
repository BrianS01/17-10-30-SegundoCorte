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
public class ClienteJc extends PersonaJc {

    private int idCliente;
    private int nivelCliente;
    private int totalComprasCliente;
    ArrayList<CotizacionJc> listaCotizaciones = new ArrayList<CotizacionJc>();

    public ClienteJc() {
    }

    public ClienteJc(int idCliente, int cedula, String nombre, String Apellido, int nivelCliente, int totalComprasCliente) {
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

    public ArrayList<CotizacionJc> getListacotizaciones() {
        return listaCotizaciones;
    }

    public void setListacotizaciones(ArrayList<CotizacionJc> listacotizaciones) {
        this.listaCotizaciones = listacotizaciones;
    }

    @Override
    public String toString() {
        return "ClienteJc{" + "idCliente=" + idCliente + ", nivelCliente=" + nivelCliente + ", totalComprasCliente=" + totalComprasCliente + ", listaCotizaciones=" + listaCotizaciones + '}';
    }
}
