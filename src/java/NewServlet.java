
import java.io.IOException;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {      try {
        Class.forName("com.mysql.jdbc.Driver");
       
      Random R=new Random();
      int r=R.nextInt(100);
      String quiery="insert into database_c values(?,?,?,?)";
      String url="jdbc:mysql://localhost:3306/database_C";
      String name="root";
      String passwd="Abhisand1234";
      System.out.println(System.nanoTime());
      DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date=new Date();
      Connection con=DriverManager.getConnection(url,name,passwd);
      PreparedStatement st=con.prepareStatement(quiery);
      
      st.setInt(1,r);
      st.setString(2,"abhi");
      st.setString(3,dateFormat.format(date));
      st.setInt(4, 100);
      int count=st.executeUpdate();
      st.close();
      con.close();
      System.out.println("count: "+count+" rows affected");
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        response.sendRedirect("Quiz_C.html");
    }
    
}
