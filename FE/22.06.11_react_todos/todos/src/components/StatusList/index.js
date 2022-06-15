import style from './style.module.css'

function StatusList (props){

  const itemsLeft = props.itemsLeft;
  const todosList = props.todosList;
  const setTodosList = props.setTodosList;

  function deleteCompleted(){
    const newTodosList = todosList.filter(todo => !todo.completed)
    setTodosList(newTodosList);
  }

  return (
    <div className={`${style.statusListWrapper} ${todosList.length > 0 ? style.statusListActive : ''}`}>

      <p className={style.itemsLeftText}>
        {itemsLeft}
        {itemsLeft > 1 ? ' items' : ' item'} left
      </p>

      <button 
        className={style.deleteCompletedBtn}
        onClick={() => deleteCompleted()}
      >Clear completed</button>

    </div>
  )
}

export default StatusList;