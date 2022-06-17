import style from './style.module.css'
import UserBox from '../UserBox'

function UsersList(props){
  const usersList = props.usersList;
  const setUsersList = props.setUsersList;

  return (
    <ul className={style.usersList}>
      {
        usersList.map((user) => {
          return <UserBox 
                    key = {user.id}
                    user = {user}   
                    setUsersList = {setUsersList} 
                    usersList = {usersList}
                  />
        })
      }
    </ul>
  )
}

export default UsersList;