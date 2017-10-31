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

public class Materia_Prima
{
    private int Id_Materia_Prima;
    private int Ancho;
    private int Alto;
    private int Grueso;
    private int Cantidad;

    public int getId_Materia_Prima() {
        return Id_Materia_Prima;
    }

    public void setId_Materia_Prima(int Id_Materia_Prima) {
        this.Id_Materia_Prima = Id_Materia_Prima;
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

    public int getGrueso() {
        return Grueso;
    }

    public void setGrueso(int Grueso) {
        this.Grueso = Grueso;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return "Materia_Prima{" + "Id_Materia_Prima=" + Id_Materia_Prima + ", Ancho=" + Ancho + ", Alto=" + Alto + ", Grueso=" + Grueso + ", Cantidad=" + Cantidad + '}';
    }

    
    
    
}
