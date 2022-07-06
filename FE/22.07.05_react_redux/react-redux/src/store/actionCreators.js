import { INCR_BY_ONE, DECR_BY_ONE, RESET } from './actions.js'

function incrementByOne(){
  return ({
    type: INCR_BY_ONE,
  })
}

function descrementByOne(){
  return ({
    type: DECR_BY_ONE,
  })
}

function reset () {
  return ({
    type: RESET,
  })
}  

export { incrementByOne, descrementByOne, reset };