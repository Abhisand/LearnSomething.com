package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>User's Area | Account Login</title>\n");
      out.write("   \n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style_log.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js\"></script>\n");
      out.write("    <script src=\"jquery-3.1.1.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Animate.css\">\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("       $(document).ready(function () {\n");
      out.write("         $('.signIn').click(function () {\n");
      out.write("            $('.fold').toggleClass('active')\n");
      out.write("         })\n");
      out.write("       })\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write(" \n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">UserStrap</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <h1 class=\"text-center\"> User Area <small>Account Login</small></h1>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <div id=\"particles-js\">\n");
      out.write("\n");
      out.write("      <div class=\"container-m\">\n");
      out.write("\n");
      out.write("        <div class=\"signIn\" >Click Here to signIn</div>\n");
      out.write("        <div class=\"fold\">\n");
      out.write("            <form action=\"log\" method=\"get\">\n");
      out.write("            <input type=\"text\" name=\"Username\" placeholder=\"Uname\">\n");
      out.write("            <input type=\"password\" name=\"Password\" placeholder=\"password\">\n");
      out.write("            <input type=\"submit\" value=\"login\">\n");
      out.write("            <a href=\"#\">Create Account</a>\n");
      out.write("          </form>\n");
      out.write("          <!--<a href=\"Parallax.jsp\" class=\"btn btn-primary btn-lg active\" role=\"button\" aria-pressed=\"true\">Admin Login</a>-->  \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer id=\"footer-1\">\n");
      out.write("      <p>Copyright AbhiAllian, &copy; 2017</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("     CKEDITOR.replace( 'editor1' );\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/particles.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    particlesJS.load('particles-js', 'particles.json', function(){\n");
      out.write("        console.log('particles.json loaded...');\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("  </body>\n");
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
