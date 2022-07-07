import Todos from './components/Todos'
import Posts from './components/Posts'
import HomePage from './components/HomePage'
import NavBar from './components/NavBar'

import {Routes, Route} from 'react-router-dom'

function App() {
  return (
    <div className={`container`}>
      <NavBar />
      <Routes>
        <Route path="/todos" element={<Todos/>}></Route>
        <Route path="/posts" element={<Posts/>}></Route>
        <Route path="/" element={<HomePage/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
