import Item from './Item';
import { useSelector } from 'react-redux';

function List () {

  const list = useSelector(state => state.posts.list);

  return !list.length ? (<h2 className={`fst-italic`}>No posts</h2>) : (
    <div>
      {
        list.map(post => {
          return <Item key={post.id} post={post}/>
        })
      }
    </div>
  )
}

export default List;