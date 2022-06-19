import {useState} from 'react';
import style from './style.module.css';
import TodoImportant from './TodoImportant';

function TodoItem({todo}) {

  const [isImportant, setIsImportant] = useState(todo.isImportant);

  return (
    <li className={style.todoItem}>
      <input 
        type='checkbox'
        className={style.complete}
      />
      <div className={style.todoDescr}>
        <h2>{todo.title}</h2>
        <p>{todo.note} - {todo.date}</p>
      </div>
      <TodoImportant 
        isImportant={isImportant}
        setIsImportant={setIsImportant}
      />
    </li>
  )
}

export default TodoItem;