const form = document.querySelector('.todo-form');
const input = document.querySelector('#todo-input');
const todoList = document.querySelector('#todos');

let todoItems = [
  {
    id: 1,
    title: 'Learn CSS',
    isDone: false,
  },
  {
    id: 2,
    title: 'Learn HTML',
    isDone: false,
  },
  {
    id: 3,
    title: 'Learn DOM',
    isDone: true,
  },
]
const doneBtns = document.querySelectorAll('.done-btn');

const addNewTodoHandler = (e) => {
  e.preventDefault();
  const newItem = {
    id: Date.now(),
    title: input.value,
    isDone: false,
  };
  todoItems.push(newItem);
  renderItems();
  input.value = '';
}

const newLiCreate = (todoObject) => {
  const li = document.createElement('li');

  const text = document.createElement('p');
  text.classList.add('todo-title');
  text.textContent = todoObject.title;

  const btnsWrapper = document.createElement('div');
  btnsWrapper.classList.add('todo-item-btn-wrapper');

  const doneBtn = document.createElement('button');
  doneBtn.classList.add('todo-item-btn', 'done-btn');

  const deleteBtn = document.createElement('button');
  deleteBtn.classList.add('todo-item-btn', 'delete-btn');

  btnsWrapper.appendChild(doneBtn);
  btnsWrapper.appendChild(deleteBtn);

  li.appendChild(text);
  li.appendChild(btnsWrapper);

  if(todoObject.isDone) {
    li.classList.add('done-item');
  }

  doneBtn.addEventListener('click', () => {
    changeIsDone(todoObject.id)
  });

  deleteBtn.addEventListener('click', (event) => {
    event.preventDefault();
    removeItem(todoObject.id);
  })

  todoList.appendChild(li);
}

const changeIsDone = (id) => {
  const obj = todoItems.find((item) => {
    return item.id === id;
  });
  obj.isDone = !obj.isDone;
  renderItems();
};

const removeItem = (id) => {
  todoItems = todoItems.filter(item => item.id !== id);
  renderItems();
}

const renderItems = () => {
  todoList.innerHTML = '';
  todoItems.forEach(item => {
    newLiCreate(item);
  })
};

form.addEventListener('submit', addNewTodoHandler);
renderItems();