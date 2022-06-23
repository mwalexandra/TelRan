import { useState, useRef, useEffect } from 'react'
import style from './style.module.css'

function TodoListHeader ({lists, setLists, selectedList}){

  const [disabled, setDisabled] = useState(true);
  const [title, setTitle] = useState(selectedList.header);

  const headerInput = useRef(null);


  //TODO переписать как на уроке
  function changeTodoListHeader(e){
    e.preventDefault();
    const listsUpdate = [];
    lists.forEach(list => {
      if(list.id === selectedList.id){
        list.header = title;
      }
      listsUpdate.push(list)
    })
    setLists(listsUpdate);
    setDisabled(true);
  }

  useEffect(
    function onFocus(){
      if(!disabled){
        headerInput.current.focus();
      }
    }, [disabled]
  )

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