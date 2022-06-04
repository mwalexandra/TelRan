import style from './index.module.css'

function Users (props){
  let i = 0;

  return (
    <section className={style.users}>
      <h1 className={style.heading}>Users</h1>
      <ul className={style.list}>
        
      {
        props.users.map((user) => {
          if(i === props.colors.length) i = 0;
          return <li
                  className={style.item}
                  key={user}
                  style={{color:props.colors[i++]}}
                  >Hello, {user}</li>
        })

      }

      </ul>
    </section>
  )
}

export default Users;