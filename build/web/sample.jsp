<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Random"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Quiz</title>
    <meta charset="UTF-8">

    <link rel="stylesheet" href="quiz_C.css">
    <link href="https://fonts.googleapis.com/css?family=Indie+Flower" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="quiz_C.css">
</head>
<body>
    <%
        Class.forName("com.mysql.jdbc.Driver");
            Random R=new Random();
            int r=R.nextInt(10);//                                                                 
            String quiery="select question ,option1,option2,option3,option4 from Questions_C";
            String url="jdbc:mysql://localhost:3306/info";
            String name="root";
            String passwd="Abhisand1234";
            
            Connection con=DriverManager.getConnection(url,name,passwd);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(quiery);
            rs.next();
    %>
    <form action="Abhi" method="post">
    <div id="particles-js">
    <div id="QuizContainer" class="Container">
    <div class="title">C Language</div>
    <div class="question" id="question"><%=rs.getString("question")%></div>
    <label class="option"><input type="radio" name="option" value="1"><span id="opt1"><%=rs.getString("option1")%></span></label>
    <label class="option"><input type="radio" name="option" value="2"><span id="opt2"><%=rs.getString("option2")%></span></label>
    <label class="option"><input type="radio" name="option" value="3"><span id="opt3"><%=rs.getString("option3")%></span></label>
    <label class="option"><input type="radio" name="option" value="4"><span id="opt4"><%=rs.getString("option4")%></span></label>
    <button id="nextButton" class="next-btn" onclick="loadNextQuestion();">Next Question</button>
    
</div>
<div id="result" class="container result"  style="display: none">

</div>
</div>
        </form>
<script src="https://cdn.jsdelivr.net/particles.js/2.0.0/particles.min.js"></script>

<script>
    particlesJS.load('particles-js', 'particles_C.json', function(){
        console.log('particles_C.json loaded...');
    });
</script>
<!--<script src="questions_C.js"></script>
<script src="quiz-script_C.js"></script>-->



</body>
</html>
