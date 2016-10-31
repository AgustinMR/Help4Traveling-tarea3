package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- INICIO BARRA DE NAVEGACION -->\n");
      out.write("    <nav class=\"navbar navbar-fixed-top\" style=\"background-color: #01529e; height: 50px\">\n");
      out.write("      <div class=\"container-fluid\" style=\"height: 50px\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\" style=\"color: white\" data-toggle=\"collapse\" data-target=\"#myNavbar\">INICIAR SESIÓN</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- SECCION CON CONTENIDO PARA EL INICIO DE SECCION -->\n");
      out.write("      <div class=\"collapse fade col-xs-12\" id=\"myNavbar\" style=\"background-color: #E6E6E6\">\n");
      out.write("        <div class=\"col-xs-3\"></div>\n");
      out.write("        <div class=\"col-xs-6\">\n");
      out.write("          <form>\n");
      out.write("            <div class=\"row\" style=\"min-height: 25%; margin-top: 20px\">\n");
      out.write("              <h4 style=\"font-family: Helvetica; color: #01529e; margin-top: 30px\">NICKNAME</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"min-height: 25%\">\n");
      out.write("              <input style=\"width: 100%; height: 25px; font-family: Helvetica\" type=\"text\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"min-height: 25%; margin-top: -20px\">\n");
      out.write("              <h4 style=\"font-family: Helvetica; color: #01529e; margin-top: 30px\">CONTRASEÑA</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"min-height: 25%\">\n");
      out.write("              <input style=\"width: 100%; height: 25px; font-family: Helvetica\" type=\"password\" required=\"\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"min-height: 50%; margin-top: 50px\">\n");
      out.write("              <center>\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" style=\"background-color: #01529e;color: white; border: none; font-family: Helvetica\">\n");
      out.write("                  <b>INICIAR SESIÓN</b>\n");
      out.write("                </button>\n");
      out.write("              </center>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-3\"></div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- FIN DE LA BARRA DE NAVEGACION -->\n");
      out.write("    <div class=\"col-xs-12\" style=\"margin-top: 50px\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-4\"></div>\n");
      out.write("        <div class=\"col-xs-4\">\n");
      out.write("          <center>\n");
      out.write("            <img src=\"img/logo.png\" style=\"margin-top: 20px; width: 120px\">\n");
      out.write("          </center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-4\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <center>\n");
      out.write("          <h1 style=\"font-family: Helvetica; color: #313131; font-size: 45px; margin-top: 30px; margin-left: -80px\">\n");
      out.write("            <b>4</b>\n");
      out.write("          </h1>\n");
      out.write("          <h2 style=\"font-family: Helvetica; color: #01529e; margin-left: -180px; margin-top: -50px\">HELP</h2>\n");
      out.write("          <h2 style=\"font-family: Helvetica; color: #01529e; margin-top: 0px; margin-left: 110px; margin-top: -44px\">TRAVELING</h2>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
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
