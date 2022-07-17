import { useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import {getTodosByUserId} from '../../storage/actionsCreator'
import {Spinner} from '../../ui/Spinner'


function Todos (){

  const dispatch = useDispatch();

  const activeUser = useSelector(state => state.activeUser) ?? {} ;
  const todos = useSelector(state => state.todos);
  const isLoading = useSelector(state => state.isLoading);

  useEffect(
    ()=>{
      if (Object.keys(activeUser).length !== 0) {
        dispatch(getTodosByUserId(activeUser.id));
      }
    }, [activeUser]
  )

  function TodosList(){
    return (
      <div className={`list-group`}>
        {
          todos.map(todo => <TodoItem todo={todo} key={todo.id} />)
        }
      </div>
    )
  }

  return (
    <>
      {
        isLoading ? <Spinner /> : <TodosList />
      }
    </>
  )
}

function TodoItem({todo}){
  return (
    <>
      <input type='checkbox'
              value={todo.completed}
              checked={todo.completed}
              readOnly />
      <p>{todo.title}</p>
    </>
  )
}

export default Todos;