import Item from './Item';
import { useSelector } from 'react-redux';

function List () {

  const list = useSelector(state => state.todos.list);

  return !list.length ? (<h2 className={`fst-italic`}>No todos</h2>) : (
    <div>
      {
        list.map(todo => {
          return <Item key={todo.id} todo={todo}/>
        })
      }
    </div>
  )
}

export default List;