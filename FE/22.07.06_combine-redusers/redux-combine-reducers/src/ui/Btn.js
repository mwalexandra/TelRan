function Btn({type, className, clickHandler, label}){

  return (

    <button 
      type={type}
      className={className}
      onClick={clickHandler}
      onSubmit={(e) => e.preventDefault()}
    > {label} </button>
    
  )
}

export default Btn;