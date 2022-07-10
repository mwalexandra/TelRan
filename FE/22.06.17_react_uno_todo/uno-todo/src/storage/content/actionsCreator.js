import { TODO_COMPLETE, TODO_IMPORTANT, TODO_SELECTED } from './actions';

function todoComplete(listId, todoId) {
  return {
    type: TODO_COMPLETE, 
    payload: {
      listId,
      todoId,
    }
  }
}

function todoImportant(listId, todoId) {
	return {
		type: TODO_IMPORTANT,
		payload: {
			listId,
			todoId,
		}
	}
}

function todoSelected(listId, todoId) {
	return {
		type: TODO_SELECTED,
		payload: {
			listId,
			todoId,
		}
	}
}

export {todoComplete, todoImportant, todoSelected};