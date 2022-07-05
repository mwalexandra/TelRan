import {Router, Route} from 'react'
import AboutUs from './components'
import Team from './components'
import Contacts from './components'
import Home from './components'

function App(){
  return (
    <Router>
      <Route path='/about' component='<AboutUs/>' />
      <Route path='/team' component='<Team/>' />
      <Route path='/contacts' component='<Contacts/>' />
      <Route path='/' component='<Home/>' />
    </Router>
  )
}