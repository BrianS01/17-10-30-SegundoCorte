/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Cliente;
import modelo.Cotizacion;
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Albarracin
 */
public class CotizacionDAO
{
      private Connection connection;

    public CotizacionDao() {
        connection = DbUtil.getConnection();
    }

    public void addCotizacion(Cotizacion newCotizacion) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into CotizacionBD(Fecha,Id_ClienteFK) values (?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setDate(1, (Date) newCotizacion.getFechaCotizacion());
            preparedStatement.setInt(2, newCotizacion.getIdFKCliente());
          
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCotizacion(int cotizacionID) {
        try {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from CotizacionBD where Id_Cotización=?");
            // Parameters start with 1
            preparedStatement.setInt(1,cotizacionID);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(Cotizacion newCotizacion, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update CotizacionBD set Fecha=?, Id_ClienteFK=?" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setDate(1, (Date) newCotizacion.getFechaCotizacion());
            preparedStatement.setInt(2, newCotizacion.getIdFKCliente());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cotizacion> getAllCotizaciones() {
        List<Cotizacion> cotizacionListas = new ArrayList<Cotizacion>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from CotizacionBD");
            while (rs.next()) {
                Cotizacion newCotizacion = new Cotizacion();
                newCotizacion.setOtizacionProductoID(rs.getInt("Id_Cotización"));
                newCotizacion.setFechaCotizacion(rs.getDate("Fecha"));
                newCotizacion.setIdFKCliente(rs.getInt("Id_ClienteFK"));
               

                cotizacionListas.add(newCotizacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cotizacionListas;
    }

    

}
