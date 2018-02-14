<%-- 
    Document   : Backgriond_video
    Created on : Nov 1, 2017, 7:29:29 PM
    Author     : Abhishek
--%>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="background_style.css">
        
    </head>
    <body>
        <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        %>
       <header class="v-header container">
    <div class="fullscreen-video-wrap">
     
      <video src="video/code.mov" autoplay="" loop="">
    </video>
    </div>
    <div class="header-overlay"></div>
    <div class="header-content text-md-center">
      <h1>Kotlin Coming Soon</h1>
      <p class="show-more">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ipsa maiores dolore earum ducimus molestiae, aut. <span>Quisquam consequuntur, maiores et, doloremque atque provident similique consequatur totam voluptas vitae veniam, molestiae laborum.</span></p>
<button class="button read-more">Read More</button>
        <script>
            var button = document.querySelector('.read-more');

button.addEventListener('click', function(event) {
  var span = event.target.previousElementSibling.querySelector('span');
  span.classList.add('fade-in');
});
        </script>
       
  </header>

    </body>
</html>
