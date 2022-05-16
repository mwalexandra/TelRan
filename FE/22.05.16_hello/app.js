const guestBtn = document.querySelector('.hello__btn-guest');
const adminBtn = document.querySelector('.hello__btn-admin');
const userBtn = document.querySelector('.hello__btn-user');
const emptyBtn = document.querySelector('.hello__btn-empty')

const output = document.querySelector('.hello__output');

function salute(greeting) {
  return function(name) {
    try {
      if(name === ''){
        throw new SyntaxError('Select the btn with the text so I can greet you');
      }
      return `${greeting}, ${name}!`;
    }
    catch (error) {
      if(error.name == 'SyntaxError') {
        alert('Select the btn with the text so I can greet you')
      }
      else {
        throw error;
      }
    }
  }
}   

const hello = salute('Hello');

function outputGreeting(greeting) {
  output.textContent = '';
  output.textContent = greeting;
}

guestBtn.addEventListener('click', () => {
  outputGreeting(hello(guestBtn.textContent));
});

adminBtn.addEventListener('click', () => {
  outputGreeting(hello(adminBtn.textContent));
});

userBtn.addEventListener('click', () => {
  outputGreeting(hello(userBtn.textContent));
});

emptyBtn.addEventListener('click', () => {
  outputGreeting(hello(emptyBtn.textContent));
});

