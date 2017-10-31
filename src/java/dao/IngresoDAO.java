/*
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package dao;

import modelo.Usuario;
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IngresoDAO
{
    private Connection connection;

    public IngresoDAO()
    {
        connection = DbUtil.getConnection();
    }

    public Usuario getUsuarioByNameAndPass(String name, String pass)
    {
        Usuario usuario = new Usuario();
        try
        {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from usuario where nombre=? and contrasena=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next())
            {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setPass(rs.getString("contrasena"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return usuario;
    }
}