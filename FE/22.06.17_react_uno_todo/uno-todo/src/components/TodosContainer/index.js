import style from './style.module.css'
import TodoList from './TodoList'

function TodosContainer({todos, setTodos}) {

  return (
    <main className={style.todosContainer}>
      <h1>Task List</h1>
      <button>To Do</button>
      <button>Completed</button>
      <TodoList 
        todos = {todos}  
        setTodos = {setTodos}
      />  
    </main>
  )
}

export default TodosContainer;