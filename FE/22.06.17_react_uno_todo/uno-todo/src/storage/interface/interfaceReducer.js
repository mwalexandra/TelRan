import { SHOW_PANEL_TODO } from './actions';

const initialState = {
  show: false,
};

function iterfaceReducer(state = initialState, {type, payload}) {
  switch(type){

    case SHOW_PANEL_TODO:
      return {
        show: payload.show,
      }

    default: return state;
  }
}

  export {iterfaceReducer};
