import { TODO_COMPLETE, TODO_IMPORTANT, TODO_SELECTED, CHANGE_HEADER, CHANGE_DATE } from './actions';
import { CreateDate } from '../../helpers';


const initialState = {
  content: [
    {
      id: 44444,
      header: 'Task list',
      selected: true,
      todos: [
        {
          id: '11111',
          title: 'Todo 1',
          note: 'Do something important',
          date: CreateDate(),
          createDate: CreateDate(),
          completed: true,
          important: true,
          selected: false,
        },
        {
          id: '22222',
          title: 'Todo 2',
          note: 'Do something important',
          date: CreateDate(),
          createDate: CreateDate(),
          completed: true,
          important: true,
          selected: false,
        },
        {
          id: '33333',
          title: 'Todo 3',
          note: 'Do something',
          date: CreateDate(),
          createDate: CreateDate(),
          completed: true,
          important: true,
          selected: false,
        },
      ]
    },
  ]
}

function contentReducer(state = initialState, {type, payload}) {
  switch(type){

    case TODO_COMPLETE:
      return {
        ...state,
          content: state.content.map(list => {
            if(list.id === payload.listId) {
              list.todos.map(todo => {
                if(todo.id === payload.todoId){
                  todo.completed = !todo.completed;
                }
              })
            }
            return list;
          })
        }

    case TODO_IMPORTANT:
      return {
        ...state,
        ontent: state.content.map(list => {
            if(list.id === payload.listId) {
              list.todos.map(todo => {
                if(todo.id === payload.todoId){
                  todo.important = !todo.important;
                }
              })
            }
            return list;
          })
        }

    case TODO_SELECTED:
      return {
        ...state,
          content: state.content.map(list => {
            if(list.id === payload.listId) {
              list.todos.map(todo => {
                if(todo.id === payload.todoId){
                  todo.selected = true;
                } else {
                  todo.selected = false;
                }
              })
            } else {
              list.todos.map(todo => todo.selected = false)
            }
            return list;
          })
        }    

      case CHANGE_HEADER:
        return {
          ...state,
            content: state.content.map(list => {
              if(list.id === payload.listId) {
                
                list.header = payload.header
              }
              return list;
            })
          }    

      case CHANGE_DATE:
        return {
          ...state,
            content: state.content.map(list => {
              if(list.id === payload.listId) {
                list.todos.map(todo => {
                  if(todo.id === payload.todoId){
                    todo.date = payload.date;
                  }
                })
              }
              return list;
            })
          } 

    default: return state;    
  }
}

  export {contentReducer};