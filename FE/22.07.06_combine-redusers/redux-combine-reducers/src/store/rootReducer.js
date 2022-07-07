import todosReducer from './todos/todosReduser'
import postsReducer from './posts/postReduser'

import { combineReducers } from 'redux'

const rootReducer = combineReducers({
  todos: todosReducer,
  posts: postsReducer,
})

export default rootReducer;