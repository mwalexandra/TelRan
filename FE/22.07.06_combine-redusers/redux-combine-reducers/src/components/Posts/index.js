import Form from './Form'
import List from './List'

function Posts(){
  return(
    <div>
      <h1 className={`text-secondary`}>Posts</h1>
      <Form />
      <List />
    </div>
  )
}

export default Posts;