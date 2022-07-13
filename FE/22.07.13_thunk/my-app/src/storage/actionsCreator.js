import {FETCH_USERS, CHANGE_ACTIVE_USER, FETCH_POSTS, CHANGE_IS_LOADING} from './actions'

const addAllUsers = (data) => {
  return {
    type: FETCH_USERS,
    payload: data,
  }
}

const getAllUsers = () => {
  return async (dispatch) => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/users');
      const data = await response.json();
      dispatch(addAllUsers(data));
    } catch (error) {
      console.log(error.message);
    }
  }
}

const changeActiveUser = (user) => {
  return {
    type: CHANGE_ACTIVE_USER,
    payload: user,
  }
}

const getPostsByUserId = (userId) => {
  return async (dispatch) => {
    try {
      dispatch(addPosts([]))
      dispatch(postsIsLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/posts?userId=' + userId);
      const data = await response.json();
      dispatch(addPosts(data));
      dispatch(postsIsLoading(false));
    } catch (error) {
      console.log(error.message);
    }
  }
}

function addPosts(data){
  return {
    type: FETCH_POSTS,
    payload: data,
  }
}

function postsIsLoading(flag){
  return {
    type: CHANGE_IS_LOADING,
    payload: flag,
  }
}

export {getAllUsers, changeActiveUser, getPostsByUserId};