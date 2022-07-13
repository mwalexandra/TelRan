import { useDispatch, useSelector } from 'react-redux'
import { useEffect } from 'react';
import PostItem from './PostItem'
import {Spinner} from '../ui/Spinner'
import {getPostsByUserId} from '../storage/actionsCreator'

function Posts(){
  const dispatch = useDispatch();

  const activeUser = useSelector(state => state.activeUser);
  const posts = useSelector(state => state.posts);

  const isLoading = useSelector(state => state.postsIsLoading);

  useEffect(
    ()=>{
      if (activeUser) {
        dispatch(getPostsByUserId(activeUser.id));
      }
    }, [activeUser]
  )

  return (
    !activeUser ? <h2>Choose user</h2> 
    : (
      isLoading ? <Spinner /> 
      : <div className={`list-group`}>
        {
          posts.map(post => <PostItem post={post} key={post.id} />)
        }
      </div>
    ) 
    
  )
}

export default Posts;