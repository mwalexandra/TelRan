import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navigation from './components/Navigation'

import AboutUs from './components/AboutUs'
import Team from './components/Team'
import Contacts from './components/Contacts'
import Home from './components/Home'

function App() {
  return (
    <Router>
      <Navigation />
      <Routes>
          <Route path='/about' element={<AboutUs/>} />
          <Route path='/team/*' element={<Team/>} />
          <Route path='/contacts' element={<Contacts/>} />
          <Route path='/' element={<Home/>} />
          {/* <Route path="*" element={<h1>404<br/>Нет такой страницы</h1>} /> */}
        </Routes>
    </Router>
    
  );
}

export default App;
