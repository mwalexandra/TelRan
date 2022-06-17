import { useState } from 'react';
import style from './style.module.css'

function UserBox(props){
  const user = props.user;
  const usersList = props.usersList;
  const setUsersList = props.setUsersList;
  
  const id = user.id;
  const [name, setName] = useState(user.name);
  const [surname, setSurname] = useState(user.surname);
  const [tel, setTel] = useState(user.tel);
  const [email, setEmail] = useState(user.email);

  const [isEditing, setIsEditing] = useState(false);
  const [userBtn, setUserBtn] = useState('Edit');

  function edit(){
    if(userBtn === 'Edit'){
      setIsEditing(true);
      setUserBtn('Save');
    } else if(userBtn === 'Save'){
      setIsEditing(false);
      setUserBtn('Edit');

      const usersListUpdate = usersList.map(element => {
        if(element.id === id){
          return {
            id,
            name,
            surname,
            tel,
            email,
          }
        }
        return element;
      });
      setUsersList(usersListUpdate);
    }
  }

  function deleteUser(){
    const usersListUpdate = [];
    usersList.forEach(element => {
      if(element.id !== id){
        usersListUpdate.push(element);
      }
    })
    setUsersList(usersListUpdate);
  }
  
  return (
    <li className={style.userItem}>
      <input
        className={style.userItemInput}
        name='name' 
        id='name' 
        value={name}
        type='text'
        disabled = {!isEditing}
        onChange = {(e) => setName(e.target.value)} 
        />
      <input
        className={style.userItemInput}
        name='surname' 
        id='surname' 
        value={surname}
        type='text'
        disabled = {!isEditing}
        onChange = {(e) => setSurname(e.target.value)} 
        />
      <input
        className={style.userItemInput}
        name='tel' 
        id='tel' 
        value={tel}
        type='text'
        disabled = {!isEditing}
        onChange = {(e) => setTel(e.target.value)} 
        />
      <input
        className={style.userItemInput} 
        name='email' 
        id='email' 
        value={email}
        type='text'
        disabled = {!isEditing}
        onChange = {(e) => setEmail(e.target.value)} 
        />
      <div className={style.userItemBtnWrapper}> 
        <button
          className={`${style.userItemBtn} ${style.editBtn}`}
          onClick={edit}
        >{userBtn}</button>
        <button
          className={`${style.userItemBtn} ${style.deleteBtn}`}
          onClick={deleteUser}
        >Delete</button>
      </div>  
    </li>
  )
}

export default UserBox;