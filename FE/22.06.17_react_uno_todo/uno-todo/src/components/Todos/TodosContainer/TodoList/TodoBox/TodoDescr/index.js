import style from './style.module.css';

function TodoDescr ({todo}){

  return (
    <div 
      className={style.todoDescr}  
    >
        <h2>{todo.title}</h2>
        <p>{todo.note} - {todo.date}</p>
      </div>
  )
}

export default TodoDescr;