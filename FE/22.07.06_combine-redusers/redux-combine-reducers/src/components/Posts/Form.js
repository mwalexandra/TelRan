import Btn from '../../ui/Btn'
import { addPost } from '../../store/posts/actionsCreator'
import { useDispatch } from 'react-redux'
import {useState} from 'react'

function Form(){
  const dispatch = useDispatch();
  const [text, setText] = useState();

  function addHandler(e){
    e.preventDefault();
    dispatch(addPost(text));
    setText('');
  }

  return (
    <form className={`my-5 d-flex align-items-start`}>
      <textarea
        value={text}
        onChange={(e) => {setText(e.target.value)}}
        className={`me-5 w-50`}
      ></textarea>
      <Btn 
        type='submit' 
        label='Add'
        clickHandler={addHandler}
        className={`btn btn-primary w-25`}
        />
    </form>
  )
}

export default Form;