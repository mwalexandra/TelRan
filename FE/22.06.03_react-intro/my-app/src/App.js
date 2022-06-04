import Hello from './components/hello'
import Colors from './components/colors'

function App() {

const name = 'Джек';
const colors = ['red', 'black', 'blue', 'orange'];

  return (
    <div className="app">

      <Hello nameHello={name}/>
      <Colors colors={colors}/>

    </div>
  );
}

export default App;
