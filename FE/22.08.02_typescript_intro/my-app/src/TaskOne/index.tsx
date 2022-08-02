// Домашнее задание 1
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import User from './User'
import Weather from './Weather'
import CityComponent from './City'

// Информацию о пользователе
const user = {
  name: 'Brad',
  surname: 'Tomik',
  age: 31,
}

// const user = {
//   name: 5486,
//   surname: 'Tomik',
//   age: 31,
// }
// Информацию о погоде
const weather = {
  light: 'Dark',
  sky: 'Clouds',
  cold: true,
  temperature: 20,
}
// Информацию о городе
const city = {
  name: 'Ljubljana',
  country: 'Slovenia',
  population: 250000,
  //europe: 'No',
  europe: false,
}

function TaskOne(){

  return (
    <>
        <header>
          <nav>
            <ul>
              <li><Link to='user'>User</Link></li>
              <li><Link to='weather'>Weather</Link></li>
              <li><Link to='city'>City</Link></li>
            </ul>
          </nav>
        </header>
        <Routes>
          <Route path=':weather' element={
            <Weather
              light={weather.light}
              sky={weather.sky}
              cold={weather.cold}
              temperature={weather.temperature}
            />}/>
          <Route path=':city' element={
            <CityComponent 
              name={city.name}
              country={city.country}
              population={city.population}
              europe={city.europe}
            />
            }/>
          <Route path=':user' element={
            <User
              name={user.name}
              surname={user.surname}
              age={user.age}
            />
          }/>
        </Routes>
    </>
  )
}

export default TaskOne;