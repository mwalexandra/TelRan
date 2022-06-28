import { useState } from 'react';

import TodosContainer from './TodosContainer'
import TodoPanel from './TodoPanel'

import style from './style.module.css'

function Todos({lists, setLists, selectedList}) {
  const [showPanelTodo, setShowPanelTodo] = useState(false);
  const [selectedTodo, setSelectedTodo] = useState({});


  return (
    <div className={style.todos}>
      <TodosContainer 
        lists={lists} 
        setLists={setLists} 
        selectedList={selectedList} 
        showPanelTodo={showPanelTodo} 
        setShowPanelTodo={setShowPanelTodo}
        selectedTodo={selectedTodo}
        setSelectedTodo={setSelectedTodo}
      /> 
      <TodoPanel 
        showPanelTodo={showPanelTodo} 
        setShowPanelTodo={setShowPanelTodo}
        lists={lists} 
        setLists={setLists} 
        selectedList={selectedList}
        selectedTodo={selectedTodo}
        setSelectedTodo={setSelectedTodo}
      />
    </div>
  )
}

export default Todos;