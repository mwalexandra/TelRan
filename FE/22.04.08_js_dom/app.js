const container = document.querySelector('.container');
// console.log(container);
const list = document.querySelectorAll('li');
const header = document.querySelector('h1');
const root = document.querySelector('#root');

const person = {
  name: 'Ivan',
  surname: 'Ivanov',
  email: 'ivan@getMaxListeners.com',
  role: 'Developer',
}

const persons = [
  {
    name: 'Petr',
    surname: 'Petrov',
    email: 'petr@getMaxListeners.com',
    role: 'Java Developer',
  },
  {
    name: 'Dima',
    surname: 'Makeew',
    email: 'dima@getMaxListeners.com',
    role: 'Son of Developer',
  },
  {
    name: 'Vitalik',
    surname: 'Zverev',
    email: 'vitalik@getMaxListeners.com',
    role: 'QA Master',
  },
]

const getTemplate = (object) => {
  return `
  <div class="card">
  <h2>${object.name} ${object.surname}</h2>
  <p>email: ${object.email}</p>
  <p>${object.role}</p>
  </div>
  `;
}

const addPersonCard = (subj) => {
  root.innerHTML += getTemplate(subj);
}

const addPersonsList = (personsArray) => {
  for (const element of personsArray) {
    addPersonCard(element);
  }
}

// container.style.borderColor = '#00ff00';

// container.classList.add('shadow');
// container.classList.remove('shadow');
// container.classList.toggle('shadow');

const setActiveItem = (index) => {
  if(index >= 0 && index < list.length) {
    list[index].classList.add('active');
  }
}

const reportList = () => {
  for (let i = 0; i < list.length; i++) {
    console.log(list[i]);
  }
}

const sayHello = (name) => {
  header.textContent = `Hello, ${name}`;
  // header.textContent = 'Hello ' + name;
}

const main = () => {
  setActiveItem(3);
  reportList();
  container.classList.toggle('shadow');
  sayHello('Иван');
  addPersonCard(person);
  addPersonCard({name: 'Sasha', surname: 'Makeewa', email: 'sasha@mail.ru', role: 'Frontend Developer' });
  addPersonsList(persons);
}

main();