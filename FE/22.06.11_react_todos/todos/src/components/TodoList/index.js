import style from './style.module.css'

function ListItem(props){

  const item = props.item;

  return (
    <li>
      <p> {item.value} </p>
    </li>
  )
}

function TodoList(props){

  const todosList = props.todosList;

  return (
    <ul className={style.todoList}>
    {
      todosList.map((item) => {
        return <ListItem 
                  item = {item}
                  key = {item.id}
                />
      })
    }
    </ul>
  )
}

export default TodoList;