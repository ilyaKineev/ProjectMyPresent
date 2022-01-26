    //const presentURL = 'http://localhost:8080/present'
    const URL = 'https://mypresentpet.herokuapp.com/present'


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
      // URL на который будем отправлять GET запрос
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
          // URL на который будем отправлять GET запрос
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
                // URL на который будем отправлять GET запрос
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

  document.querySelector('#getAllPresent').addEventListener('click', () => {
    getAllPresent();
  });

  document.querySelector('#getPresentById').addEventListener('click', () => {
    getPresentById();
  });

   document.querySelector('#addPresent').addEventListener('click', () => {
    addPresent();
  });

  document.querySelector('#deletePresentById').addEventListener('click', () => {
    deleteById();
  });