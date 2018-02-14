var currentQuestion=0;
var score=0;
var toQuestions=questions_java.length;
function Random() {
    var random=Math.floor((Math.random()*10));
    return  random;
};
var random=Math.floor((Math.random()*10));


var container=document.getElementById('QuizContainer');
var questionEl=document.getElementById('question');
var opt1=document.getElementById('opt1');
var opt2=document.getElementById('opt2');
var opt3=document.getElementById('opt3');
var opt4=document.getElementById('opt4');
var nextButton=document.getElementById('nextButton');
var resultCont=document.getElementById('result');

function loadQuestion(QuestionIndex) {
    var q=questions_java[QuestionIndex];
    questionEl.textContent=(QuestionIndex + 1)+'.'+q.question;

    opt1.textContent=q.option1;
    opt2.textContent=q.option2;
    opt3.textContent=q.option3;
    opt4.textContent=q.option4;
};
function  loadNextQuestion() {
    var selectedOption=document.querySelector('input[type=radio]:checked');
    if(!selectedOption) {
        alert('Please Select Your Answer!');
        return;
    }
    var answer=selectedOption.value;
    if(questions_java[random].answer==answer){
        score+=10;
    }
    selectedOption.checkbox=false;
    currentQuestion++;
    random=Random();
    if(currentQuestion==toQuestions-1)
    {
        nextButton.textContent='Finish';
    }
    if(currentQuestion==toQuestions)
    {
        container.style.display='none';
        resultCont.style.display='';
        resultCont.textContent='Your Score '+score;
        return;
    }
    loadQuestion(random);

}
loadQuestion(random);

