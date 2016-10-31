package org.apache.jsp.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script type=\"text/javascript\" src=\"../bootstrap/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"../bootstrap/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"../bootstrap/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head><body>\n");
      out.write("    <nav class=\"navbar navbar-fixed-top\" style=\"background-color: #01529e; height: 50px\">\n");
      out.write("      <div class=\"container-fluid\" style=\"height: 50px\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\" style=\"color: white; font-size: 20px; margin-top: 0px\">☰</button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\" style=\"color: white\">NICKNAME PROV...</a>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\" style=\"color: white; font-size: 20px; margin-top: 0px; display: initial\">☰</button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse fade\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav\" style=\"font-family: Helvetica; width: 100%; margin-left: 0px; border-left-style: solid; border-width: 4px; border-color: #01529e\">\n");
      out.write("          <li class=\"active\">\n");
      out.write("            <a href=\"#\">RESERVAS</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">SERVICIOS y PROMOCIONES</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">ACTUALIZAR ESTADO RESERVA</a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"#\">CERRAR SESIÓN</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  \n");
      out.write("\n");
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
