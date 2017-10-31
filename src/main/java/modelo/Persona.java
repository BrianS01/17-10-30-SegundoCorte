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
public class PersonaJc {

    private int cedula;
    private String nombre;
    private String Apellido;

    public PersonaJc() {
    }

    public PersonaJc(int cedula, String nombre, String Apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "PersonaJc{" + "cedula=" + cedula + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }

}
