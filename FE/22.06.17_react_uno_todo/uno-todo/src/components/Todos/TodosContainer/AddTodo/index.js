import {useState} from 'react';
import style from './style.module.css'

function AddTodo({todos, setTodos, setShowPanelTodo}){

  function showPanel(e){
    e.preventDefault();
    setShowPanelTodo(true);
  }

  return (  
    <button 
      type='submit'
      className={style.addButton}
      onClick={showPanel}
    >Add a task</button>
  )  
}

export default AddTodo;