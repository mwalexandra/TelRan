import Users from './Users'
import Posts from './Posts'

function App() {
  return (
    <div className="container">
      <div className="row">
        <div className="col"> <Users /> </div>
        <div className="col"> <Posts /> </div>
      </div>
    </div>
  );
}

export default App;
