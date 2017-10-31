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

/**
 *
 * @author Mario-Bx
 */
public class MedidasJc {

    private int Ancho;
    private int Alto;
    private int Grosor;
    private int Cantidad;

    public MedidasJc() {
    }

    public MedidasJc(int Ancho, int Alto, int Grosor, int Cantidad) {
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Grosor = Grosor;
        this.Cantidad = Cantidad;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int Ancho) {
        this.Ancho = Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int Alto) {
        this.Alto = Alto;
    }

    public int getGrosor() {
        return Grosor;
    }

    public void setGrosor(int Grosor) {
        this.Grosor = Grosor;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "MedidasJc{" + "Ancho=" + Ancho + ", Alto=" + Alto + ", Grosor=" + Grosor + ", Cantidad=" + Cantidad + '}';
    }

}
