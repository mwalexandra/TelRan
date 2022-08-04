import './App.css';

interface People {
  name: string,
}

interface Celebrity extends People {
  name: 'Famous guy',
}

interface Related extends People {
  name: 'Kinsman',
}

interface Person extends People {
  name: 'Somebody',
}

let serena = {
  name: 'Serena Williams',
  profession: 'Tennis Player'
}

function App() {

  function printName<T>(T: People) : String {
    return(`My name is ${T.name}`);
  }

  return (
    <div className="App">
      {
        printName(serena)
      }
    </div>
  );
}

export default App;
