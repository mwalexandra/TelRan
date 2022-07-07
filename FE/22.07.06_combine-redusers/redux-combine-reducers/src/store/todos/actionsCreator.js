import {REMOVE_ITEM, ADD_ITEM, COMPLETE_ITEM} from './actions';

function addTodo(title){
  return {
    type: ADD_ITEM,
    payload: {
      title,
      id: Date.now(),
      complete: false,
    }
  }
}

function removeTodo(id){
  return {
    type: REMOVE_ITEM,
    payload: id,
  }
}

function completeTodo(id){
  return {
    type: COMPLETE_ITEM,
    payload: id,
  }
}

export {addTodo, removeTodo, completeTodo};

