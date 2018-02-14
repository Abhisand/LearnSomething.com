<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Panda Login</title>
  
      <link rel="stylesheet" href="css/step2.css">

</head>
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
<body>
  <div class="panda">
  <div class="ear"></div>
  <div class="face">
    <div class="eye-shade"></div>
    <div class="eye-white">
      <div class="eye-ball"></div>
    </div>
    <div class="eye-shade rgt"></div>
    <div class="eye-white rgt">
      <div class="eye-ball"></div>
    </div>
    <div class="nose"></div>
    <div class="mouth"></div>
  </div>
  <div class="body"> </div>
  <div class="foot">
    <div class="finger"></div>
  </div>
  <div class="foot rgt">
    <div class="finger"></div>
  </div>
</div>
    <form name="frm" action="helper" method="get">
  <div class="hand"></div>
  <div class="hand rgt"></div>
  <h1>Panda's Welcome!</h1>
  <h1><%=session.getAttribute("email")%></h1>
 <div class="form-group">
     <input type="password" name="password" required="required" class="form-control"/>
    <label class="form-label">Password    </label>
  </div>
  <div class="form-group">
    <input id="password" name="confirmpassword" type="password" required="required" class="form-control"/>
    <label class="form-label">Re-Enter Password</label>
    <p class="alert">Invalid Credentials..!!</p>
    <button type="submit" class="btn">Login </button>
  </div>
</form>
  <script src='js/jquery.min.js'></script>

    <script  src="js/index.js"></script>

</body>
</html>
