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

public class Producto extends Medidas
{
    private int idProducto;
    private int idFKCotizacionProducto;
    private int numeroFKCotizacion;
    private int idFKFactura;

    public Producto()
    {}

    public Producto(int idProducto, int idFKCotizacionProducto, int idFKCotizacion, int idFKCotizacionFactuta, int Ancho, int Alto, int Grosor, int Cantidad)
    {
        super(Ancho, Alto, Grosor, Cantidad);
        this.idProducto = idProducto;
        this.idFKCotizacionProducto = idFKCotizacionProducto;
        this.numeroFKCotizacion = idFKCotizacion;
        this.idFKFactura = idFKCotizacionFactuta;
    }

    public int getIdProducto()
    {
        return idProducto;
    }

    public void setIdProducto(int idProducto)
    {
        this.idProducto = idProducto;
    }

    public int getIdFKCotizacionProducto()
    {
        return idFKCotizacionProducto;
    }

    public void setIdFKCotizacionProducto(int idFKCotizacionProducto)
    {
        this.idFKCotizacionProducto = idFKCotizacionProducto;
    }

    public int getIdFKCotizacion()
    {
        return numeroFKCotizacion;
    }

    public void setIdFKCotizacion(int idFKCotizacion)
    {
        this.numeroFKCotizacion = idFKCotizacion;
    }

    public int getIdFKCotizacionFactuta()
    {
        return idFKFactura;
    }

    public void setIdFKCotizacionFactuta(int idFKCotizacionFactuta)
    {
        this.idFKFactura = idFKCotizacionFactuta;
    }

    public String toString()
    {
        return "ProductoJc{" + "idProducto=" + idProducto + ", idFKCotizacionProducto=" + idFKCotizacionProducto + ", idFKCotizacion=" + numeroFKCotizacion + ", idFKCotizacionFactuta=" + idFKFactura + '}';
    }

    public int getprecio()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
