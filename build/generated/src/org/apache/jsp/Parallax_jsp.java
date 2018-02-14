package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Parallax_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Responsive Side Menu</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/Parallax.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"css/Parallax1.css\">\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("  <nav class=\"navbar\">\n");
      out.write("    <span class=\"open-slide\">\n");
      out.write("      <a href=\"#\" onclick=\"openSlideMenu()\">\n");
      out.write("        <svg width=\"30\" height=\"30\">\n");
      out.write("            <path d=\"M0,5 30,5\" stroke=\"#fff\" stroke-width=\"5\"/>\n");
      out.write("            <path d=\"M0,14 30,14\" stroke=\"#fff\" stroke-width=\"5\"/>\n");
      out.write("            <path d=\"M0,23 30,23\" stroke=\"#fff\" stroke-width=\"5\"/>\n");
      out.write("        </svg>\n");
      out.write("      </a>\n");
      out.write("    </span>\n");
      out.write("\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">About</a></li>\n");
      out.write("      <li><a href=\"Quiz_C.jsp\">C</a></li>\n");
      out.write("      <li><a href=\"Quiz_Cpp.jsp\">C++</a></li>\n");
      out.write("      <li><a href=\"Quiz_java.jsp\">Java</a></li>\n");
      out.write("      <li><a href=\"Background_video.jsp\">Kotlin</a></li>\n");
      out.write("      <li><a href=\"login_admin.jsp\">&nbsp;Admin</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <div id=\"side-menu\" class=\"side-nav\">\n");
      out.write("    <a href=\"#\" class=\"btn-close\" onclick=\"closeSlideMenu()\">&times;</a>\n");
      out.write("    <a href=\"#\">Home</a>\n");
      out.write("    <a href=\"#\">About</a>\n");
      out.write("    <a href=\"Quiz_C.jsp\">C</a>\n");
      out.write("    <a href=\"Quiz_Cpp.jsp\">C++</a>\n");
      out.write("    <a href=\"Quiz_java.jsp\">Java</a>\n");
      out.write("    <a href=\"Background_video.jsp\">Kotlin</a>\n");
      out.write("    <a href=\"login_user.jsp\">logout</a>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"pimg1\">\n");
      out.write("    <div class=\"ptext\">\n");
      out.write("      <span class=\"border\">\n");
      out.write("        Learn Something\n");
      out.write("      </span>\n");
      out.write("         <form action=\"signout\" method=\"get\"><button type=\"submit\" class=\"btn btn-success\">Secure Signout</button></form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <section class=\"section section-light\">\n");
      out.write("    <h2>C Language</h2>\n");
      out.write("    <p>\n");
      out.write("      I do think there are advantages to learning C first over C++ or Java. When you work in languages like Java, C# and even Python, you immediately start moving away from learning the fundamentals of a programming language and you start learning associated libraries and frameworks. But with C you get a few library calls, you stay focused on the semantics of the language longer, and C often forces you to think harder and deeper about what?s happening under the hood.\n");
      out.write("\n");
      out.write("C is a middle level language. When people talk about it you?ll hear phrases like ?coding to the metal,? or ?coding close to the wire.? C is the language of compilers, interpreters, editors, operating systems and embedded programming. When you learn to program in C you almost have to gain an understanding of how programs execute. You know what things like register, stack, heap and memory mapped IO mean. You start to think how much better life would have been if you had been born with sixteen fingers.\n");
      out.write("Simplicity and speed\n");
      out.write("C is simple, elegant and wicked fast; it?s compact and efficient. Because C has raw pointers, bitwise operators, and the keywords: extern, volatile, static, and register?meaning you?ll understand more about writing efficient code than you can glean from any higher level language. The only thing that will teach you these things any better is a low level language, and with modern processors I wouldn?t wish assembler on anyone.\n");
      out.write("\n");
      out.write("The C syntax is why programmers talk about the ?C Family of Languages,? which generally includes languages like: C, C++, C#, Java, EcmaScript (aka JavaScript), Objective-C and many others. Wikipedia lists plenty more, but I think their list is a bit wacky.\n");
      out.write("Discipline\n");
      out.write("C also happens to be demanding, fastidious, finicky and sometimes downright cryptic. You can easily write hard-to-read, difficult to maintain code in C. But, and this is a key point, you don?t have to. Learning to write maintainable code in C will require (and hopefully instill) coding discipline. In most languages fixing syntax errors can border on the trivial. For instance, Ada?s compiler error messages are so good it might as well have just fixed the code for you. Finding and correcting a missing or additional semicolon in C can sometimes be an epic undertaking. \n");
      out.write("\n");
      out.write("Fewer distractions\n");
      out.write("C is not an object oriented language so you don?t get distracted by things like inheritance and polymorphism. I?m not saying these aren?t important concepts, it?s just that you can simplify things a bit by learning straight procedural programming first. In fact, once you've learned C, and written a couple of embedded programs on some single board computers, learning C++ is a natural next step. You will need to get someone to pry your fingers off the macros and preprocessor directives but other than that it will be straightforward. I would be tempted to teach C with a C++ compiler, and just highlight the few differences that weren?t backwards compatible with a strict C compiler.\n");
      out.write("Embedded programming\n");
      out.write("My final argument for learning C is tied to doing embedded programming. As a programmer I always get a sense of satisfaction when I deliver any working piece of code. Making a computer do what you want can be satisfying. But when I integrate my embedded code with some custom hardware that makes things happen outside of the computer?from moving a robotic arm to generating a precisely timed waveform?I get an incomparable thrill. That thrill only happens because I learned C. Of course, I ended up doing most of my embedded coding in C++ but I still felt that learning C first made it all possible. If you want a fast pleasant way to learn C, Pluralsight has you covered, check out Kenny Kerr?s The C \n");
      out.write("    </p>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <div class=\"pimg2\">\n");
      out.write("    <div class=\"ptext\">\n");
      out.write("      <span class=\"border trans\">\n");
      out.write("        C++\n");
      out.write("        \n");
      out.write("      </span>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <section class=\"section section-dark\">\n");
      out.write("    \n");
      out.write("    <p>\n");
      out.write("        History of C++\n");
      out.write("\n");
      out.write("The origin of C++ dates back to 1979 when Bjarne Stroustrup, also an employee of Bell AT &T, started working on language C with classes. He borrowed desirable features from many other languages like Simula, Ada, ML, CLU and ALGOL 68.  Thus, in addition to features of C language, C++ also included classes, strong type checking, default function argument and basic inheritance.  Till 1983, it was called C with classes, and in 1983 it was named C++. During 1998, a joint ANSI-ISO committee released the specification for C++ language standards.\n");
      out.write("\n");
      out.write("In mid-2011, C++11, a new C++ standard was released. It was considerably influenced from the Boost library project and many of the new modules were sourced directly from the corresponding Boost libraries. It also added other new features including  a comprehensive randomization library, regular expression support , a new C++ time library, a standard threading library, atomics support, auto keyword, improved support for unions and array-initialization lists, new templates and container classes. C++14, released in December 2014, included smaller improvements and bug fixes over C++11.\n");
      out.write("\n");
      out.write("<h4>Benefits of C++</h4>\n");
      out.write("\n");
      out.write("C++ is a highly portable language and is often the language of choice for multi-device, multi-platform app development.\n");
      out.write("C++ is an object-oriented programming language and includes classes, inheritance, polymorphism, data abstraction and encapsulation.\n");
      out.write("C++ has a rich function library.\n");
      out.write("C++ allows exception handling, and function overloading which are not possible in C.\n");
      out.write("C++ is a powerful, efficient and fast language. It finds a wide range of applications ? from GUI applications to 3D graphics for games to real-time mathematical simulations.\n");
      out.write("    </p>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <div class=\"pimg3\">\n");
      out.write("    <div class=\"ptext\">\n");
      out.write("      <span class=\"border trans\">\n");
      out.write("        Java\n");
      out.write("      </span>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <section class=\"section section-dark\">\n");
      out.write("    \n");
      out.write("    <p><h3 align=\"left\">Why To learn Java?</h3>\n");
      out.write("        <h4>Lots of information<h4>\n");
      out.write("\n");
      out.write("Due to how long Java has been around, almost any question you can imagine has already been asked, answered, indexed, and democratically perfected through upvotes on the Internet. It is seriously hard to stump a search engine with a Java coding problem.\n");
      out.write("\n");
      out.write("<h4 >An incredible toolset<h4>\n");
      out.write("\n");
      out.write("Java has a very rich API, and an incredible supporting open source ecosystem. There are tools upon tools for just about everything you would like to do. There?s also an amazing community driven process that ensures growth in the right direction\n");
      out.write("\n");
      out.write("<h4>Software that leads by example<h4>\n");
      out.write("\n");
      out.write("Java is an Object Oriented language. It internally embraces best practices of object oriented design and strongly suggests that you learn and follow them. It also heavily promotes correct usage and many of the documented Design Patterns use Java as the language de facto. Understanding design patterns can lead to much more maintainable code.\n");
      out.write("\n");
      out.write("<h4>Killer editors<h4>\n");
      out.write("\n");
      out.write("The IDEs available for Java will blow your mind. Due to its strong typing, you?ll not only be notified immediately of errors, but you?ll also be given suggestions that will refactor and reformat your code with clear explanations and extreme ease. After using them, most people wonder how they ever coded before.\n");
      out.write("\n");
      out.write("<h4>Omnipresence<h4>\n");
      out.write("\n");
      out.write("Java is running just about everywhere you can imagine. It?s usually where most large applications end up due to its scalability, stability, and maintainability. There?s also currently a gigantic push in the Java community to be the leader of the IoT (Internet of Things). And it?s coming. Very fast. There?ll be a time in the near future when your alarm clock will automatically start brewing your coffee pot, and it?ll most likely be Java doing that.\n");
      out.write("\n");
      out.write("<h4>Lots of available jobs<h4>\n");
      out.write("\n");
      out.write("There are tons of open positions waiting for you due to Java?s widespread reach. Many different sectors embrace the language, and you can be pretty certain you?ll land a job in just about any job market you?d like.\n");
      out.write("\n");
      out.write("<h4>Android adoption<h4>\n");
      out.write("\n");
      out.write("Duke -> Android\n");
      out.write("\n");
      out.write("All Android Apps are written in Java. By taking our Android Development track, you can publish that app you?ve always dreamed of building.\n");
      out.write("\n");
      out.write("<h4> Ease of learning</h4>>\n");
      out.write("\n");
      out.write("Java is a verbose language, which at first can seem daunting. However, after learning the basics you?ll find that you can easily grab onto more advanced concepts because the code is very explicit. Plus, there are great courses (wink, wink, nudge, nudge) out there that can ease you into this powerful language.\n");
      out.write("\n");
      out.write("So what are you waiting for?  It?s time to learn Java.\n");
      out.write("    </p>\n");
      out.write("  </section>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    function openSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '250px';\n");
      out.write("      document.getElementById('main').style.marginLeft = '250px';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function closeSlideMenu(){\n");
      out.write("      document.getElementById('side-menu').style.width = '0';\n");
      out.write("      document.getElementById('main').style.marginLeft = '0';\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
