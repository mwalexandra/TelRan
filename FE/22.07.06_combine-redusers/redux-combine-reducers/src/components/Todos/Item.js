import Btn from '../../ui/Btn';
import { useDispatch } from 'react-redux';
import {removeTodo, completeTodo} from '../../store/todos/actionsCreator';

function Item({todo}){

  const dispatch = useDispatch();
  
  function completeHandler(e){
    e.preventDefault();
    dispatch(completeTodo(todo.id));
  }

  function removeHandler(e){
    e.preventDefault();
    dispatch(removeTodo(todo.id));
  }

  return (
    <div className={`d-flex justify-content-between align-items-center py-3 border-bottom`}>
      <p
        className={todo.complete ? `text-success text-opacity-25` : ``}
      >{todo.title}</p>
      <div>
        <Btn 
          label="Complete"
          className={`btn btn-outline-success me-3`}
          clickHandler={completeHandler}
        />
        <Btn 
          label="Remove"
          className={`btn btn-outline-danger`}
          clickHandler={removeHandler} 
        />
      </div>
    </div>
  )
}

export default Item;