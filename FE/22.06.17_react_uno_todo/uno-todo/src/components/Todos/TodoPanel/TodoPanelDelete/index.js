import style from './index.module.css'
import {useShowDate} from '../../../../helpers'

import {showPanelTodo} from '../../../../storage/interface/actionsCreator.js'
import { useDispatch } from 'react-redux';

function TodoPanelDelete({
  createTodoDate,
  // setShowPanelTodo, 
  selectedList,
  lists,
  selectedTodo,
  setLists,
}){

  const dispatch = useDispatch();


  function deleteTodo(){
    setLists(
      lists,
      selectedList,
      selectedTodo,
      {
        deleteTodo: true,
      }
    )
    dispatch(showPanelTodo(false));
  }

  //console.log(createTodoDate);

  return (
    <div className={style.todoPanelDeleteWrapper}>
      <span 
        className={style.todoPanelArrow}
        onClick={() => dispatch(showPanelTodo(false))}
      ></span>
      <p>Created {useShowDate(createTodoDate)}</p>
      <span 
        className={style.todoPanelDelete}
        onClick={() => {deleteTodo()}}
        ></span>
    </div>
  )
}

export default TodoPanelDelete;