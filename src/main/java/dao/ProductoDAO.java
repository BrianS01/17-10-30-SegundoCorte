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

import modelo.Cliente;
import modelo.Producto;
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO
{

    private Connection connection;

    public ProductoDAO() {
        connection = DbUtil.getConnection();
    }

    public void addCliente(Producto newclCliente) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into ProductoBD(Ancho,Alto,Precio,Cantidad,Id_CotizacionFK,Id_FacturaFK) values (?,?,?,?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setInt(1, newclCliente.getAncho());
           preparedStatement.setInt(1, newclCliente.getAlto());
            preparedStatement.setInt(1, newclCliente.getprecio());
            preparedStatement.setInt(4, newclCliente.getCantidad());
            preparedStatement.setInt(5, newclCliente.getIdFKCotizacion());
            preparedStatement.setInt(1, newclCliente.getIdFKCotizacionFactuta());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProducto(int productoid) {
        try {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from ProductoBD where Id_Producto=?");
            // Parameters start with 1
            preparedStatement.setInt(1, productoid);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(Producto newclCliente, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update ProductoBD set ancho=?, alto=?, precio=?, cantidad=?, id_cotizacion=?, Id_FacturaFK where Id_producto=" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setInt(1, newclCliente.getAlto());
            preparedStatement.setInt(2, newclCliente.getAncho());
            preparedStatement.setInt(3, newclCliente.getCantidad());
            preparedStatement.setInt(4, newclCliente.getGrosor());
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> getAllClientes()
    {
        List<Cliente> clientesListas = new ArrayList<Cliente>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from ClienteBD");
            while (rs.next()) {
                Cliente newclCliente = new Cliente();
                newclCliente.setClientID(rs.getInt("Id_Cliente"));
                newclCliente.setCedula(rs.getInt("Cedula"));
                newclCliente.setNombre(rs.getString("Nombre"));
                newclCliente.setApellido(rs.getString("Apellido"));
                newclCliente.setNivle(rs.getInt("Nivel"));
                newclCliente.setTotalCompras(rs.getInt("Total_compras"));

                clientesListas.add(newclCliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientesListas;
    }

    public Cliente getClienteById(int ClienteId)
    {
        Cliente newclCliente = new Cliente();
        try
        {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from ClienteBD where Id_Cliente=?");
            preparedStatement.setInt(1, ClienteId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next())
            {
              //  newclCliente.setor(rs.getInt("Id_Producto"));
                newclCliente.setCedula(rs.getInt("Cedula"));
                newclCliente.setNombre(rs.getString("Nombre"));
                newclCliente.setApellido(rs.getString("Apellido"));
                newclCliente.setNivle(rs.getInt("Nivel"));
                newclCliente.setTotalCompras(rs.getInt("Total_compras"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return newclCliente;
    }
}