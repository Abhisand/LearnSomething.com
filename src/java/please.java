/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Abhishek
 */
public class please extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        try {
            String quiery="insert into account values(?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            int count;
            try (Connection con = DriverManager.getConnection(url,name,passwd);
                    PreparedStatement st = con.prepareStatement(quiery)) {
                String FN=request.getParameter("firstname");
                String LN=request.getParameter("lastname");
                String sex=request.getParameter("sex");
                String email=request.getParameter("email");
                String DOB=request.getParameter("dob");
                String USN=request.getParameter("USN");
                String PN=request.getParameter("PhoneNumber");
                String C=request.getParameter("course");
                String B=request.getParameter("branch");
                String S=request.getParameter("Semester");
                HttpSession session=request.getSession();
                session.setAttribute("Name", FN);
                session.setAttribute("LName", LN);
                st.setString(1, FN);
                st.setString(2, LN);
//                st.setString(3, DOB);
//                st.setString(4, sex);
                st.setString(3, USN);
                st.setString(4, email);
                st.setString(5, PN);
                st.setString(6,C);
                 st.setString(7,B);
                 st.setString(8,S);
                out.println("FirstNAme:"+FN);
                out.println("LasttNAme:"+LN);
                out.println("sex:"+sex);
                out.println("email:"+email);
                out.println("DOB:"+DOB);
                out.println("USN:"+USN);
                out.println("Phone:"+PN);
                if("".equals(FN) || "".equals(LN) || "".equals(DOB) || "".equals(sex) || "".equals(email) ||"".equals(USN) || "".equals(PN))
                    response.sendRedirect("createAccount.jsp");
                else
                {
                count = st.executeUpdate();
                response.sendRedirect("U_Account.jsp");
                }
            }
// PrintWriter out1=response.getWriter();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(please.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
       
    }
}


