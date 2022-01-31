const presentURL = 'http://localhost:8080/present';
//const presentURL = 'https://mypresentpet.herokuapp.com/present';

const questionURL = 'http://localhost:8080/question'
//const questionURL = 'https://mypresentpet.herokuapp.com/question'

var question;

class Question{
    constructor(id,question,rating,result){
        this.id=id;
        this.question=question;
        this.rating=rating;
        this.result=result;
    }
}

const arrTopQuestion = []; // Список топовых вопросов
const arrTopResults = [];  // Список ответов на топовые вопросы

function initGame(){
    console.log("Инициализация...");

    arrayFree();

    getTopQuestion();
    console.log(arrTopQuestion);
    var shadow = document.getElementById ('pictureStart');
    shadow.style.display="block";
    var shadow = document.getElementById ('gameFon');
    shadow.style.display="none";
    var shadow = document.getElementById ('gameFinal');
    shadow.style.display="none";
    var shadow = document.getElementById ('returnGame');
    shadow.style.display="none";
}

function startGame(){
    console.log("Начало игры");
    question = arrTopQuestion.pop();
    console.log(question.question);
    document.getElementById('textQuestion').innerHTML = '<b>' + question.question +'</b>';
    var shadow = document.getElementById ('gameFon');
    shadow.style.display="block";
    var shadow = document.getElementById ('pictureStart');
    shadow.style.display="none";
}

function printQuestionOnScreen(i){
    console.log(i);
    console.log('Осталось вопросов ' + arrTopQuestion.length);
    if (arrTopQuestion.length === 0 ){
        endGame();
        question.result=i;
        arrTopResults.push(question);
    } else {
        question.result=i;
        arrTopResults.push(question);
        question = arrTopQuestion.pop();
        console.log(question.question);
        document.getElementById('textQuestion').innerHTML = '<b>' + question.question +'</b>';
    }
}

function endGame(){
    console.log('end game');
    console.log(arrTopResults);
    document.getElementById('textQuestion').innerHTML = '';
    var shadow = document.getElementById ('gameFon');
    shadow.style.display="none";
    var shadow = document.getElementById ('gameFinal');
    shadow.style.display="block";
}

function yes(){
    var shadow = document.getElementById ('gameFinal');
    shadow.style.display="none";
    var shadow = document.getElementById ('returnGame');
    shadow.style.display="block";
}

function arrayFree(){
      while (arrTopQuestion.length) {
        arrTopQuestion.pop();
      }
      while (arrTopResults.length) {
        arrTopResults.pop();
      }
}

document.querySelector('#startGame').addEventListener('click', () => {
    startGame();
});

document.querySelector('#one').addEventListener('click', () => {
    printQuestionOnScreen(1);
});

document.querySelector('#two').addEventListener('click', () => {
    printQuestionOnScreen(2);
});

document.querySelector('#three').addEventListener('click', () => {
    printQuestionOnScreen(3);
});

document.querySelector('#four').addEventListener('click', () => {
    printQuestionOnScreen(4);
});

document.querySelector('#five').addEventListener('click', () => {
    printQuestionOnScreen(5);
});

document.querySelector('#oneFinal').addEventListener('click', () => {
    yes();
});

document.querySelector('#fiveFinal').addEventListener('click', () => {
    getResultByTopQuestion();
});

document.querySelector('#returnYes').addEventListener('click', () => {
    initGame();
});

document.querySelector('#returnNo').addEventListener('click', () => {
    window.close();
});

function getResultByTopQuestion(){
        // URL на который будем отправлять POST запрос
        const requestURL = presentURL + '/getResultByTopQuestion';
        let json = JSON.stringify(arrTopResults);
        var body = json;
        const xhr = new XMLHttpRequest();
        xhr.open('POST', requestURL);
        xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
        xhr.onload = () => {
        if (xhr.status !== 200) {
            return;
        }
            console.log(xhr.response);
        } 
        console.log(body);
        xhr.send(body);
}

function getAllPresent() {
    // URL на который будем отправлять GET запрос
    const requestURL = presentURL + '/getall';
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = () => {
    if (xhr.status !== 200) {
        return;
    }
        console.log(xhr.response);
    }
    xhr.send();
}

function getPresentById() {
    const nums = parseInt(document.querySelector('#getPresentValueId').value);
    const requestURL = presentURL + `/getbyid/${nums}`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = function () {
    if (xhr.status !== 200) {
        return;
    }
        console.log(xhr.response);
    }
    xhr.send();
}

function addPresent() {
    const requestURL = presentURL + `/add`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = () => {
    if (xhr.status !== 200) {
        return;
    }
        console.log(xhr.response);
    }
    xhr.send();
}

function deleteById() {
    const nums = parseInt(document.querySelector('#deletePresentValueId').value);
    const requestURL = presentURL + `/delete/${nums}`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = function () {
    if (xhr.status !== 200) {
        return;
    }
        console.log(xhr.response);
    }
    xhr.send();
}

//document.querySelector('#getAllPresent').addEventListener('click', () => {
//    getAllPresent();
//});
//
//document.querySelector('#getPresentById').addEventListener('click', () => {
//    getPresentById();
//});
//
//document.querySelector('#addPresent').addEventListener('click', () => {
//    addPresent();
//});
//
//document.querySelector('#deletePresentById').addEventListener('click', () => {
//    deleteById();
//});

function getAllQuestion() {
    const requestURL = questionURL + '/getall';
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = () => {
    if (xhr.status !== 200) {
    return;
    }
    console.log(xhr.response);
    }
    xhr.send();
}

function getTopQuestion() {
    const requestURL = questionURL + '/gettop';
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
      xhr.responseType = "json";
    xhr.onload = () => {
        if (xhr.status !== 200) {
        return;
        }
        for (let i = 0; i < xhr.response.length; i++) {
        arrTopQuestion.push(xhr.response[i]);
        }
    }
    xhr.send();
}

function getQuestionById() {
    const nums = parseInt(document.querySelector('#getQuestionValueId').value);
    const requestURL = questionURL + `/getbyid/${nums}`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = function () {
    if (xhr.status !== 200) {
    return;
    }
    console.log(xhr.response);
    }
    xhr.send();
}

function addQuestion() {
    const requestURL = questionURL + `/add`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = () => {
    if (xhr.status !== 200) {
    return;
    }
    console.log(xhr.response);
    }
    xhr.send();
}

function deleteQuestionById() {
    const nums = parseInt(document.querySelector('#deleteQuestionValueId').value);
    // URL на который будем отправлять GET запрос
    const requestURL = questionURL +  `/delete/${nums}`;
    const xhr = new XMLHttpRequest();
    xhr.open('GET', requestURL);
    xhr.onload = function () {
    if (xhr.status !== 200) {
    return;
    }
    console.log(xhr.response);
    }
    xhr.send();
}

//document.querySelector('#getAllQuestion').addEventListener('click', () => {
//getAllQuestion();
//});
//
//document.querySelector('#getTopQuestion').addEventListener('click', () => {
//getTopQuestion();
//});
//
//document.querySelector('#getQuestionById').addEventListener('click', () => {
//getQuestionById();
//});
//
//document.querySelector('#addQuestion').addEventListener('click', () => {
//addQuestion();
//});
//
//document.querySelector('#deleteQuestionById').addEventListener('click', () => {
//deleteQuestionById();
//});

initGame();