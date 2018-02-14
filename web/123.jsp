<!doctype html>
<html lang="en">

<head>
  <title>Hello, world!</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link rel="stylesheet" href="css/bootstrap.min.css">
 
  
</head>

<body>
     
    <div class="Container">
        <form action="Continue" method="get">
        <h2><div class=" header header-content" position="center">Enter Your Details!</div></h2>
  <br>
      <label for="fname">Firstname</label>
      <input type="text" class="form-control" name="firstname" placeholder="Firstname" required>
    <br>
    
      <label for="lname">Lastname</label>
      <input type="text" class="form-control" name="lastname" placeholder="Lastname" required>
    <br>
    <label for="usn">USN</label>
    <input type="text" class="form-control" name="usn"  placeholder="USN" required>
  <br>
    <label for="email">E-mail</label>
    <input type="email" class="form-control" name="email" placeholder="E-mail" required>
  <br>
    <label for="phone">Phone</label>
    <input type="text" class="form-control" name="phone" placeholder="Phone" required>
  <br>
   <br> 
      <label class="mr-sm-3" for="course">Course</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="course" required><br>
        <option selected>Choose..</option>
        <option value="BE">BE</option>
        <option value="Diplomo">Diplomo</option>
        <option value="Btech">Btech</option>
      </select>
      <label class="mr-sm-3" for="branch">Branch</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="branch" required>
        <option selected>Choose..</option>
        <option value="CSE">CSE</option>
        <option value="ECE">ECE</option>
        <option value="ME">ME</option>
      </select>
   <br>
   <br>
      <label class="mr-sm-3" for="semester">Semester</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="semester" required>
        <option selected>Choose..</option>
        <option value="I">I</option>
        <option value="II">II</option>
        <option value="III">III</option>
        <option value="IV">IV</option>
        <option value="V">V</option>
      </select>
        
      <label class="mr-sm-3" for="type">      Type</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="type" required>
        <option selected>Choose..</option>
        <option value="User">User</option>
        <option value="Admin">Admin</option>
        
      </select>
    <br>
    <br>
    
  <button type="submit" class="btn btn-primary">Sign in</button>
  
</form>
</div>
</body>
<style>
    .Container{
        width: 500px;
        position: relative;
        margin-left:35%;
        margin-top: 25px;
/*        border: 0.5px solid blueviolet;*/
        border-radius: 15px;
        padding: 0px;
        
    } 
    body{
        background: #204d74;
    }
  input {
  font-family: inherit;
  font-size: inherit;
  color: inherit;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
    input[type="text"],input[type="email"]
    {
        border: none;
        margin: none;
        
    }
    </style>
</html>
