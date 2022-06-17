import {useState} from 'react'
import style from './style.module.css'

function AddUser(props){
  const usersList = props.usersList;
  const setUsersList = props.setUsersList;

  const [name, setName] = useState('');
  const [surname, setSurname] = useState('');
  const [tel, setTel] = useState('');
  const [email, setEmail] = useState('');

  function addUser(e){
    e.preventDefault();
    const user = [{
      id: Date.now(),
      name,
      surname,
      tel,
      email,
    }]
    setUsersList([...usersList, ...user]);
    setName('');
    setSurname('');
    setTel('');
    setEmail('');
  }

  return (
    <form className={style.addForm}>
      <label 
        htmlFor='name'
        className={style.addFormLabel}
        >Name</label>
      <input 
        name='name' 
        id='name' 
        value={name}
        onChange={(e) => setName(e.target.value)}
        className={style.addFormInput}
      />

      <label 
        htmlFor='surname'
        className={style.addFormLabel}
        >Surame</label>
      <input 
        name='surname' 
        id='surname' 
        value={surname}
        onChange={(e) => setSurname(e.target.value)}
        className={style.addFormInput}
      />

      <label 
        htmlFor='tel'
        className={style.addFormLabel}
        >Tel</label>
      <input 
        name='tel' 
        id='tel' 
        value={tel}
        onChange={(e) => setTel(e.target.value)}
        className={style.addFormInput}
        />

      <label 
        htmlFor='email'
        className={style.addFormLabel}
        >Email</label>
      <input 
        name='email' 
        id='email' 
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        className={style.addFormInput}
      />

      <button 
        type='submit'
        onClick={addUser}
        className={style.addFormSubmit}
        >Add new user</button>
    </form>
  )
}

export default AddUser;