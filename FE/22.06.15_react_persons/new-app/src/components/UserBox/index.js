function UserBox(props){
  const user = props.user;
  console.log(user);
  
  return (
    <li className="userItem">
      <input
        name='name' 
        id='name' 
        value={user.name}
        type='text' 
        disabled
        >{user.name}</input>
      <input
        name='surname' 
        id='surname' 
        value={user.surname}
        type='text' 
        disabled
        >{user.surname}</input>
      <input
        name='tel' 
        id='tel' 
        value={user.tel}
        type='text' 
        disabled
        >{user.tel}</input>
      <input 
        name='email' 
        id='email' 
        value={user.email}
        type='text' 
        disabled
        >{user.email}</input>
      <button>Edit</button>
      <button>Delete</button>
    </li>
  )
}

export default UserBox;