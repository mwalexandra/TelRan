import { TODO_COMPLETE, TODO_IMPORTANT, TODO_SELECTED, 
				CHANGE_HEADER, CHANGE_DATE } from './actions';

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

function changeHeader(listId, header) {
	return {
		type: CHANGE_HEADER,
		payload: {
			listId,
			header,
		}
	}
}

function changeDate(listId, todoId, date) {
	return {
		type: CHANGE_DATE,
		payload: {
			listId,
			todoId,
			date,
		}
	}
}

export {todoComplete, todoImportant, todoSelected, changeHeader, changeDate };