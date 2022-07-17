import { Link } from "react-router-dom";


function Navbar(){
  return (
    <nav className="bg-light mb-3">
      <ul className="navbar-nav flex-row justify-content-evenly">
        <li className="nav-item">
          <Link className="nav-link text-info active" to='/'>UserDetails</Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link text-info" to='/posts'>Posts</Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link text-info" to='/todos'>Todos</Link>
        </li>
        <li className="nav-item">
          <Link className="nav-link text-info" to='/albums'>Albums</Link>
        </li>
      </ul>
  </nav>
  )
}

export default Navbar;

