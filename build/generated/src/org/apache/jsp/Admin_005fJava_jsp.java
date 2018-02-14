package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Admin_005fJava_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Admin Area | Users</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-default\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">AdminStrap</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"index.jsp\">Dashboard</a></li>\n");
      out.write("              <!--<li class=\"active\"><a href=\"users.html\">Users</a></li>-->\n");
      out.write("            <li><a href=\"Admin_C.jsp\">C Questions</a></li>\n");
      out.write("            <li><a href=\"Admin_Cpp.java\">C++ Questions</a></li>\n");
      out.write("              <li><a href=\"Admin_Java.jsp\">JAVA Questions</a></li>\n");
      out.write(" <li><form action=\"signout\" method=\"get\"><button type=\"submit\" class=\"btn btn-success\">Secure Sign-out</button></form></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\">Welcome.....</a></li>\n");
      out.write("            <li><a href=\"login_admin.jsp\">Logout</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-10\">\n");
      out.write("            <h1><span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> KSIT<small>Manage Site Users</small></h1>\n");
      out.write("          </div>\n");
      out.write("<!--          <div class=\"col-md-2\">\n");
      out.write("            <div class=\"dropdown create\">\n");
      out.write("              <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                Create Content\n");
      out.write("                <span class=\"caret\"></span>\n");
      out.write("              </button>\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                <li><a type=\"button\" data-toggle=\"modal\" data-target=\"#addPage\">Add Page</a></li>\n");
      out.write("                <li><a href=\"#\">Add User</a></li>\n");
      out.write("                <li><a href=\"#\">Remove User</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>-->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section id=\"breadcrumb\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li><a href=\"index.html\">Dashboard</a></li>\n");
      out.write("          <li class=\"active\">  </li>\n");
      out.write("        </ol>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section id=\"main\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          \n");
      out.write("          <div class=\"col-md-14\">\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading main-color-bg\">\n");
      out.write("                <h3 class=\"panel-title\">Users</h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("        <div class=\"col-md-13\">\n");
      out.write("        <table class=\"table table-striped table-hover table-bordered\" id=\"Abhi\">\n");
      out.write("          <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th>Q No</th>\n");
      out.write("                <th>Question</th>\n");
      out.write("                <th>option1</th>\n");
      out.write("                <th>option2</th>\n");
      out.write("                <th>option3</th>\n");
      out.write("                <th>option4</th>\n");
      out.write("                <th>Answer</th>\n");
      out.write("              </tr>\n");
      out.write("          </thead>\n");
      out.write("\n");

Class.forName("com.mysql.jdbc.Driver").newInstance();

Class.forName("com.mysql.jdbc.Driver");
                                                                
            String quiery="select question ,option1,option2,option3,option4 from Questions_C";
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from questions_java");
int i=1;
while(rs.next()){

      out.write("\n");
      out.write("<tr><td>");
      out.print(i);
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("question"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("option1"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("option2"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("option3"));
      out.write("</td> \n");
      out.write("    <td>");
      out.print(rs.getString("option4"));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("ANSWER"));
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("        \n");

i++;
}

      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"col-md-2\">\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("              <a href=\"index.html\" class=\"list-group-item active main-color-bg\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> Dashboard\n");
      out.write("              </a>\n");
      out.write("              <a href=\"users.html\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Users <span class=\"badge\">");
      out.print(i);
      out.write("</span></a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-stats\" aria-hidden=\"true\"></span> Visitors <span class=\"badge\">");
      out.print(i);
      out.write("</span></a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Admin Users <span class=\"badge\">");
      out.print(i);
      out.write("</span></a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("            <div class=\"list-group\">\n");
      out.write("              <a href=\"index.html\" class=\"list-group-item active main-color-bg\">\n");
      out.write("                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> Dashboard\n");
      out.write("              </a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>C Questions<span class=\"badge\">10</span></a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-stats\" aria-hidden=\"true\"></span>C ++ Questions<span class=\"badge\">10</span></a>\n");
      out.write("              <a href=\"#\" class=\"list-group-item\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>Java Questions<span class=\"badge\">10></span></a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("          </div>-->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("      <p>Copyright AdminStrap, &copy; 2017</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"addPage\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <form>\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">Add Page</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Title</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Page Title\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Page Body</label>\n");
      out.write("          <textarea name=\"editor1\" class=\"form-control\" placeholder=\"Page Body\"></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"checkbox\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\"> Published\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Tags</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Some Tags...\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label>Meta Description</label>\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Add Meta Description...\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("     CKEDITOR.replace( 'editor1' );\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    $('#Abhi').dataTable();\n");
      out.write("    </script>\n");
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
