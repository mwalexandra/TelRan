import Users from './components/Users'
import UserDetails from './components/UserDetails'
import Posts from './components/Posts'
import Todos from './components/Todos'
import Albums from './components/Albums'
import Navbar from './components/Navbar'
import { Routes, Route, Link } from 'react-router-dom';
import { useSelector } from 'react-redux'


function App() {

  const activeUser = useSelector(state => state.activeUser) ?? {} ;


  return (
    <>
      <div className="container">
        <div className="row justify-content-between">
          <Navbar />
          <div className="col-4"> <Users /> </div>
          <div className="col-8 p-5"> 
          {
            Object.keys(activeUser).length === 0 
            ? <h2 className='text-sm text-danger text-opacity-50'>Choose an user!</h2>
            : (
              <Routes>
                <Route path='/posts' element={<Posts/>} />
                <Route path='/todos' element={<Todos/>} />
                <Route path='/albums' element={<Albums/>} />
                <Route path='/' element={<UserDetails/>} />
              </Routes>  
            )
          }
          </div>
        </div>
      </div>

    </>
    
  );
}

export default App;
