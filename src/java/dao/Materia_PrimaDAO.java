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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Materia_Prima;
import Servicios.DbUtil;

public class Materia_PrimaDAO
{

    private Connection connection;

    public Materia_PrimaDAO() {
        connection = DbUtil.getConnection();
    }

    public void addMateria_Prima(Materia_Prima materia_prima) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Materia_Prima(Ancho,Alto,Grueso,Cantidad) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setInt(1, materia_prima.getAncho());
            preparedStatement.setInt(2, materia_prima.getAlto());
            preparedStatement.setInt(3, materia_prima.getGrueso());
            preparedStatement.setInt(4, materia_prima.getCantidad());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMateria_Prima(int Id_Materia_Prima) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from Materia_Prima where Id_Materia_Prima=?");
            // Parameters start with 1
            preparedStatement.setInt(1, Id_Materia_Prima);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateMateria_Prima(Materia_Prima materia_prima) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update users set Ancho=?, Alto=?, Grueso=?, Cantidad=?"
                            + "where Id_Materia_Prima=?");
            // Parameters start with 1
            preparedStatement.setInt(1, materia_prima.getAncho());
            preparedStatement.setInt(2, materia_prima.getAlto());
            preparedStatement.setInt(3, materia_prima.getGrueso());
            preparedStatement.setInt(4, materia_prima.getCantidad());
            preparedStatement.setInt(5, materia_prima.getId_Materia_Prima());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Materia_Prima> getAllMateria_Prima() {
        List<Materia_Prima> materias_primas = new ArrayList<Materia_Prima>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Materia_Prima");
            while (rs.next()) {
                Materia_Prima materia_prima = new Materia_Prima();
                materia_prima.setId_Materia_Prima(rs.getInt("Id_Materia_Prima"));
                materia_prima.setAncho(rs.getInt("Ancho"));
                materia_prima.setAlto(rs.getInt("Alto"));
                materia_prima.setGrueso(rs.getInt("Grueso"));
                materia_prima.setCantidad(rs.getInt("Cantidad"));
                materias_primas.add(materia_prima);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return materias_primas;
    }

    public Materia_Prima getMateria_PrimaById(int Id_Materia_Prima) {
        Materia_Prima materia_prima = new Materia_Prima();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from Materia_Prima where Id_Materia_Prima=?");
            preparedStatement.setInt(1, Id_Materia_Prima);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                materia_prima.setId_Materia_Prima(rs.getInt("Id_Materia_Prima"));
                materia_prima.setAncho(rs.getInt("Ancho"));
                materia_prima.setAlto(rs.getInt("Alto"));
                materia_prima.setGrueso(rs.getInt("Grueso"));
                materia_prima.setCantidad(rs.getInt("Cantidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return materia_prima;
    }
}
