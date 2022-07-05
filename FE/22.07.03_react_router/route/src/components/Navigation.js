import { Link } from 'react-router-dom'


function Navigation() {

  return (
      
        <header>
          <nav>
            <ul>
              <li><Link to='/about'>О нас</Link></li>
              <li><Link to='/team'>Команда</Link></li>
              <li><Link to='/contacts'>Контакты</Link></li>
              <li><Link to='/'>Главная</Link></li>
            </ul>
          </nav>
        </header>

  )
}

export default Navigation;
  