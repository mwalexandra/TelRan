import style from './style.module.css'
import { Todo, TodosList } from '../../Todos'
import React from 'react';

interface FCStatusList {
  todosList: TodosList,
  itemsLeft: number,
  setTodosList: React.Dispatch<React.SetStateAction<TodosList>>,
  activeTab: string,
  setActiveTab: React.Dispatch<React.SetStateAction<string>>,
}

function StatusList<T extends FCStatusList>(props: T ) {

  const itemsLeft = props.itemsLeft;
  const todosList = props.todosList;
  const setTodosList = props.setTodosList;
  const setActiveTab = props.setActiveTab;

  function deleteCompleted(){
    const newTodosList = todosList.filter((todo: Todo) => !todo.completed)
    setTodosList(newTodosList);
  }

  return (
    <div className={style.statusListWrapper}>

      <p className={style.itemsLeftText}>
        {itemsLeft}
        {itemsLeft > 1 ? ' items' : ' item'} left
      </p>

      <ul className={style.toggleTabs}>
        <li
          onClick={() => setActiveTab('All')}
        >All</li>
        <li
          onClick={() => setActiveTab('Active')}
        >Active</li>
        <li
          onClick={() => setActiveTab('Completed')}
        >Completed</li>
      </ul>

      <button 
        className={style.deleteCompletedBtn}
        onClick={() => deleteCompleted()}
      >Clear completed</button>

    </div>
  )
}

export default StatusList;