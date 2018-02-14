<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Area | Dashboard</title>
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
          <a class="navbar-brand" href="learn.jsp">Learn Something</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp">Dashboard</a></li>
            <li><a href="Admin_C.jsp">C Questions</a></li>
            <li><a href="Admin_Cpp.jsp">C++ Questions</a></li>
              <li><a href="Admin_Java.jsp">JAVA Questions</a></li>
            <!--<li><a href="users.html">Users</a></li>-->
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Welcome, Abhi</a></li>
            <li><form action="signout" method="get"><button type="submit" class="btn btn-success">Signout</button></form></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-8">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> KSIT <small>Department Of Computer science</small></h1>
          </div>
          <div class="col-md-2">
            <div class="dropdown create">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Upload Center
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <!--<li><a type="button" data-toggle="modal" data-target="#addPage">Add Page</a></li>-->
                <li><a href="#">Add C Questions</a></li>
                <li><a href="#">Add C++ Questions</a></li>
                <li><a href="#">Add Java Questions</a></li>
                <li><a href="#">Add Kotlin Questions</a></li>
              </ul>
            </div>
          </div>
            
            <div class="col-md-2">
            <div class="dropdown create">
              <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                Create Content
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                <!--<li><a type="button" data-toggle="modal" data-target="#addPage">Add Page</a></li>-->
                <li><a href="createAccount.jsp">Add User</a></li>
                <li><a href="#">Remove User</a></li>

              </ul>
            </div>
          </div>
        </div>
      </div>
    </header>

    <section id="breadcrumb">
      <div class="container">
        <ol class="breadcrumb">
          <li class="active">Dashboard</li>
        </ol>
      </div>
    </section>

    <section id="main">
      <div class="container">
        <div class="row">
          <div class="col-md-2">
            <div class="list-group">
              <a href="index.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Dashboard
              </a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Admin Users <span class="badge">12</span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-stats" aria-hidden="true"></span> Visitors <span class="badge">33</span></a>
              <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Users <span class="badge">20</span></a>
            </div>

            <!--<div class="well">-->
              <!--<h4>Disk Space Used</h4>-->
              <!--<div class="progress">-->
                  <!--<div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">-->
                      <!--60%-->
              <!--</div>-->
            <!--</div>-->
            <!--<h4>Bandwidth Used </h4>-->
            <!--<div class="progress">-->
                <!--<div class="progress-bar" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">-->
                    <!--40%-->
            <!--</div>-->
          <!--</div>-->
            <!--</div>-->
          </div>
          <div class="col-md-10">
            <!-- Website Overview -->
            <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Website Overview</h3>
              </div>
              <div class="panel-body">

                <div class="col-md-4">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>10</h2>
                    <h4>C Questions</h4>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 10</h2>
                    <h4>C++ Qustions</h4>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="well dash-box">
                    <h2><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>10</h2>
                    <h4>JAVA Questions</h4>
                  </div>
                </div>
                  <!--<div class="col-md-4">-->
                      <!--<div class="well dash-box">-->
                          <!--<h2><span class="glyphicon glyphicon-stats" aria-hidden="true"></span> 12,334</h2>-->
                          <!--<h4>Visitors</h4>-->
                      <!--</div>-->
                  <!--</div>-->
                  <!--&lt;!&ndash;<div class="col-md-4">&ndash;&gt;-->
                      <!--<div class="well dash-box">-->
                          <!--<h2><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 203</h2>-->
                          <!--<h4>Users</h4>-->
                      <!--</div>-->
                  <!--</div>-->
                  <!--<div class="col-md-4">-->
                      <!--<div class="well dash-box">-->
                          <!--<h2><span class="glyphicon glyphicon-user" aria-hidden="true"></span> 25</h2>-->
                          <!--<h4>Admin Users</h4>-->
                      <!--</div>-->
                  <!--</div>-->
              </div>
              </div>
</div>
              <!-- Latest Users -->
               <div class="panel-body">
                <div class="container">
        <div class="col-md-12">
        <table class="table table-striped table-hover table-bordered" id="Abhi">
          <thead>
              <tr>
                <th>Sl No</th>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>usn</th>
                <th>email</th>
                <th>phone</th>
                <th>course</th>
                <th>branch</th>
                <th>sem</th>
                <th>type</th>
              </tr>
          </thead>

<%
Class.forName("com.mysql.jdbc.Driver").newInstance();

Class.forName("com.mysql.jdbc.Driver");
                                                                
            String quiery="select question ,option1,option2,option3,option4 from Questions_C";
            String url="jdbc:mysql://localhost:3306/jsp";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from help");
int i=1;
while(rs.next()){
%>
<tr><td><%=i%></td>
    <td><%=rs.getString("firstname")%></td>
    <td><%=rs.getString("lastname")%></td>
    <td><%=rs.getString("usn")%></td>
    <td><%=rs.getString("email")%></td> 
    <td><%=rs.getString("phone")%></td>
    <td><%=rs.getString("course")%></td>
    <td><%=rs.getString("branch")%></td>
    <td><%=rs.getString("sem")%></td>
    <td><%=rs.getString("type")%></td>
</tr>
        
<%
i++;
}
%>
        </table>
        
      </div>
              </div>
              </div>

         </div> ////
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
</html>
