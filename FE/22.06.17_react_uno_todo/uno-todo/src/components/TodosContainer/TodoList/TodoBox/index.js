import {useEffect, useState} from 'react';
import style from './style.module.css';
import TodoImportant from './TodoImportant';
import TodoCompleted from './TodoCompleted';
import TodoDescr from './TodoDescr';

function TodoBox({todo, lists, setLists, selectedList, showPanelTodo, setShowPanelTodo}) {
  const id = todo.id;

  const [isImportant, setIsImportant] = useState(todo.important);
  const [isCompleted, setIsCompleted] = useState(todo.completed);

  useEffect(
    function updateTodo(){
      const listUpdate = [];
      lists.forEach(list => {
        if(list.id === selectedList.id){
          list.todos.forEach(todo => {
            if(todo.id === id){
              todo.completed = isCompleted;
              todo.important = isImportant;
            }
          })
        }
        listUpdate.push(list);
      })
      setLists(listUpdate);
    }, [isImportant, isCompleted]
  )


  return (
    <li className={style.todoItem}>
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