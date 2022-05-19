const form = document.querySelector('.async__form');
const input = document.querySelector('.async__form_input');
const btn = document.querySelector('.async__form_submit-btn');
const output = document.querySelector('.async__output');

async function calculate (value){
  btn.disabled = true;
  input.disabled = true;
  let promise = new Promise((resolve, reject) => {
    setTimeout(() => { 
      if(value.length !== 0) {
        resolve(value.length);
      } else {
        reject(new Error("Вы не ввели никаких значений"));
      }   
    }, 3000)
  });
  return await promise;
}

input.addEventListener('focus', () => {
  input.value = '';
})

input.addEventListener('input', () => {
  btn.disabled = false;
})

form.addEventListener('submit', event => {
  event.preventDefault();
  calculate(input.value).then(
    res => output.innerHTML = `<p>${res}</p>`,
    error => console.log(`${error.message}`)
    );
  input.disabled = false;
});

// 2 задача
async function wait() {
  await new Promise(resolve => setTimeout(resolve, 1000));
  return 10;
}
  
function f() {
  wait().then(result => console.log(result));
}

f();