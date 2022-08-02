// Информация о пользователе
interface UserProps {
  name: string,
  surname: string,
  age: number,
}

function getFullName(user: UserProps) {
  return `${user.name} ${user.surname}`
}

function User(props : UserProps){

  let fullName = getFullName(props);

  return (
    <>
      <h1 style={{color: 'green'}}>User</h1>
      <h2>Name: {fullName}</h2>
      <p>Age: {props.age}</p>
    </>
  )
}

export default User;