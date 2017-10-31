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
public class MateriaPrimaJc extends MedidasJc {

    private int idMateriaP;

    public MateriaPrimaJc() {
    }

    public MateriaPrimaJc(int idMateriaP, int Ancho, int Alto, int Grosor, int Cantidad) {
        super(Ancho, Alto, Grosor, Cantidad);
        this.idMateriaP = idMateriaP;
    }

    public int getIdMateriaP() {
        return idMateriaP;
    }

    public void setIdMateriaP(int idMateriaP) {
        this.idMateriaP = idMateriaP;
    }

    @Override
    public String toString() {
        return "MateriaPrimaJc{" + "idMateriaP=" + idMateriaP + '}';
    }

}
