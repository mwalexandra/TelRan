import Btn from '../../ui/Btn';
import { useDispatch } from 'react-redux';
import {removePost} from '../../store/posts/actionsCreator';

function Item({post}){

  const dispatch = useDispatch();

  function removeHandler(e){
    e.preventDefault();
    dispatch(removePost(post.id));
  }

  return (
    <div className={`d-flex justify-content-between align-items-center py-2 border-bottom`}>
      <p className={`p-0`}>{post.text}</p>
      <Btn 
        label="Remove"
        className={`btn btn-outline-danger`}
        clickHandler={removeHandler} 
        />
    </div>
  )
}

export default Item;