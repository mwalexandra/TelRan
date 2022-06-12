import {useState} from 'react';
import TodoInput from './components/TodoInput'
import TodoList from './components/TodoList'
import style from './style.module.css';


function Todos(){

  const [value, setValue] = useState('');


  const todosList = [
    {
      id: 1,
      value: 'test1',
      isDone: false,
    },
    {
      id: 2,
      value: 'test2',
      isDone: false,
    },
  ]

  // function addTodo(event){
  //   event.preventDefault();
  //   let key = event.key;
  //   //console.log(key);
  //   if(key === 13) {
  //     const todo = {
  //       id: Date.now(),
  //       value: value,
  //       isDone:false,
  //     }
  //     todosList.push(todo);
  //   }
  // }

  return (
    <div className={style.todos}>
      <h1 className={style.todosHeading}>todos</h1>
      <TodoInput 
        value = {value}
        setValue={setValue}
      />
      <TodoList 
        todosList = {todosList}
      />
    </div>
  )
}

export default Todos;