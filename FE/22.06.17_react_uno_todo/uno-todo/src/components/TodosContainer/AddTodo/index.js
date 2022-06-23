import style from './style.module.css'

function AddTodo({showPanelTodo, setShowPanelTodo}){

  function togglePanelTodo(e){
    e.preventDefault();
    setShowPanelTodo(!showPanelTodo);
  }

  return (  
    <button 
      type='submit'
      className={style.addButton}
      onClick={(e) => togglePanelTodo(e)}
    >Add a task</button>
  )  
}

export default AddTodo;