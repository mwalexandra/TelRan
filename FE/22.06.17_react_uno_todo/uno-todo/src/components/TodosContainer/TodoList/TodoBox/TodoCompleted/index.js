import style from './style.module.css'

function TodoCompleted({isCompleted, setIsCompleted}) {

  return(
    <input 
        type='checkbox'
        onChange= {() => setIsCompleted(!isCompleted)}
        checked={isCompleted}
        value={isCompleted}
      />
  )
}

export default TodoCompleted;