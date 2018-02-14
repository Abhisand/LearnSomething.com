<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quiz</title>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="quiz_C.css">
    <!--<link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="Quiz_Cpp.css">
</head>
<body>
  
<div id="particles-js">
    <div id="QuizContainer" class="Container">
        <div class="title">C++ </div>
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
<script src="js/particles.min.js"></script>

<script>
    particlesJS.load('particles-js', 'particles_C.json', function(){
        console.log('particles_C.json loaded...');
    });
</script>
<script src="questions_Cpp.js"></script>
<script src="quiz-script_Cpp.js"></script>


</body>
</html>
