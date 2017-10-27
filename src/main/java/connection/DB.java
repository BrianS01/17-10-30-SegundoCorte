/*
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */
package connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB
{
    private static String urlDB1 = "jdbc:mysql://localhost:3306/Bases17SegundoProyecto";
    private static String userDB1 = "root";
    private static String passwordDB1 = "root";
    private Connection conn;
    
    public static synchronized Connection getConexion()
    {
        Connection cn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(urlDB1, userDB1, passwordDB1);
        }
        catch (Exception e) 
        {
            cn = null;
        }
        finally 
        {
            return cn;
        }
    }

    //Metodo utilizado para cerrar el callablestatemente
    public static synchronized void cerrarCall(CallableStatement cl) 
    {
        try 
        {
            cl.close();
        } 
        catch (Exception e) {}
    }

    //Metodo utilizado para cerrar el resulset de datos
    public static synchronized void cerrarConexion(ResultSet rs) 
    {
        try 
        {
            rs.close();
        } 
        catch (Exception e) {}
    }

    //Metodo utilizado para cerrar la conexion
    public static synchronized void cerrarConexion(Connection cn) 
    {
        try 
        {
            cn.close();
        } 
        catch (Exception e) {}
    }

    //Metodo utilizado para deshacer los cambios en la base de datos
    public static synchronized void deshacerCambios(Connection cn) {
        try
        {
            cn.rollback();
        }
        catch (Exception e) {}
    }
    
    public Connection getConn() 
    {
        return conn;
    }

    public void setConn(Connection conn) 
    {
        this.conn = conn;
    }
    
    public void conectar() throws ClassNotFoundException, SQLException 
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "root", "root");
        }
        finally {}
    }

    public void desconectar() throws SQLException 
    {
        conn.close();
    }
}