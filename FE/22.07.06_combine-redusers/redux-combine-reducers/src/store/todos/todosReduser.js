import { REMOVE_ITEM, ADD_ITEM, COMPLETE_ITEM } from './actions';

const initialState = {
  list: [],
}

function todosReducer(state = initialState, {type, payload}){
  switch(type){

    case ADD_ITEM: 
      return {...state, list:[...state.list, payload]};

    case REMOVE_ITEM: 
      return {...state, list:[...state.list.filter(item => item.id !== payload)]};

    case COMPLETE_ITEM: 
      return {
        ...state, 
        list:state.list.map(item => {
          if(item.id === payload) {
            return {
              ...item, 
              complete: !item.complete,
            }
          }
          return item;
        })
      };

    default: 
      return state;

  }
}

export default todosReducer;