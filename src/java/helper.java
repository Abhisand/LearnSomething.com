/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.apache.tomcat.jni.Lock.name;


@WebServlet(urlPatterns = {"/helper"})
public class helper extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session=request.getSession();
            String email=(String)request.getAttribute("email");
            String type=(String) session.getAttribute("type");
//            
            String password=request.getParameter("password");
            String quiery ="insert into u_account values(?,?)";  
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            Connection con = DriverManager.getConnection(url,name,passwd);
            
            PreparedStatement st = con.prepareStatement(quiery);
            st.setString(1, (String) session.getAttribute("email"));
            st.setString(2,request.getParameter("confirmpassword"));
            CallableStatement calstat=con.prepareCall("{call reg(?,?)}");
            calstat.setString(1,(String) session.getAttribute("email") );
            calstat.setString(2, request.getParameter("confirmpassword"));
           if( session.getAttribute("type").equals("User"))
           {
             st.executeUpdate();
             response.sendRedirect("login_user.jsp");  
           }
           else
           {
               calstat.executeUpdate();
               response.sendRedirect("login_admin.jsp");
           }
            PrintWriter out=response.getWriter();
            calstat.executeUpdate();
//          
            out.print("Welcome " +session.getAttribute("type")+" "+password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(helper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(helper.class.getName()).log(Level.SEVERE, null, ex);
        }

     
        }
      
}
    

   

