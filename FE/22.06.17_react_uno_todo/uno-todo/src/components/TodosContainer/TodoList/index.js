import TodoItem from './TodoItem'
import style from './style.module.css'

function TodoList({todos, setTodos}) {
  
  return (
    <ul className={style.todoList}>
      {todos.map(todo => {
        return <TodoItem
                  key={todo.id}
                  todo = {todo}
                />
      })}
    </ul>
  )
}

export default TodoList;