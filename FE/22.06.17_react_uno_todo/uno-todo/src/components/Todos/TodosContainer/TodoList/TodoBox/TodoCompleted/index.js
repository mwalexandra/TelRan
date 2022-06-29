import style from './style.module.css'

function TodoCompleted({isCompleted, setIsCompleted, bindCompleted}) {

  return(
    <input 
        type='checkbox'
        onClick={(e) => e.stopPropagation()}
        {...bindCompleted}
      />
  )
}

export default TodoCompleted;