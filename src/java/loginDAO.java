
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO 
{
   public boolean check_u(String uname,String passwd) throws ClassNotFoundException, SQLException
   {
       String url="jdbc:mysql://localhost:3306/info";
       String name="root";
       String password="Abhisand1234";
       String quiery="select *from u_account where email=? and password=?";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,name,password);
       PreparedStatement st=con.prepareStatement(quiery);
       st.setString(1, uname);
       st.setString(2, passwd);
       ResultSet rs=st.executeQuery();
        if(rs.next())
       {
           return true;
       }
       
       return false;
   }
}
