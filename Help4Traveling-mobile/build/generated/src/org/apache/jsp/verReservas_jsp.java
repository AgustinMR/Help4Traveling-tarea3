package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verReservas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html><head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <script type=\"text/javascript\" src=\"bootstrap/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"bootstrap/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"bootstrap/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head><body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("    <div class=\"col-xs-12\" style=\"margin-top: 50px\">\n");
      out.write("      <div class=\"row\" style=\"background-color: #E6E6E6; height: 40px\">\n");
      out.write("        <center>\n");
      out.write("          <h3 style=\"color: #01529e; margin-top: 5px\">Mis reservas</h3>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\" style=\"min-height: 300px\">\n");
      out.write("        <!-- INICIO FILA A TENER POR CADA RESERVA HECHA AL PROV. -->\n");
      out.write("        <div class=\"row\" style=\"min-height: 80px; max-height: 100px; width: 100%; margin-left: 0px\">\n");
      out.write("          <div class=\"row\" style=\"min-height: 40px; margin-left: 0px; background-color: #e6f8ff; width: 100%\">\n");
      out.write("            <div class=\"col-xs-6\" style=\"border-left-style: solid; border-width: 6px; border-color: #01529e\">\n");
      out.write("              <h4 style=\"margin-left: 10px; margin-top: 10px; color: #333333\">Nick. Cliente</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6\" style=\"border-right-style: solid; border-width: 4px; border-color: #01529e\">\n");
      out.write("              <h4 style=\"margin-left: 10px; margin-top: 10px; color: #359151; text-align: right\">$ precio</h4>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\" style=\"min-height: 40px; width: 100%; margin-left: 0px; background-color: #f4fdff\">\n");
      out.write("            <div class=\"col-xs-3\">\n");
      out.write("              <h5 style=\"margin-left: 10px; margin-top: 12px; color: #333333; position: absolute\">Estado</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-3\">\n");
      out.write("              <h5 style=\"margin-left: 10px; margin-top: 12px; color: #333333; position: absolute; left: 0\">Fecha crea.</h5>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6\">\n");
      out.write("              <button class=\"btn btn-info\" style=\"height: 30px; margin-top: 5px; position: absolute; right: 5px\">Ver</button>\n");
      out.write("              <!-- BOTON PARA FACTURAR SOLO VISIBLE SI ESTADO ES \"PAGADA\".\n");
      out.write("              DE ESA MANERA, SE REALIZA EL CASO, CAMBIAR ESTADO. -->\n");
      out.write("              <button class=\"btn btn-primary\" style=\"height: 30px; margin-top: 5px; position: absolute; right: 60px\">Facturar</button>\n");
      out.write("            </div>\n");
      out.write("            <!-- INICIO MODAL CON INFO_RESERVAS DE LA RESERVA -->\n");
      out.write("            <!-- FIN MODAL -->\n");
      out.write("          </div>\n");
      out.write("          <!-- FIN FILA A TENER POR CADA RESERVA HECHA AL PROV. -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body></html>\n");
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
