import { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux'
import {getAllUsers} from '../../storage/actionsCreator'
import UserItem from './UserItem'
import { Spinner } from '../../ui/Spinner';


function Users(){
  const dispatch = useDispatch();

  const users = useSelector(state => state.users);

  useEffect(
    () => {
      dispatch(getAllUsers())
    }, []
  )

  return (
    <>
      <section>
        <h1 className="text-warning">Users</h1>
        <ul className='ps-0'>
          {
            !users.length ? <Spinner /> 
            : users.map((user) => (
                    <UserItem
                      user={user}
                      key={user.id}
                      />
            ))
          }
        </ul>
      </section>
     </>
  )
 }  





export default Users;