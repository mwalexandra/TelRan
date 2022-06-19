import {useEffect, useState} from 'react';
import SideBar from './components/SideBar';
import TodosContainer from './components/TodosContainer';
import style from './style.module.css';

function UnoTodo() {

  const temp = [
    {
      id: 1,
      title: 'Todo 1',
      note: 'Do something',
      date: 'Monday, May 24th',
      isCompleted: false,
      isImportant: true,
    },
    {
      id: 2,
      title: 'Todo 2',
      note: 'Do something',
      date: 'Today',
      isCompleted: true,
      isImportant: true,
    },
    {
      id: 3,
      title: 'Todo 3',
      note: 'Do something',
      date: 'Friday, May 28th',
      isCompleted: false,
      isImportant: false,
    },
  ]

  const [todos, setTodos] = useState(temp);


  return (
    <>
      <SideBar 
        todos = {todos} 
        setTodos = {setTodos}
      />
      <TodosContainer 
        todos = {todos}  
        setTodos = {setTodos}
      />
    </>
  )
}

export default UnoTodo;
