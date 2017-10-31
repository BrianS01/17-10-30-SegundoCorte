/*
 *  PROYECTO SEGUNDO CORTE
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import dao.Materia_PrimaDAO;
import modelo.Materia_Prima;

public class Materia_PrimaControlador extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/Materia_Prima.jsp";
    private static String LIST_MATERIA_PRIMA = "/listMateria_Prima.jsp";
    private Materia_PrimaDAO dao;

    public Materia_PrimaControlador() {
        super();
        dao = new Materia_PrimaDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int Id_Materia_Prima = Integer.parseInt(request.getParameter("Id_Materia_Prima"));
            dao.deleteMateria_Prima(Id_Materia_Prima);
            forward = LIST_MATERIA_PRIMA;
            request.setAttribute("materias_primas", dao.getAllMateria_Prima());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int Id_Materia_Prima = Integer.parseInt(request.getParameter("Id_Materia_Prima"));
            Materia_Prima materia_prima = dao.getMateria_PrimaById(Id_Materia_Prima);
            request.setAttribute("Materia_Prima", materia_prima);
        } else if (action.equalsIgnoreCase("listMateria_Prima")) {
            forward = LIST_MATERIA_PRIMA;
            request.setAttribute("materias_primas", dao.getAllMateria_Prima());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Materia_Prima materia_prima = new Materia_Prima();
        materia_prima.setAncho(Integer.parseInt(request.getParameter("Ancho")));
        materia_prima.setAlto(Integer.parseInt(request.getParameter("Alto")));
        materia_prima.setGrueso(Integer.parseInt(request.getParameter("Grueso")));
        materia_prima.setCantidad(Integer.parseInt(request.getParameter("Cantidad")));
        String Id_Materia_Prima = request.getParameter("Id_Materia_Prima");
        if (Id_Materia_Prima == null || Id_Materia_Prima.isEmpty()) {
            dao.addMateria_Prima(materia_prima);
        } else {
            materia_prima.setId_Materia_Prima(Integer.parseInt(Id_Materia_Prima));
            dao.updateMateria_Prima(materia_prima);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_MATERIA_PRIMA);
        request.setAttribute("Materia_Prima", dao.getAllMateria_Prima());
        view.forward(request, response);
    }

}
