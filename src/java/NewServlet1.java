/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek
 */
public class NewServlet1 extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String name=request.getParameter("Username");
      String passwd=request.getParameter("Password");
      loginDAO dao=new loginDAO();
      try {
          if(dao.check_u(name, passwd) )
          {
              HttpSession session=request.getSession();
              session.setAttribute("email", name);
              session.setAttribute("upasswd", passwd);
              response.sendRedirect("Parallax.jsp");
          }
          else
          {  
              response.sendRedirect("login_user.jsp");
          }
      } catch (ClassNotFoundException ex) {
          
      } catch (SQLException ex) {
         
      }
    }

}
