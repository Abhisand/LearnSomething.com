/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek
 */
public class Abhi extends HttpServlet {

   
   static int i=1;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
          
            Class.forName("com.mysql.jdbc.Driver");
            Random R=new Random();
            int r=R.nextInt(10);//                                                                 
            String quiery="select question ,optionA,optionB,optionC,optionD from Questions_C where qn="+5;
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(quiery);
          
            st.close();
            con.close();
            //System.out.println("count: "+count+" rows affected");
            if((i++)<=5)
           response.sendRedirect("sample.jsp");//
            else{i=0;
                response.sendRedirect("design.jsp");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Questions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
