import TodoBox from './TodoBox'
import style from './style.module.css'

function TodoList({todos, setTodos, activeTab}) {

  const completedTodos = todos.filter(item => item.isCompleted);
  let renderTodos = [];

  if(activeTab === 'Completed'){
    renderTodos = completedTodos;
  } else {
    renderTodos = todos;
  }
  
  
  return (
    <ul className={style.todoList}>
      {renderTodos.map(todo => {
        return <TodoBox
                  key={todo.id}
                  todo = {todo}
                />
      })}
    </ul>
  )
}

export default TodoList;