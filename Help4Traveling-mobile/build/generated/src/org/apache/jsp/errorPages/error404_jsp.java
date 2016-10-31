package org.apache.jsp.errorPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  </head><body style=\"background-color: #01529e\">\n");
      out.write("    <div class=\"row\" style=\"height: 230px; min-height: 230px; max-height: 230px; background-color: white\">\n");
      out.write("      <center>\n");
      out.write("        <img src=\"../img/logo.png\" style=\"margin-top: 20px\">\n");
      out.write("      </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\" style=\"height: 20px; min-height: 20px; max-height: 20px; background-color: white\">\n");
      out.write("      <center>\n");
      out.write("        <h2 style=\"font-family: Helvetica; color: #01529e; width: 135px; margin-left: -200px; margin-top: -30px\">HELP</h2>\n");
      out.write("        <h1 style=\"font-family: Helvetica; color: #313131; width: 40px; margin-top: -49px; margin-left: -105px\">\n");
      out.write("          <b>4</b>\n");
      out.write("        </h1>\n");
      out.write("        <h2 style=\"font-family: Helvetica; color: #01529e; width: 200px; margin-top: -44px; margin-left: 85px\">TRAVELING</h2>\n");
      out.write("      </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\" style=\"height: 450px\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <center>\n");
      out.write("          <h2 style=\"font-family: Helvetica; color: white\">ERROR</h2>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <center>\n");
      out.write("          <h1 style=\"font-family: Helvetica; color: white; font-size: 100px; margin-top: -20px\">404</h1>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <center>\n");
      out.write("          <h4 style=\"font-family: Helvetica; color: white; margin-top: -10px\">Felicidades!, lo rompiste... :/</h4>\n");
      out.write("        </center>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
