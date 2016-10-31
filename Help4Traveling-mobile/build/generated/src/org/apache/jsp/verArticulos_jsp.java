package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verArticulos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head><body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header/header.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("      <div class=\"row bg-primary\" style=\"height: 40px\">\n");
      out.write("        <div class=\"col-xs-6\">\n");
      out.write("          <button style=\"width: 100%; height: 100%; font-family: Helvetica; border-style: none\"\n");
      out.write("          class=\"btn btn-primary\">SERVICIOS</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-6\">\n");
      out.write("          <button style=\"width: 100%; height: 100%; font-family: Helvetica; border-style: none\"\n");
      out.write("          class=\"btn btn-primary\">PROMOCIONES</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- COMIENZO SECCION PARA PANELES CON ARTICULOS DE MIERDA -->\n");
      out.write("      <div class=\"panel-group\">\n");
      out.write("        <!-- SECCION A TENER POR CADA ARTICULO -->\n");
      out.write("        <div class=\"panel panel-success\">\n");
      out.write("          <div class=\"panel-heading\" style=\"color: #333333; font-family: Helvetica; font-size: 115%\">Nombre del articulo</div>\n");
      out.write("          <h4 style=\"position: absolute; right: 30px; margin-top: -30px; font-family: Helvetica; color: #212121\">$$$</h4>\n");
      out.write("          <div class=\"panel-body\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-xs-12\" style=\"max-height: 100px; overflow-y: auto\">\n");
      out.write("                <h4 style=\"font-family: Helvetica; color: #212121\">aca va la descripcion...</h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <!-- INICIO CARRUSEL DE IMAGENES DEL SERVICIO -->\n");
      out.write("              <center>\n");
      out.write("                <div class=\"col-xs-12\">\n");
      out.write("                  <div id=\"imgs\" class=\"carousel slide\" data-ride=\"carousel\" style=\"width: 90%; max-width: 400px; height: 250px; margin-top: 5px\">\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                      <li data-target=\"#imgs\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                      <li data-target=\"#imgs\" data-slide-to=\"1\"></li>\n");
      out.write("                      <li data-target=\"#imgs\" data-slide-to=\"2\"></li>\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                      <div class=\"item active\">\n");
      out.write("                        <img src=\"logo.png\" style=\"height: 250px\" class=\"img-responsive img-thumbnail\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item\">\n");
      out.write("                        <img src=\"logo.png\" style=\"height: 250px\" class=\"img-responsive img-thumbnail\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"item\">\n");
      out.write("                        <img src=\"logo.png\" style=\"height: 250px\" class=\"img-responsive img-thumbnail\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#imgs\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span aria-hidden=\"true\" style=\"font-family: Helvetica; font-style: italic; font-size: 26px\">&lt;</span>\n");
      out.write("                  </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#imgs\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span aria-hidden=\"true\" style=\"font-family: Helvetica; font-style: italic; font-size: 26px\">&gt;</span>\n");
      out.write("                  </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </center>\n");
      out.write("              <!-- FIN CARRUSEL DE IMAGENES -->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- FIN SECCION A TENER POR CADA ARTICULO -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</body></html>");
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
