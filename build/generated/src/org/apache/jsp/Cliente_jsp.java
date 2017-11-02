package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dato.ClienteJc;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add new Squemas</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum.scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"ui/Css/MenuDesplegableSub.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"ui/Css/Etilo Fomulario.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"Centrar\">\n");
      out.write("            <div id=\"Telon\" align=\"center\">\n");
      out.write("                <div class=\"Menu\">\n");
      out.write("                    <a href=\"Cliente.jsp\"></a>\n");
      out.write("                    <header class=\"Menu_Des\">\n");
      out.write("                        <input type=\"checkbox\" id=\"btn_Menu\">\n");
      out.write("                        <label for=\"btn_Menu\"> <img class=\"icon\"  src=\"ui/Imagenes/menu-icon.png\"></label>\n");
      out.write("                        <div class=\"Menu\">\n");
      out.write("                            <header class=\"Menu_Des\">\n");
      out.write("                                <input type=\"checkbox\" id=\"btn_Menu\">\n");
      out.write("                                <label for=\"btn_Menu\"> <img class=\"icon\"  src=\"ui/Imagenes/menu-icon.png\"></label>\n");
      out.write("                                <nav class=\"MenuCss\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"index.jsp\"><span class=\"uno\"><img class=\"icon\" src=\"ui/Imagenes/icon1.png\" /></span>Inicio</a></li>\n");
      out.write("                                        <li><a href=\"Cliente.jsp\"><span class=\"dos\"><img class=\"icon\" src=\"ui/Imagenes/Esquema.png\" /> </span>Cleinte</a></li>\n");
      out.write("                                        <li><a href=\"\"><span class=\"tres\"><img class=\"icon\" src=\"ui/Imagenes/Database-Table-icon.png\" /> </span>Tablas</a></li>\n");
      out.write("                                        <li><a href=\"\"><span class=\"cuatro\"><img class=\"icon\" src=\"ui/Imagenes/Columna.png\" /> </span>Columnas</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                            </header>                \n");
      out.write("                        </div>\n");
      out.write("                    </header>                \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-style-5\">\n");
      out.write("                    ");

                        ClienteJc newSquema = (ClienteJc) request.getAttribute("frmAddSquema");
                        if (request.getParameter("action").equals("incertarAc")) {
                    
      out.write("\n");
      out.write("                    <form method=\"POST\" action='ClienteClontroller' name=\"frmAddUser\">\n");
      out.write("                        Cliente ID : <input type=\"text\" readonly=\"readonly\" name=\"clienteIdHtml\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Cedula del Cliente : <input type=\"text\" name=\"cedulaHtml\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Nombre Cliente : <input type=\"text\" name=\"nombreHtml\"/>\n");
      out.write("                        <br />\n");
      out.write("                        Apellido del Cliente : <input type=\"text\" name=\"ApellidoHtml\"/>\n");
      out.write("                        <br />\n");
      out.write("                        Nivel del cliente : <input type=\"text\" name=\"nivelHtml\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Total compras : <input type=\"text\" name=\"totalHtml\"/>\n");
      out.write("                        <br />\n");
      out.write("                        <input type=\"submit\" value=\"Insertar\" />\n");
      out.write("                    </form>\n");
      out.write("                    ");

                    } else if ((request.getParameter("action").equals("edit"))) {
                        ClienteJc Squemas = (ClienteJc) request.getAttribute("Cliente");
                    
      out.write("\n");
      out.write("                    <form method=\"POST\" action='ClienteClontroller' name=\"frmAddSquema\">\n");
      out.write("                        Cliente ID : <input type=\"text\" readonly=\"readonly\" name=\"clienteIdHtml\" value=\"");
      out.print(Squemas.getClientID());
      out.write("\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Cedula del Cliente : <input type=\"text\" name=\"cedulaHtml\" value=\"");
      out.print(Squemas.getCedula());
      out.write("\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Nombre Cliente : <input type=\"text\" name=\"NombreHtml\" value=\"");
      out.print(Squemas.getNombre());
      out.write("\"/>\n");
      out.write("                        <br />\n");
      out.write("                        Apellido del Cliente : <input type=\"text\" name=\"ApellidoHtml\" value=\"");
      out.print(Squemas.getApellido());
      out.write("\"/>\n");
      out.write("                        <br />\n");
      out.write("                        Nivel del cliente : <input type=\"text\" name=\"nivelHtml\" value=\"");
      out.print(Squemas.getNivle());
      out.write("\"/>\n");
      out.write("                        <br /> \n");
      out.write("                        Total compras : <input type=\"text\" name=\"totalHtml\" value=\"");
      out.print(Squemas.getTotalCompras());
      out.write("\"/>\n");
      out.write("                        <br />\n");
      out.write("                        <input type=\"submit\" value=\"Editar\" />\n");
      out.write("                    </form>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
