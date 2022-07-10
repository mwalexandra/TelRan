
import style from './index.module.css';

import TodoImportant from './TodoImportant';
import TodoCompleted from './TodoCompleted';
import TodoDesc from './TodoDesc';
import { useDispatch, useSelector } from 'react-redux';
import {todoSelected} from '../../../../../storage/content/actionsCreator.js'
import {showPanelTodo} from '../../../../../storage/interface/actionsCreator.js'

function TodoBox({

  todo, // всё, что должно остаться в TodoBox
  // lists, // уже не нужно
  // setLists,  // уже не нужно
  // selectedList,  // уже не нужно
  // setShowPanelTodo,  // нужно убрать (в интерфейс)
  // showPanelTodo, // нужно убрать (в интерфейс)

  //setSelectedTodo, // нужно убрать (контент - dispatch todoSelected(listId, todoId))
  //selectedTodo, // нужно убрать (контент - todo:{...todo, selected: true})

  // selectedListId, // уже не нужно

}) {
  const dispatch = useDispatch();

  const selectedListId = useSelector(
    state => state.lists.content.find(list => list.selected).id
  )

  const selectedTodoId = useSelector(
    state => 
      state.lists.content
        .find( list =>  list.id === selectedListId)
        .todos.find( todoItem => todoItem.selected).id
  )

const isShownPanelTodo = useSelector(state => state.interface.show);

  function editTodo(todo) {
    dispatch(todoSelected(selectedListId, todo.id))
    console.log(isShownPanelTodo);

    if (selectedTodoId === todo.id) {
      dispatch(showPanelTodo(!isShownPanelTodo));
      console.log(isShownPanelTodo);
    } else {
      dispatch(showPanelTodo(true));
    }
  }

  return (
    <li className={style.todoItem} onClick={() => editTodo(todo)}>
      <TodoCompleted
        todoId={todo.id}
      />
      <TodoDesc 
        todoId={todo.id} 
      />
      <TodoImportant 
        todoId={todo.id}
      />
    </li>
  )
}

export default TodoBox;