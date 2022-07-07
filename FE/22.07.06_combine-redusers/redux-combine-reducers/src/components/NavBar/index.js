import {Link} from 'react-router-dom'

function NavBar(){
  return (
    <nav className={`navbar justify-content-start`}>
      <Link 
        to='/'
        className={`nav-link p-0 me-2`}
      >Homepage</Link>
      <Link 
        to='/todos'
        className={`nav-link p-0 me-2`}
        >Todos</Link>
      <Link 
        to='/posts'
        className={`nav-link p-0`}
        >Posts</Link>
    </nav>
  )
}

export default NavBar;