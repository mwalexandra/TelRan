import { incrementByOne, descrementByOne, reset } from './store/actionCreators'
import { useDispatch, useSelector } from 'react-redux';

import style from './style.module.css'

function App() {
   
  const counter = useSelector(state => state);
  const dispatch = useDispatch();

  return (
    <>
    <div className={style.btnsWrapper}>
      <button
        className={style.btn}
        onClick={() => dispatch(incrementByOne())}
      >+1</button>
      <button
        className={style.btn}
        onClick={() => dispatch(descrementByOne())}
      >-1</button>
      <button
        className={style.btn}
        onClick={() => dispatch(reset())}
      >reset</button>
    </div>
    <p className={style.output}>
    {counter}
    </p>
    </>
  );
}

export default App;
