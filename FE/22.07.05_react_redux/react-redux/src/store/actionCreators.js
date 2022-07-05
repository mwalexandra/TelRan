import { INCR_BY_ONE, DECR_BY_ONE, RESET } from './actions.js'
import store from './store';


const { dispatch } = store;

function incrementByOne(){
  dispatch ({
    type: INCR_BY_ONE,
  })
}

function descrementByOne(){
  dispatch ({
    type: DECR_BY_ONE,
  })
}

function reset () {
  dispatch ({
    type: RESET,
  })
}  

export { incrementByOne, descrementByOne, reset };