import style from './style.module.css'

function TodoPanelDate(){
  return(
    <div className={style.todoPanelDate}>
      <input type='date' /> 
    </div>
  )
}

export default TodoPanelDate;