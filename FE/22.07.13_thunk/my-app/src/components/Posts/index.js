import { useDispatch, useSelector } from 'react-redux'
import { useEffect } from 'react';
import PostItem from './PostItem'
import {Spinner} from '../../ui/Spinner'
import {getPostsByUserId} from '../../storage/actionsCreator'



function Posts(){
  const dispatch = useDispatch();

  const activeUser = useSelector(state => state.activeUser) ?? {} ;
  const posts = useSelector(state => state.posts);
  const isLoading = useSelector(state => state.isLoading);

  useEffect(
    ()=>{
      if (Object.keys(activeUser).length !== 0) {
        dispatch(getPostsByUserId(activeUser.id));
      }
    }, [activeUser]
  )

  function PostList(){
    return (
      <div className={`list-group`}>
        {
          posts.map(post => <PostItem post={post} key={post.id} />)
        }
      </div>
    )
  }

  return (
    <>
      {
        isLoading ? <Spinner /> : <PostList />
      }
    </>
  )
}

export default Posts;