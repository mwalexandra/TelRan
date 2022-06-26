import {useEffect, useState} from 'react';
import style from './style.module.css';

import { useLists } from '../../../../helpers';

import TodoImportant from './TodoImportant';
import TodoCompleted from './TodoCompleted';
import TodoDescr from './TodoDescr';

function TodoBox({todo, lists, setLists, selectedList, showPanelTodo, setShowPanelTodo}) {
  const id = todo.id;

  const [isImportant, setIsImportant] = useState(todo.important);
  const [isCompleted, setIsCompleted] = useState(todo.completed);

  const [listsUpdate, setListsUpdate] = useLists([]);

  useEffect(
    function updateTodo(){
      setListsUpdate(lists, selectedList, id,
        {
          changeTodoCompleted: isCompleted,
          changeTodoImportant: isImportant, 
        },
      )
      setLists(listsUpdate);
    }, [isImportant, isCompleted]
  )


  return (
    <li className={style.todoItem}
        onClick={(e) => setShowPanelTodo(!showPanelTodo)}>
      <TodoCompleted
        isCompleted={isCompleted}
        setIsCompleted={setIsCompleted}
      />
      <TodoDescr 
        todo={todo}
        showPanelTodo={showPanelTodo} 
        setShowPanelTodo={setShowPanelTodo}
      />
      <TodoImportant 
        isImportant={isImportant}
        setIsImportant={setIsImportant}
      />
    </li>
  )
}

export default TodoBox;