import {useState} from 'react';
import style from './style.module.css'

function AddTodo({todos, setTodos}){

  const [inputValue, setInputValue] = useState('');



  return (  
    <form className={style.addForm}>
      <input
          value={inputValue}
          onChange={(e) => setInputValue(e.target.value)}
          type='text'
          className={style.addInput}
          placeholder='Add a task'
      />
      <button 
        type='submit'
        className={style.addSubmit}
        onClick={(e) => e.preventDefault()}
      ></button>
    </form>)
}

export default AddTodo;