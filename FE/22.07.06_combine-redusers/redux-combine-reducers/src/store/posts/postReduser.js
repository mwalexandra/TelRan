import { REMOVE_ITEM, ADD_ITEM } from './actions';

const initialState = {
  list: [],
}

function postsReducer(state = initialState, {type, payload}){
  switch(type){

    case ADD_ITEM: 
      return {...state, list:[...state.list, payload]};

    case REMOVE_ITEM: 
      return {...state, list:[...state.list.filter(item => item.id !== payload)]};

    default: 
      return state;

  }
}

export default postsReducer;