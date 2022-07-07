import Form from './Form'
import List from './List'

function Todos(){
  return(
    <div>
      <h1 className={`text-secondary`}>Todos</h1>
      <Form />
      <List />
    </div>
  )
}

export default Todos;