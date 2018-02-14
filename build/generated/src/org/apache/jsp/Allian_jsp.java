package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Allian_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Create Account</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Account_Style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"Account\">\n");
      out.write("    <form action=\"please\" method=\"get\">\n");
      out.write("        <div>\n");
      out.write("            <label>First name</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"firstname\" placeholder=\"First Name\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <label>Last name</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"lastname\" placeholder=\"Last Name\">\n");
      out.write("        </div>\n");
      out.write("<!--        <div>\n");
      out.write("            <label>Sex</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=radio name=\"sex\" value=\"male\">Male<br>\n");
      out.write("            <input type=radio name=\"sex\" value=\"female\">Female<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>Date Of Birth  :</label>\n");
      out.write("\n");
      out.write("            <input type=\"date\" name=\"dob\">\n");
      out.write("        </div>-->\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <label>U S N :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"USN\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>E-mail  :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"email\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>phone :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"PhoneNumber\" placeholder=\"PhoneNumber\">\n");
      out.write("        </div>\n");
      out.write("<div>\n");
      out.write("            <label>Course :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"course\" placeholder=\"Course\">\n");
      out.write("        </div>\n");
      out.write(" <div>\n");
      out.write("            <label>Branch :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"branch\" placeholder=\"Branch\">\n");
      out.write("        </div>\n");
      out.write("<div>\n");
      out.write("            <label>SEM :</label>\n");
      out.write("\n");
      out.write("            <br><input type=\"text\" name=\"Semester\" placeholder=\"Semester\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"submit\" class=\"button\" value=\"Continue\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
