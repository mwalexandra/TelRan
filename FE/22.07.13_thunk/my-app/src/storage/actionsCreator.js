import {FETCH_USERS, CHANGE_ACTIVE_USER, 
        FETCH_POSTS, FETCH_ALBUMS, FETCH_TODOS, 
        FETCH_PHOTOS, FETCH_COMMENTS,
        CHANGE_IS_LOADING, CHANGE_IS_COMMENTS_LOADING, CHANGE_IS_PHOTOS_LOADING} from './actions'

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
      dispatch(isLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/posts?userId=' + userId);
      const data = await response.json();
      dispatch(addPosts(data));
      dispatch(isLoading(false));
    } catch (error) {
      console.log(error.message);
    }
  }
}

const getTodosByUserId = (userId) => {
  return async (dispatch) => {
    try {
      dispatch(addTodos([]))
      dispatch(isLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/todos?userId=' + userId);
      const data = await response.json();
      dispatch(addTodos(data));
      dispatch(isLoading(false));
    } catch (error) {
      console.log(error.message);
    }
  }
}

const getAlbumsByUserId = (userId) => {
  return async (dispatch) => {
    try {
      dispatch(addAlbums([]))
      dispatch(isLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/albums?userId=' + userId);
      const data = await response.json();
      dispatch(addAlbums(data));
      dispatch(isLoading(false));
    } catch (error) {
      console.log(error.message);
    }
  }
}

const getPhotosByAlbumId = (albumId) => {
  return async (dispatch) => {
    try {
      dispatch(isPhotosLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/albums/' + albumId + '/photos' );
      const data = await response.json();
      dispatch(addPhotos(albumId, data));
      dispatch(isPhotosLoading(false));
    } catch (error) {
      console.log(error.message);
    }
  }
}

const getCommentsByPostId = (postId) => {
  return async (dispatch) => {
    try {
      dispatch(isCommentsLoading(true))
      const response = await fetch('https://jsonplaceholder.typicode.com/posts/' + postId + '/comments' );
      const data = await response.json();
      dispatch(addComments(postId, data));
      dispatch(isCommentsLoading(false));
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

function addPhotos(id, data){
  return {
    type: FETCH_PHOTOS,
    payload: {
      id,
      data,
    }
  }
}

function addComments(id, data){
  return {
    type: FETCH_COMMENTS,
    payload: {
      id,
      data,
    }
  }
}

function addTodos(data){
  return {
    type: FETCH_TODOS,
    payload: data,
  }
}

function addAlbums(data){
  return {
    type: FETCH_ALBUMS,
    payload: data,
  }
}

function isLoading(flag){
  return {
    type: CHANGE_IS_LOADING,
    payload: flag,
  }
}

function isCommentsLoading(flag){
  return {
    type: CHANGE_IS_COMMENTS_LOADING,
    payload: flag,
  }
}

function isPhotosLoading(flag){
  return {
    type: CHANGE_IS_PHOTOS_LOADING,
    payload: flag,
  }
}

export {getAllUsers, changeActiveUser, 
        getPostsByUserId, getTodosByUserId, 
        getAlbumsByUserId, getPhotosByAlbumId,
        getCommentsByPostId, 
      };