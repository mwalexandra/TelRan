import { incrementByOne, descrementByOne, reset } from './store/actionCreators'
import store from './store/store';
import { useSelector } from 'react-redux';

import style from './style.module.css'

function App() {
   
  const { getState } = store;
  const counter = useSelector(() => getState())

  //TODO 
  // Вынести dispatch через useDispatch 

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
    {counter}
    </p>
    </>
  );
}

export default App;
