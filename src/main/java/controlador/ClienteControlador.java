/*
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package Controlador;

import dao.ClienteDAO;
import modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mario-Bx
 */
public class ClienteControlador extends HttpServlet
{

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/Cliente.jsp";
    private static String LIST_USER = "/ClienteLista.jsp";
    private ClienteDAO dao;

    public ClienteControlador() {
        super();
        dao = new ClienteDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            System.out.println("Entro a la accion eliminar");
            int clienteId = Integer.parseInt(request.getParameter("ClienteID"));
            dao.deleteCliente(clienteId);
            forward = LIST_USER;
            ///primero va la tabla de sql
            request.setAttribute("ClienteBD", dao.getAllClientes());
            System.out.println(" Realizo la accion de eliminar");
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int clienteID = Integer.parseInt(request.getParameter("ClienteID"));
            ClienteJc newCliente = dao.getClienteById(clienteID);
            request.setAttribute("Cliente", newCliente);
        } else if (action.equalsIgnoreCase("ListarClientesAC")) {
            forward = LIST_USER;
            request.setAttribute("ClienteBD", dao.getAllClientes());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClienteJc newCliente = new ClienteJc();
        newCliente.setCedula(Integer.parseInt(request.getParameter("cedulaHtml")));
        newCliente.setNombre(request.getParameter("nombreHtml"));
        newCliente.setApellido(request.getParameter("ApellidoHtml"));
        newCliente.setNivle(Integer.parseInt(request.getParameter("nivelHtml")));
        newCliente.setTotalCompras(Integer.parseInt(request.getParameter("totalHtml")));

        String clienteid = request.getParameter("clienteIdHtml");

        if (clienteid == null || clienteid.isEmpty()) {
            dao.addCliente(newCliente);
        } else {
            newCliente.setClientID(Integer.parseInt(clienteid));
            int clienteId = Integer.parseInt(request.getParameter("clienteIdHtml"));
            dao.updateCliente(newCliente, clienteId);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("ClienteBD", dao.getAllClientes());
        view.forward(request, response);
    }
}
