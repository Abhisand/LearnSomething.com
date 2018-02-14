<%-- 
    Document   : Admin_C
    Created on : Nov 8, 2017, 6:36:27 AM
    Author     : Abhishek
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Users</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
  </head>
  <body>
 <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        %>
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">AdminStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="index.jsp">Dashboard</a></li>
              <!--<li class="active"><a href="users.html">Users</a></li>-->
            <li><a href="Admin_C.jsp">C Questions</a></li>
            <li><a href="Admin_Cpp.jsp">C++ Questions</a></li>
              <li><a href="Admin_Java.jsp">JAVA Questions</a></li>
 <li><form action="signout" method="get"><button type="submit" class="btn btn-success">Secure Sign-out</button></form></li>

          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome......</a></li>
            <li><a href="login_admin.jsp">Logout</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> KSIT<small>Manage Site Users</small></h1>
          </div>
<!--          <div class="col-md-2">
            <div class="dropdown create">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Create Content
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <li><a type="button" data-toggle="modal" data-target="#addPage">Add Page</a></li>
                <li><a href="#">Add User</a></li>
                <li><a href="#">Remove User</a></li>
              </ul>
            </div>
          </div>-->
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li><a href="index.html">Dashboard</a></li>
          <li class="active">  </li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          
          <div class="col-md-14">

            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Users</h3>
              </div>
              <div class="panel-body">
                <div class="container">
        <div class="col-md-13">
        <table class="table table-striped table-hover table-bordered" id="Abhi">
          <thead>
              <tr>
                <th>Q No</th>
                <th>Question</th>
                <th>option1</th>
                <th>option2</th>
                <th>option3</th>
                <th>option4</th>
                <th>Answer</th>
              </tr>
          </thead>

<%
Class.forName("com.mysql.jdbc.Driver").newInstance();

Class.forName("com.mysql.jdbc.Driver");
                                                                
            String quiery="select question ,option1,option2,option3,option4 from Questions_C";
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from questions_cpp");
int i=1;
while(rs.next()){
%>
<tr><td><%=i%></td>
    <td><%=rs.getString("question")%></td>
    <td><%=rs.getString("option1")%></td>
    <td><%=rs.getString("option2")%></td>
    <td><%=rs.getString("option3")%></td> 
    <td><%=rs.getString("option4")%></td>
    <td><%=rs.getString("ANSWER")%></td>
</tr>
        
<%
i++;
}
%>
        </table>
        
      </div>
              </div>
              </div>

          </div>
        </div>
<!--        <div class="col-md-2">
            <div class="list-group">
              <a href="index.html" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="users.html" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Users <span class="badge"><%=i%></span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-stats" aria-hidden="true"></span> Visitors <span class="badge"><%=i%></span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin Users <span class="badge"><%=i%></span></a>
            </div>
            

          </div>
            <div class="col-md-2">
            <div class="list-group">
              <a href="index.html" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>C Questions<span class="badge">10</span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-stats" aria-hidden="true"></span>C ++ Questions<span class="badge">10</span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>Java Questions<span class="badge">10></span></a>
            </div>
            
            

          </div>-->
            
            
      </div>
    </section>

    <footer id="footer">
      <p>Copyright AdminStrap, &copy; 2017</p>
    </footer>

    <div class="modal fade" id="addPage" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <form>
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Page</h4>
      </div>
      <div class="modal-body">
        <div class="form-group">
          <label>Page Title</label>
          <input type="text" class="form-control" placeholder="Page Title">
        </div>
        <div class="form-group">
          <label>Page Body</label>
          <textarea name="editor1" class="form-control" placeholder="Page Body"></textarea>
        </div>
        <div class="checkbox">
          <label>
            <input type="checkbox"> Published
          </label>
        </div>
        <div class="form-group">
          <label>Meta Tags</label>
          <input type="text" class="form-control" placeholder="Add Some Tags...">
        </div>
        <div class="form-group">
          <label>Meta Description</label>
          <input type="text" class="form-control" placeholder="Add Meta Description...">
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Save changes</button>
      </div>
    </form>
    </div>
  </div>
</div>

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
   <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap.min.js"></script>
    <script>
    $('#Abhi').dataTable();
    </script>
  </body>
</html>
