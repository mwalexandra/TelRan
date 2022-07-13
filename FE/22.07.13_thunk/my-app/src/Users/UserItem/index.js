import { useDispatch, useSelector } from 'react-redux'
import {changeActiveUser} from '../../storage/actionsCreator'

function UserItem ({user}){

  const dispatch = useDispatch();
  const activeUser = useSelector(state => state.activeUser) ?? {};
  
  return (
    <div 
      className={`list-group-item ${activeUser.id === user.id ? 'list-group-item-info' : ''}`}
      onClick={() => dispatch(changeActiveUser(user))
      }
    >
      {user.name}
    </div>
  )
}

export default UserItem;