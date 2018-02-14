package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Quiz_005fjava_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Quiz</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"quiz_C.css\">\n");
      out.write("    <!--<link href=\"https://fonts.googleapis.com/css?family=Indie+Flower\" rel=\"stylesheet\">-->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"Quiz_java.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
 response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        
      out.write("\n");
      out.write("<div id=\"particles-js\">\n");
      out.write("    <div id=\"QuizContainer\" class=\"Container\">\n");
      out.write("        <div class=\"title\">Java(JDK 1.8_141)</div>\n");
      out.write("        <div class=\"question\" id=\"question\"></div>\n");
      out.write("        <label class=\"option\"><input type=\"radio\" name=\"option\" value=\"1\"><span id=\"opt1\"></span></label>\n");
      out.write("        <label class=\"option\"><input type=\"radio\" name=\"option\" value=\"2\"><span id=\"opt2\"></span></label>\n");
      out.write("        <label class=\"option\"><input type=\"radio\" name=\"option\" value=\"3\"><span id=\"opt3\"></span></label>\n");
      out.write("        <label class=\"option\"><input type=\"radio\" name=\"option\" value=\"4\"><span id=\"opt4\"></span></label>\n");
      out.write("        <button id=\"nextButton\" class=\"next-btn\" onclick=\"loadNextQuestion();\">Next Question</button>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"result\" class=\"container result\"  style=\"display: none\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    particlesJS.load('particles-js', 'particles_C.json', function(){\n");
      out.write("        console.log('particles_C.json loaded...');\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"questions_java.js\"></script>\n");
      out.write("<script src=\"quiz-script_java.js\"></script>\n");
      out.write("\n");
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
