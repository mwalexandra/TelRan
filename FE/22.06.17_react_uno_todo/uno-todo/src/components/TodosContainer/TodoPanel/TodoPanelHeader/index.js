import style from './style.module.css'

function TodoPanelHeader(){
  return (
    <div className={style.todoPanelHeader}>
      <input type='checkbox' name="completedEdit"/>
      <input type='text' name="titleEdit"/>
      <span 
        className='importantEdit'>
        {/* onClick={() => setIsImportant(!isImportant)}> */}
        <svg width="20" height="20" viewBox="0 0 20 20" 
          fill='#1C1B1F'
          xmlns="http://www.w3.org/2000/svg">
          <path fillRule="evenodd" clipRule="evenodd" d="M11.6886 9L10 3.4407L8.31136 9H3.12293L7.34894 12.0156L5.70765 17.3166L9.99951 14.0543L14.3036 17.3206L12.6612 12.0162L16.8812 9H11.6886ZM20 8L13.83 12.41L16.18 20L10 15.31L3.83 20L6.18 12.41L0 8H7.57L10 0L12.43 8H20Z" 
            // className={
            //   isImportant ? style.isImportant : style.notImportant
            // } 
            fillOpacity="0.38"/>
        </svg>
      </span>
    </div>
  )
}

export default TodoPanelHeader;