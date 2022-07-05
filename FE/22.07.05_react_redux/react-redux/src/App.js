import { incrementByOne, descrementByOne, reset } from './store/actionCreators'
import store from './store/store';

import style from './style.module.css'

function App() {
  
  const { subscribe, getState } = store;

  subscribe(() => {
    console.log(getState());
  })

  return (
    <>
    <div className={style.btnsWrapper}>
      <button
        className={style.btn}
        onClick={() => incrementByOne()}
      >+1</button>
      <button
        className={style.btn}
        onClick={() => descrementByOne()}
      >-1</button>
      <button
        className={style.btn}
        onClick={() => reset()}
      >reset</button>
    </div>
    <p className={style.output}>
    {getState()}
    </p>
    </>
  );
}

export default App;
