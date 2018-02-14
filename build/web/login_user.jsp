<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User's Area | Account Login</title>
   
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style_log.css" rel="stylesheet">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <script src="jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="Animate.css">
    <script type="text/javascript">
       $(document).ready(function () {
         $('.signIn').click(function () {
            $('.fold').toggleClass('active')
         })
       })
    </script>
  </head>
  <body>
 
    <nav class="navbar navbar-default">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">UserStrap</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">

        </div>
      </div>
    </nav>

    <header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1 class="text-center"> User Area <small>Account Login</small></h1>
          </div>
        </div>
      </div>
    </header>
    <div id="particles-js">

      <div class="container-m">

        <div class="signIn" >Click Here to signIn</div>
        <div class="fold">
            <form action="log" method="get">
            <input type="text" name="Username" placeholder="Uname">
            <input type="password" name="Password" placeholder="password">
            <input type="submit" value="login">
            <a href="#">Create Account</a>
          </form>
          <!--<a href="Parallax.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Admin Login</a>-->  
        </div>
      </div>
       
    </div>

    <footer id="footer-1">
      <p>Copyright AbhiAllian, &copy; 2017</p>
    </footer>

  <script>
     CKEDITOR.replace( 'editor1' );
 </script>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/particles.min.js"></script>

    <script>
    particlesJS.load('particles-js', 'particles.json', function(){
        console.log('particles.json loaded...');
    });
</script>
  </body>
</html>
