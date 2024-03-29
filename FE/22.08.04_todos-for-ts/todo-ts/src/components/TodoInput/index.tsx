import style from './style.module.css'
// React.VFC<FCTodoinput>
interface FCTodoInput {
  value: string,
  setValue: React.Dispatch<React.SetStateAction<string>>,
  addTodo: (e: React.KeyboardEvent) => void,
  toggleAll: boolean,
  setToggleAll: React.Dispatch<React.SetStateAction<boolean>>,
}

function TodoInput (props: FCTodoInput){

  const value = props.value;
  const setValue = props.setValue;
  const addTodo = props.addTodo;
  const toggleAll = props.toggleAll;
  const setToggleAll = props.setToggleAll;

  return(
    <div className={style.inputWrapper}>
    <span 
        className={`${style.toggleAll} ${toggleAll ? style.checked : ''}`}
        onClick={() => setToggleAll(!toggleAll)}
      >
        ❯
      </span>
      
      <input
        type='text'
        className={style.input}
        placeholder="What needs to be done?"

        value={value}
        onChange={(event) => setValue(event.target.value)}
        onKeyPress={addTodo}
        />
    </div>    
  )
}

export default TodoInput;