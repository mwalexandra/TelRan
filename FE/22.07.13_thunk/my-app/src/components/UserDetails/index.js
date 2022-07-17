
import { useSelector } from 'react-redux'

function UserDetails (){
  
  const activeUser = useSelector(state => state.activeUser) ?? {};
  

  return (
    <div className={`!activeUser ? 'hidden' : 'shown'`}>
        <h1>
          <span className='text-success fst-italic'>Name: </span>
            {activeUser.name}
        </h1>
        <p>
          <span className='text-success fst-italic'>Company: </span>
          {activeUser.company.name}
        </p>
        <h2>
          <span className='text-success fst-italic'>City: </span>
          {activeUser.address.city}
        </h2>
        <p>
          <span className='text-success fst-italic'>Phone: </span>
          {activeUser.phone}
        </p>
        <p>
          <span className='text-success fst-italic'>Email: </span>
          {activeUser.email}
        </p>
        <p>
          <span className='text-success fst-italic'>Website: </span>
          {activeUser.website}
        </p>
    </div>
  )
}

export default UserDetails;