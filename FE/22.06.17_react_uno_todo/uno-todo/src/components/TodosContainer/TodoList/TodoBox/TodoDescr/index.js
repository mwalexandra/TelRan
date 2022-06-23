import style from './style.module.css';

function TodoDescr ({todo, setShowPanelTodo}){

  return (
    <div 
      className={style.todoDescr}
      onClick={() => setShowPanelTodo(true)}  
    >
        <h2>{todo.title}</h2>
        <p>{todo.note} - {todo.date}</p>
      </div>
  )
}

export default TodoDescr;