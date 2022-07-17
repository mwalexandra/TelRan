import { useDispatch, useSelector } from "react-redux";
import {getCommentsByPostId} from '../../storage/actionsCreator'
import { Spinner } from "../../ui/Spinner";

function PostItem({post}){

  const dispatch = useDispatch();
  const isCommentsLoading = useSelector(state => state.isCommentsLoading);

  return (
    <>
      <h3>{post.title}</h3>
      <p>{post.body}</p>
      { 
        isCommentsLoading 
        ? <Spinner /> 
        :(
          post.comments 
        ? <Comments post={post}/>
        : (
          <button
            onClick={() => dispatch(getCommentsByPostId(post.id))}
          >Get comments</button>
          )
        )
      }
    </>
  )
}

function Comments ({post}){
  return (
    post.comments.map((comment, index) => {
      if(index < 2){
        return (
          <div key={comment.id}>
            <p>{comment.name}</p>
            <p>{comment.email}</p>
            <p>{comment.body}</p>
          </div>
        )
        
      }
      return undefined;
    })
  ) 
}

export default PostItem;