import { useEffect } from 'react';
import style from './style.module.css'

function TodoInput (props){

  const value = props.value;
  const setValue = props.setValue;

  return(
    <div className={style.inputWrapper}>
      <input
        type='text'
        className={style.input}
        placeholder="What needs to be done?"

        value={value}
        onChange={(event) => setValue(event.target.value)}
        />
    </div>    
  )
}

export default TodoInput;