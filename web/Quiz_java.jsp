<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quiz</title>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="quiz_C.css">
    <!--<link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="Quiz_java.css">
</head>
<body>
    <% response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
            
            if(session.getAttribute("email")==null)
        {
         response.sendRedirect("login_user.jsp");
        }
        %>
<div id="particles-js">
    <div id="QuizContainer" class="Container">
        <div class="title">Java(JDK 1.8_141)</div>
        <div class="question" id="question"></div>
        <label class="option"><input type="radio" name="option" value="1"><span id="opt1"></span></label>
        <label class="option"><input type="radio" name="option" value="2"><span id="opt2"></span></label>
        <label class="option"><input type="radio" name="option" value="3"><span id="opt3"></span></label>
        <label class="option"><input type="radio" name="option" value="4"><span id="opt4"></span></label>
        <button id="nextButton" class="next-btn" onclick="loadNextQuestion();">Next Question</button>

    </div>
    <div id="result" class="container result"  style="display: none">

    </div>
</div>
<script src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script>

<script>
    particlesJS.load('particles-js', 'particles_C.json', function(){
        console.log('particles_C.json loaded...');
    });
</script>
<script src="questions_java.js"></script>
<script src="quiz-script_java.js"></script>


</body>
</html>
