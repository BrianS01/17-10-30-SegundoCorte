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
import Servicios.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO
{

    private Connection connection;

    public ClienteDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addCliente(Cliente newclCliente)
    {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into ClienteBD(Cedula,Nombre,Apellido,Nivel,Total_compras) values (?,?,?,?,?)");
            // parametros de inicio para agregar...
            preparedStatement.setInt(1, newclCliente.getCedula());
            preparedStatement.setString(2, newclCliente.getNombre());
            preparedStatement.setString(3, newclCliente.getApellido());
            preparedStatement.setInt(4, newclCliente.getNivle());
            preparedStatement.setInt(5, newclCliente.getTotalCompras());
            preparedStatement.executeUpdate();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteCliente(int clienteID)
    {
        try
        {
            System.out.println("Entro a eliminar");
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from ClienteBD where Id_Cliente=?");
            // Parameters start with 1
            preparedStatement.setInt(1, clienteID);
            preparedStatement.executeUpdate();
            System.out.println("Elimino El  Esquema");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCliente(Cliente newclCliente, int cs) {
        try {
            /// sentencia para insertar en la tabla
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update ClienteBD set Cedula=?, Nombre=?, Apellido=?, Nivel=?, Total_compras=? where Id_Cliente=" + cs);
            // parametros de inicio para actualizar...
            preparedStatement.setInt(1, newclCliente.getCedula());
            preparedStatement.setString(2, newclCliente.getNombre());
            preparedStatement.setString(3, newclCliente.getApellido());
            preparedStatement.setInt(4, newclCliente.getNivle());
            preparedStatement.setInt(5, newclCliente.getTotalCompras());
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

    public Cliente getClienteById(int ClienteId) {
        Cliente newclCliente = new Cliente();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from ClienteBD where Id_Cliente=?");
            preparedStatement.setInt(1, ClienteId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                newclCliente.setClientID(rs.getInt("Id_Cliente"));
                newclCliente.setCedula(rs.getInt("Cedula"));
                newclCliente.setNombre(rs.getString("Nombre"));
                newclCliente.setApellido(rs.getString("Apellido"));
                newclCliente.setNivle(rs.getInt("Nivel"));
                newclCliente.setTotalCompras(rs.getInt("Total_compras"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return newclCliente;
    }
}
