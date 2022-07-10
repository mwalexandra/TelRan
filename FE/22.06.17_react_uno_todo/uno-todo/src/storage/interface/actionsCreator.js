import { SHOW_PANEL_TODO } from './actions';

function showPanelTodo(show) {
  return {
    type: SHOW_PANEL_TODO,
    payload: {
      show,
    }
  }
}

export {showPanelTodo};