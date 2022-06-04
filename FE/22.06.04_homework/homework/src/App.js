import Knowledge from "./components/knowledge";
import Users from "./components/users";

function App() {

  const subjects = ['html', 'css', 'js native' ];
  const users = [ 'Brad', 'Inna', 'John', 'Rocky', 'Rainer Werner Fassbinder', 'Ludwig Josef Johann Wittgenstein', 'Superman' ];
  const colors = [ 'red', 'blue', 'orange' ,'beige' ,'aquamarine' ];
  
  return (
    <div className="App">
     
      <Knowledge subjects={subjects} colors={colors} />
      <Users users={users} colors={colors} />

    </div>
  );
}

export default App;
