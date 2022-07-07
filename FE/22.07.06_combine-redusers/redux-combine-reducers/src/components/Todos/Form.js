import Btn from '../../ui/Btn'
import { addTodo } from '../../store/todos/actionsCreator'
import { useDispatch } from 'react-redux'
import {useState} from 'react'

function Form(){
  const dispatch = useDispatch();
  const [title, setTitle] = useState();

  function addHandler(e){
    e.preventDefault();
    dispatch(addTodo(title));
    setTitle('');
  }

  return (
    <form className={`my-5 d-flex align-items-start`}>
      <input type='text'
        value={title}
        onChange={(e) => setTitle(e.target.value)}
        className={`me-5 p-1 w-50`}
      />
      <Btn 
        type='submit' label='Submit'
        clickHandler={addHandler}
        className={`btn btn-primary w-25`}
        />
    </form>
  )
}

export default Form;