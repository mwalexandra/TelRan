import UserBox from '../UserBox'

function UsersList(props){
  const usersList = props.usersList;
  const setUsersList = props.setUsersList;

  return (
    <ul className="usersList">
      {
        usersList.map((user) => {
          return <UserBox 
                    user = {user}    
                  />
        })
      }
    </ul>
  )
}

export default UsersList;