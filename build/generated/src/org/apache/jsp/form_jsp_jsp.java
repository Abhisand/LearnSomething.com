package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class form_jsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<form method=\"post\" action=\"result.jsp\">\n");
      out.write("<table border=\"2\">\n");

Class.forName("com.mysql.jdbc.Driver").newInstance();

Class.forName("com.mysql.jdbc.Driver");
                                                                
            String quiery="select question ,optionA,optionB,optionC,optionD from Questions_C";
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
           Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from questions_c");
int i=1;
while(rs.next()){

      out.write("\n");
      out.write("<tr><td>");
      out.print(i);
      out.write("</td><td>");
      out.print(rs.getString("question"));
      out.write("</td>\n");
      out.write("    <td><input type=\"radio\" value=\"");
      out.print(rs.getString("option1"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\"/>\n");
      out.write("        ");
      out.print(rs.getString("option2"));
      out.write("</td>\n");
      out.write("    <td><input type=\"radio\" value=\"");
      out.print(rs.getString("option3"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\"/>\n");
      out.write("        ");
      out.print(rs.getString("option4"));
      out.write("\n");
      out.write("    </td><td><input type=\"radio\" value=\"");
      out.print(rs.getString("option4"));
      out.write("\" name=\"radio");
      out.print(i);
      out.write("\"/></td></tr>\n");
      out.write("        \n");

i++;
}

      out.write("\n");
      out.write("<tr><td><input type=\"submit\" value=\"submit\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</html>");
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
