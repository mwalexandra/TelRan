import style from './style.module.css'

function ListItem(props){

  const todo = props.todo;
  const completeToggle = props.completedToggle;
  const deleteTodo = props.deleteTodo;

  return (
    <li className={`${style.todoItem} ${todo.completed ? style.checked : ''}`}>
      <span 
        onClick={() => completeToggle(todo.id)} 
        className={style.completed}
      ></span>
      <p className={style.title}> {todo.title} </p>
      <span
        onClick={() => deleteTodo(todo.id)}
        className={style.deleteTodo}
      ></span>
    </li>
  )
}

function TodoList(props){

  const todosList = props.todosList;
  const setTodosList = props.setTodosList;
  const itemsLeft = props.itemsLeft;
  const setItemsLeft = props.setItemsLeft;

  function completeToggle(id){
    todosList.forEach(todo => {
      if(todo.id === id){
        todo.completed = !todo.completed;
        todo.completed ? setItemsLeft(itemsLeft - 1) : setItemsLeft(itemsLeft + 1);
      }
    });
    setTodosList([...todosList]);
  }

  function deleteTodo(id){
    const newTodoList = todosList.filter(todo => todo.id !== id);
    setItemsLeft(itemsLeft - 1);
    setTodosList(newTodoList);
  }

  return (
    <ul className={style.todoList}>
    {
      todosList.map((todo) => {
        return <ListItem 
                  todo = {todo}
                  key = {todo.id}
                  todosList = {todosList}
                  setTodosList = {setTodosList}
                  completedToggle={completeToggle}
                  deleteTodo={deleteTodo}
                />
      })
    }
    </ul>
  )
}

export default TodoList;