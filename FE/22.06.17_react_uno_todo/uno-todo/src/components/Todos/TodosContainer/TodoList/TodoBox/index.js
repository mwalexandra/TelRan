import {useEffect, useState} from 'react';
import style from './style.module.css';

import { useCheckboxInput } from '../../../../../helpers';

import TodoImportant from './TodoImportant';
import TodoCompleted from './TodoCompleted';
import TodoDescr from './TodoDescr';

function TodoBox({
  todo, 
  lists, 
  setLists, 
  selectedList, 
  showPanelTodo, 
  setShowPanelTodo,
  setSelectedTodo,
  selectedTodo,
}) {
  const id = todo.id;

  const [isImportant, setIsImportant] = useState(todo.important);
  const [isCompleted, setIsCompleted, bindCompleted] = useCheckboxInput(todo.completed);

  useEffect(
    function updateTodo(){
      setLists(lists, selectedList, id,
        {
          changeTodoCompleted: isCompleted,
          changeTodoImportant: isImportant, 
        },
      )
    }, [isImportant, isCompleted]
  )

  function editTodo(todo) {
    setSelectedTodo(todo.id);

    if (selectedTodo === todo.id) {
      setShowPanelTodo(!showPanelTodo);
    } else {
      setShowPanelTodo(true);
    }
  }

  return (
    <li className={style.todoItem}
        onClick={(e) => editTodo(todo)}>
      <TodoCompleted
        isCompleted={isCompleted}
        setIsCompleted={setIsCompleted}
        bindCompleted={bindCompleted}
      />
      <TodoDescr 
        todo={todo}
      />
      <TodoImportant 
        isImportant={isImportant}
        setIsImportant={setIsImportant}
      />
    </li>
  )
}

export default TodoBox;