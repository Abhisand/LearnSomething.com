<%-- 
    Document   : logout
    Created on : Sep 1, 2017, 10:28:12 AM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%
           session.removeAttribute("email");
                   session.removeAttribute("passwd");
                   response.sendRedirect("login_user.jsp");
            %>
    </body>
</html>
