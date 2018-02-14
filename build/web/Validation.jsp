<%-- 
    Document   : Validation
    Created on : Nov 2, 2017, 10:23:01 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JavaScript Tutorial</title>
<script type="text/javascript">
function val(){
if(frm.password.value == "")
{
	alert("Enter the Password.");
	frm.password.focus(); 
	return false;
}
if((frm.password.value).length < 8)
{
	alert("Password should be minimum 8 characters.");
	frm.password.focus();
	return false;
}

if(frm.confirmpassword.value == "")
{
	alert("Enter the Confirmation Password.");
	return false;
}
if(frm.confirmpassword.value != frm.password.value)
{
	alert("Password confirmation does not match.");
	return false;
}

return true;
}
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
 
    </head>
    <body>
         <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        %>
        <div class="Container1">
       <div class="Container">
        <form name="frm">

  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="<%=session.getAttribute("email")%>" aria-describedby="emailHelp" placeholder="<%=session.getAttribute("email")%>">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
 <div class="form-group">
    <label for="exampleInputPassword1">Re-enter Password</label>
    <input type="password" name="confirmpassword"  class="form-control" id="exampleInputPassword1" placeholder="Re-enter Password">
  </div>
  
    <button type="submit" class="a btn btn-primary" onclick="return val();">Submit</button>
  
</form>
        </div>
    </div>
            <style>
                .Container{
                    background-color:  purple;
                    
                }
                .Container{
                    
                }
            </style>
    </body>
</html>
