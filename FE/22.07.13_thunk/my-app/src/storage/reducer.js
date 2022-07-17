import {FETCH_USERS, CHANGE_ACTIVE_USER, 
        FETCH_ALBUMS, FETCH_TODOS, FETCH_PHOTOS, FETCH_COMMENTS,
        FETCH_POSTS, CHANGE_IS_LOADING, CHANGE_IS_COMMENTS_LOADING, CHANGE_IS_PHOTOS_LOADING} from './actions'

const initialState = {
  users:[],
  posts:[],
  albums: [],
  todos: [],
  activeUser: null,
  isLoading: false,
  isCommentsLoading: false,
  isPhotosLoading: false,
};

function reducer(state = initialState, {type, payload}){
  switch(type){
    case FETCH_USERS:
      return {
        ...state,
        users: payload,
      }

    case FETCH_ALBUMS:
    return {
      ...state,
      albums: payload,
    }

    case FETCH_POSTS:
    return {
      ...state,
      posts: payload,
    }

    case FETCH_TODOS:
    return {
      ...state,
      todos: payload,
    }

    case FETCH_PHOTOS:
      return {
        ...state,
        albums: state.albums.map(album => {
          if(album.id === payload.id){
            album.photos = payload.data;
          }
          return album;
        })
      }

    case FETCH_COMMENTS:
      return {
        ...state,
        posts: state.posts.map(post => {
          if(post.id === payload.id){
            post.comments = payload.data;
          }
          return post;
        })
      }  

    case CHANGE_ACTIVE_USER:
    return {
      ...state,
      activeUser: payload,
    }

    case CHANGE_IS_LOADING:
    return {
      ...state,
      isLoading: payload,
    }

    case CHANGE_IS_COMMENTS_LOADING:
    return {
      ...state,
      commentsLoading: payload,
    }

    case CHANGE_IS_PHOTOS_LOADING:
    return {
      ...state,
      photosLoading: payload,
    }

    default:
      return state;
  }
}

export default reducer;