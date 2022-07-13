import {FETCH_USERS, CHANGE_ACTIVE_USER, FETCH_POSTS, CHANGE_IS_LOADING} from './actions'

const initialState = {
  users:[],
  posts:[],
  activeUser: null,
  postsIsLoading: false,
};

function reducer(state = initialState, {type, payload}){
  switch(type){
    case FETCH_USERS:
      return {
        ...state,
        users: payload,
      }

    case CHANGE_ACTIVE_USER:
    return {
      ...state,
      activeUser: payload,
    }

    case FETCH_POSTS:
    return {
      ...state,
      posts: payload,
    }

    case CHANGE_IS_LOADING:
    return {
      ...state,
      postsIsLoading: payload,
    }

    default:
      return state;
  }
}

export default reducer;