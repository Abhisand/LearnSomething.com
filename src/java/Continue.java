
import java.io.IOException;
import java.io.PrintWriter;
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
public class Continue extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        try {
            String quiery="insert into help values(?,?,?,?,?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jsp";
            String name="root";
            String passwd="Abhisand1234";
            int count;
           Connection con = DriverManager.getConnection(url,name,passwd);
                    PreparedStatement st = con.prepareStatement(quiery);
                String FN=request.getParameter("firstname");
                String LN=request.getParameter("lastname");
                 String USN=request.getParameter("usn");
                String EMAIL=request.getParameter("email");
                 String PHONE=request.getParameter("phone");
                String COURSE=request.getParameter("course");
                 String BRANCH=request.getParameter("branch");
                String SEM=request.getParameter("semester");
                String type=request.getParameter("type");
                HttpSession session=request.getSession();
              session.setAttribute("email", EMAIL);
              session.setAttribute("type", type);
              
               
              st.setString(1, FN);
                st.setString(2, LN);
                 st.setString(3, USN);
                st.setString(4, EMAIL);
                 st.setString(5, PHONE);
                st.setString(6, COURSE);
                 st.setString(7, BRANCH);
                st.setString(8, SEM);
                st.setString(9, type);
               
               PrintWriter out=response.getWriter();
               out.println(FN);
               out.println(LN);
               out.println(USN);
               out.println(EMAIL);
               out.println(PHONE);
               out.println(COURSE);
               out.println(BRANCH);
               out.println(SEM);
               out.println(type);
               
               out.print("count "+st.executeUpdate());
               response.sendRedirect("step2.jsp");
               
                            } catch (ClassNotFoundException ex) {
           
        } catch (SQLException ex) {
            
        }

       
      
      
    }

   
}
