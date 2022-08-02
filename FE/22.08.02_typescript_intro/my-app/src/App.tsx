import './App.css';
import TaskOne from './TaskOne'
import TaskTwo from './TaskTwo'
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';


function App() {
  return (
    <div className="App">
      <Router>
        <nav>
          <ul>
            <li><Link to='/task1'>Task 1</Link></li>
            <li><Link to='/task2'>Task 2</Link></li>
          </ul>
        </nav>
        <Routes>
          <Route path="/task1/*" element={<TaskOne />}/>
          <Route path="/task2" element={<TaskTwo />}/>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
