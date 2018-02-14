<!doctype html>
<html lang="en">

<head>
  <title>Hello, world!</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="createAccount.css">
  
</head>

<body>
     
    <div class="Container">
        <form action="Continue" method="get">
        
  <div class="form-row">
    <div class="form-group col-md-4">
      <label for="fname">Firstname</label>
      <input type="text" class="form-control" name="firstname" placeholder="Firstname" required>
    </div>
    <div class="form-group col-md-4">
      <label for="lname">Lastname</label>
      <input type="text" class="form-control" name="lastname" placeholder="Lastname" required>
    </div>
  </div>
        <div class="form-row">
  <div class="form-group col-md-8">
    <label for="usn">USN</label>
    <input type="text" class="form-control" name="usn"  placeholder="USN" required>
  </div>
  <div class="form-group col-md-8">
    <label for="email">E-mail</label>
    <input type="email" class="form-control" name="email" placeholder="E-mail" required>
  </div>
   <div class="form-group col-md-8">
    <label for="phone">Phone</label>
    <input type="text" class="form-control" name="phone" placeholder="Phone" required>
  </div>
        </div>
 
         <div class="form-row align-items-center">
    <div class="col-auto">
      <label class="mr-sm-3" for="course">Course</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="course" required>
        <option selected>Choose..</option>
        <option value="BE">BE</option>
        <option value="Diplomo">Diplomo</option>
        <option value="Btech">Btech</option>
      </select>
    </div>
             <div class="col-auto">
      <label class="mr-sm-3" for="branch">Branch</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="branch" required>
        <option selected>Choose..</option>
        <option value="CSE">CSE</option>
        <option value="ECE">ECE</option>
        <option value="ME">ME</option>
      </select>
    </div>
             <div class="col-auto">
      <label class="mr-sm-3" for="semester">Semester</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="semester" required>
        <option selected>Choose..</option>
        <option value="I">I</option>
        <option value="II">II</option>
        <option value="III">III</option>
        <option value="IV">IV</option>
        <option value="V">V</option>
      </select>
    </div>
             <div class="col-auto">
      <label class="mr-sm-3" for="type">Type</label>
      <select class="custom-select mb-2 mr-sm-2 mb-sm-0" name="type" required>
        <option selected>Choose..</option>
        <option value="User">User</option>
        <option value="Admin">Admin</option>
        
      </select>
    </div>
             </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
  
</form>
</div>
</body>

</html>
