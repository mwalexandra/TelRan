import {useEffect} from 'react';
import SideBar from './components/SideBar';
import TodosContainer from './components/TodosContainer';
import style from './style.module.css';

function UnoTodo() {

  const[todos, setTodos] = useEffect([]);

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
