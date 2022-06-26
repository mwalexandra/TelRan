import style from './style.module.css'
import TodoPanelDate from './TodoPanelDate'
import TodoPanelDelete from './TodoPanelDelete'
import TodoPanelHeader from './TodoPanelHeader'
import TodoPanelNote from './TodoPanelNote'

function TodoPanel({showPanelTodo, setShowPanelTodo}){


  return (
    <section className={`${style.todoPanel} ${showPanelTodo ? style.isShown : ''}`}>
      <TodoPanelHeader />
      <TodoPanelDate />
      <TodoPanelNote />
      <TodoPanelDelete />
    </section>  
  )
}

export default TodoPanel;