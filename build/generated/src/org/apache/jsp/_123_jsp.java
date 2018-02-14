package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _123_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Hello, world!</title>\n");
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write(" \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     \n");
      out.write("    <div class=\"Container\">\n");
      out.write("        <form action=\"Continue\" method=\"get\">\n");
      out.write("        <h2><div class=\" header header-content\" position=\"center\">Enter Your Details!</div></h2>\n");
      out.write("  <br>\n");
      out.write("      <label for=\"fname\">Firstname</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" name=\"firstname\" placeholder=\"Firstname\" required>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("      <label for=\"lname\">Lastname</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" name=\"lastname\" placeholder=\"Lastname\" required>\n");
      out.write("    <br>\n");
      out.write("    <label for=\"usn\">USN</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"usn\"  placeholder=\"USN\" required>\n");
      out.write("  <br>\n");
      out.write("    <label for=\"email\">E-mail</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"E-mail\" required>\n");
      out.write("  <br>\n");
      out.write("    <label for=\"phone\">Phone</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"Phone\" required>\n");
      out.write("  <br>\n");
      out.write("   <br> \n");
      out.write("      <label class=\"mr-sm-3\" for=\"course\">Course</label>\n");
      out.write("      <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" name=\"course\" required><br>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"BE\">BE</option>\n");
      out.write("        <option value=\"Diplomo\">Diplomo</option>\n");
      out.write("        <option value=\"Btech\">Btech</option>\n");
      out.write("      </select>\n");
      out.write("      <label class=\"mr-sm-3\" for=\"branch\">Branch</label>\n");
      out.write("      <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" name=\"branch\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"CSE\">CSE</option>\n");
      out.write("        <option value=\"ECE\">ECE</option>\n");
      out.write("        <option value=\"ME\">ME</option>\n");
      out.write("      </select>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("      <label class=\"mr-sm-3\" for=\"semester\">Semester</label>\n");
      out.write("      <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" name=\"semester\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"I\">I</option>\n");
      out.write("        <option value=\"II\">II</option>\n");
      out.write("        <option value=\"III\">III</option>\n");
      out.write("        <option value=\"IV\">IV</option>\n");
      out.write("        <option value=\"V\">V</option>\n");
      out.write("      </select>\n");
      out.write("        \n");
      out.write("      <label class=\"mr-sm-3\" for=\"type\">      Type</label>\n");
      out.write("      <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" name=\"type\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"User\">User</option>\n");
      out.write("        <option value=\"Admin\">Admin</option>\n");
      out.write("        \n");
      out.write("      </select>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<style>\n");
      out.write("    .Container{\n");
      out.write("        width: 500px;\n");
      out.write("        position: relative;\n");
      out.write("        margin-left:35%;\n");
      out.write("        margin-top: 25px;\n");
      out.write("/*        border: 0.5px solid blueviolet;*/\n");
      out.write("        border-radius: 15px;\n");
      out.write("        padding: 0px;\n");
      out.write("        \n");
      out.write("    } \n");
      out.write("    body{\n");
      out.write("        background: #204d74;\n");
      out.write("    }\n");
      out.write("  input {\n");
      out.write("  font-family: inherit;\n");
      out.write("  font-size: inherit;\n");
      out.write("  color: inherit;\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("    input[type=\"text\"],input[type=\"email\"]\n");
      out.write("    {\n");
      out.write("        border: none;\n");
      out.write("        margin: none;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    </style>\n");
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
