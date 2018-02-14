
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kotlin
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    String quiery ="insert into u_account values(?,?)";  
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            Connection con = DriverManager.getConnection(url,name,passwd);
            CallableStatement st=con.prepareCall("{call show(?,?)}");
//            st.setString(1, (String) session.getAttribute("email"));
//            st.setString(2,request.getParameter("confirmpassword"));
            st.setString(1, "jn jn j");
            st.setString(2, "jn jn j");
            System.out.println("Count:"+st.executeUpdate());
          
         
}
}