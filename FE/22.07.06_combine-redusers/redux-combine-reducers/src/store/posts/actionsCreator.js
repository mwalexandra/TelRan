import {REMOVE_ITEM, ADD_ITEM} from './actions';

function addPost(text){
  return {
    type: ADD_ITEM,
    payload: {
      text,
      id: Date.now(),
    }
  }
}

function removePost(id){
  return {
    type: REMOVE_ITEM,
    payload: id,
  }
}

export {addPost, removePost};