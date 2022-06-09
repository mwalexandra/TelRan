import style from './index.module.css'

function Button(props){
  const btnType = props.btnType;
  const btnText = props.btnText;
  // const btnClass = props.btnClass;

  return (
    <>
      <button 
        className={style.btn}   /* ?? вставить переменную в имя класса */
        type={btnType}
        >{btnText}</button> 
    </>
  )
}

export default Button;