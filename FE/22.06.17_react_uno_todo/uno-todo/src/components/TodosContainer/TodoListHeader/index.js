import { useState } from 'react'
import style from './style.module.css'

function TodoListHeader (){

  const [disabled, setDisabled] = useState(true);
  const [title, setTitle] = useState('Task List')

  function changeTodoListHeader(e){
    e.preventDefault();
    setDisabled(true);
  }

  return (
    <div className={style.headingWrapper}>
      <form 
        onSubmit={(e) => changeTodoListHeader(e)}
      >
        <input 
            type='text'
            className={style.todosHeading}
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            disabled={disabled}
        />
      </form>
      <div className={style.headingBtnWrapper}>
      <button
          className={`${style.headingBtn} ${style.headingEdit}`}
          onClick={() => setDisabled(false)}
        ></button>
        <button
          className={`${style.headingBtn} ${style.headingDelete}`}
        ></button>
      </div>
    </div>
  )  
}

export default TodoListHeader;