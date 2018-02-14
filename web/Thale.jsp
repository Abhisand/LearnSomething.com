<%-- 
    Document   : Thale
    Created on : Nov 9, 2017, 7:49:31 PM
    Author     : Abhishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Thale.css">
    </head>
    <body>
        <div class="container" >
            <div class="container1" style="border:2px solid #122b40" style="border-radius:20px ">
                <center>
                <h1>Enter The Credentials</h1>
                </center>
            </div>
            <!--<center>-->
            <form action="Continue" method="get" class="sir">
            <label>Firstname</label>
      <input type="text" name="firstname" placeholder="Firstname" required>
     <br><br>
       <label for="lname">Lastname</label>
      <input type="text"  name="lastname" placeholder="Lastname" required>
      <br><br>
      <label for="usn">USN</label>
    <input type="text" name="usn"  placeholder="USN" required>
    <br><br>
     <label for="email">E-mail</label>
    <input type="email"  name="email" placeholder="E-mail" required>
    <br><br>
    <label for="phone">Phone</label>
    <input type="text" name="phone" placeholder="Phone" required>
    <br><br>
     <label for="course">Course</label>
      <select  name="course" required>
        <option selected>Choose..</option>
        <option value="BE">BE</option>
        <option value="Diplomo">Diplomo</option>
        <option value="Btech">Btech</option>
      </select>
      &nbsp; &nbsp; &nbsp;
      <label  for="branch">Branch</label>
      <select  name="branch" required>
        <option selected>Choose..</option>
        <option value="CSE">CSE</option>
        <option value="ECE">ECE</option>
        <option value="ME">ME</option>
      </select>
      <br><br>
      <label for="semester">Semester</label>
      <select  name="semester" required>
        <option selected>Choose..</option>
        <option value="I">I</option>
        <option value="II">II</option>
        <option value="III">III</option>
        <option value="IV">IV</option>
        <option value="V">V</option>
      </select>
      &nbsp; &nbsp; &nbsp;
      <label for="type">Type</label>
      <select name="type" required>
        <option selected>Choose..</option>
        <option value="User">User</option>
        <option value="Admin">Admin</option>
        
      </select>
      <br><br>
       <button type="submit" class="btn btn-primary">Sign in</button>
       </form>
                       <!--</center>-->

        </div>
    </body>
</html>
