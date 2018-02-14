<%-- 
    Document   : start
    Created on : Nov 6, 2017, 5:56:22 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/start.css" rel="stylesheet">
   
    </head>
   
<body>
     <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        %>
  <div id="particles-js">
     
    <div class="img">
        <img src="img/codecycle.gif">
 
</div>
    </div>
   
  </div>

  <script src="js/particles.min.js"></script>

  <script>
    particlesJS.load('particles-js', 'start.json', function(){
      console.log('particles.json loaded...');
    });
  </script>
</body>
</html>
 