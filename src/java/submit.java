/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class submit extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String UN=request.getParameter("Username");
        String PD=request.getParameter("Password");
      String RPD=request.getParameter("RPassword");
//      String name=request.getParameter("C_Name");
//       String password=request.getParameter("C_Passwd");
       
       String url="jdbc:mysql://localhost:3306/info";
       String N="root";
       String P="Abhisand1234";
   
       HttpSession session=request.getSession();
       session.setAttribute("temp_Name", PD);
       session.setAttribute("temp_Passwd", RPD);
       
       String sql="insert into u_account values(?,?)";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,N,P);
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, UN);
        st.setString(2, PD);
        if(!PD.equals(RPD))
        {
         st.executeUpdate();
         response.sendRedirect("U_Account.jsp");
        }
        else
        {
           response.sendRedirect("design.jsp");  
        }
    }
    
    catch (ClassNotFoundException ex) {} 
    catch (SQLException ex) {}
       
    }

}
