package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class step2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Panda Login</title>\n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/step2.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function val(){\n");
      out.write("if(frm.password.value == \"\")\n");
      out.write("{\n");
      out.write("\talert(\"Enter the Password.\");\n");
      out.write("\tfrm.password.focus(); \n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("if((frm.password.value).length < 8)\n");
      out.write("{\n");
      out.write("\talert(\"Password should be minimum 8 characters.\");\n");
      out.write("\tfrm.password.focus();\n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if(frm.confirmpassword.value == \"\")\n");
      out.write("{\n");
      out.write("\talert(\"Enter the Confirmation Password.\");\n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("if(frm.confirmpassword.value != frm.password.value)\n");
      out.write("{\n");
      out.write("\talert(\"Password confirmation does not match.\");\n");
      out.write("\treturn false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("  <div class=\"panda\">\n");
      out.write("  <div class=\"ear\"></div>\n");
      out.write("  <div class=\"face\">\n");
      out.write("    <div class=\"eye-shade\"></div>\n");
      out.write("    <div class=\"eye-white\">\n");
      out.write("      <div class=\"eye-ball\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"eye-shade rgt\"></div>\n");
      out.write("    <div class=\"eye-white rgt\">\n");
      out.write("      <div class=\"eye-ball\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"nose\"></div>\n");
      out.write("    <div class=\"mouth\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"body\"> </div>\n");
      out.write("  <div class=\"foot\">\n");
      out.write("    <div class=\"finger\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"foot rgt\">\n");
      out.write("    <div class=\"finger\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <form name=\"frm\" action=\"helper\" method=\"get\">\n");
      out.write("  <div class=\"hand\"></div>\n");
      out.write("  <div class=\"hand rgt\"></div>\n");
      out.write("  <h1>Panda's Welcome!</h1>\n");
      out.write("  <h1>");
      out.print(session.getAttribute("email"));
      out.write("</h1>\n");
      out.write(" <div class=\"form-group\">\n");
      out.write("     <input type=\"password\" name=\"password\" required=\"required\" class=\"form-control\"/>\n");
      out.write("    <label class=\"form-label\">Password    </label>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <input id=\"password\" name=\"confirmpassword\" type=\"password\" required=\"required\" class=\"form-control\"/>\n");
      out.write("    <label class=\"form-label\">Re-Enter Password</label>\n");
      out.write("    <p class=\"alert\">Invalid Credentials..!!</p>\n");
      out.write("    <button type=\"submit\" class=\"btn\">Login </button>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("  <script src='js/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("    <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
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