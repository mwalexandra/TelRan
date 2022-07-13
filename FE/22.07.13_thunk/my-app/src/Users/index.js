import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux'
import {getAllUsers} from '../storage/actionsCreator'
import UserItem from './UserItem'


function Users(){
  const dispatch = useDispatch();

  const users = useSelector(state => state.users);

  useEffect(
    () => {
      dispatch(getAllUsers())
    }, []
  )

  console.log(users);

  return (
    <div className='users'>
      {
        !users.length 
        ? <h2>No users</h2> 
        : users.map(user => 
          <UserItem 
            key={user.id}
            user={user} />
          )
      }
    </div>
  )
}

export default Users;