import { useState, useRef, useEffect } from 'react'

import { useTextInput } from '../../../../helpers';

import style from './style.module.css'

function TodoListHeader ({lists, setLists, selectedList}){

  const [disabled, setDisabled] = useState(true);
  const [title, setTitle, bindTitle] = useTextInput(lists[selectedList].header);

  const headerInput = useRef(null);

  useEffect(
    function onFocus() {
      if(!disabled) {
        headerInput.current.focus();
      }
    }, [disabled]
  )

  function changeTodoListHeader(e){
    e.preventDefault();

    setLists(lists, selectedList, undefined, {
      changelistHeader: title,
    })

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
            {...bindTitle}
            disabled={disabled}
            ref={headerInput}
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