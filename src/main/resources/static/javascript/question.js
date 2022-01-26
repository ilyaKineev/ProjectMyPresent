  //const questionURL = 'http://localhost:8080/question'
  const URL = 'https://mypresentpet.herokuapp.com'

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
    // URL на который будем отправлять GET запрос
    const requestURL = questionURL + '/gettop';
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

  function getQuestionById() {
      const nums = parseInt(document.querySelector('#getQuestionValueId').value);
      // URL на который будем отправлять GET запрос
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
          // URL на который будем отправлять GET запрос
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

  document.querySelector('#getAllQuestion').addEventListener('click', () => {
    getAllQuestion();
  });

  document.querySelector('#getTopQuestion').addEventListener('click', () => {
    getTopQuestion();
  });

  document.querySelector('#getQuestionById').addEventListener('click', () => {
    getQuestionById();
  });

   document.querySelector('#addQuestion').addEventListener('click', () => {
    addQuestion();
  });

  document.querySelector('#deleteQuestionById').addEventListener('click', () => {
    deleteQuestionById();
  });