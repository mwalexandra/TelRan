
import {useState} from 'react';
import style from './style.module.css'
import TodoList from './TodoList'
import AddTodo from './AddTodo'
import TodoListHeader from './TodoListHeader'
import TodoPanel from './TodoPanel'

function TodosContainer({lists, setLists, selectedList}) {

  const [activeTab, setActiveTab] = useState('Todo');
  const [showPanelTodo, setShowPanelTodo] = useState(false);

  return (
    <main className={style.todosContainer}>
      <section className={style.todosSection}>
        <TodoListHeader 
          lists={lists}
          setLists={setLists}
          selectedList={selectedList}
        />

        <div>
          <button
            className={`${style.todosBtn} ${activeTab === 'Todo' ? style.active : ''}`}
            onClick={() => setActiveTab('Todo')}
          >To Do</button>
          <button
            className={`${style.todosBtn} ${activeTab === 'Completed' ? style.active : ''}`}
            onClick={() => setActiveTab('Completed')}
          >Completed</button>
        </div>

        <TodoList 
          lists = {lists}  
          setLists = {setLists}
          activeTab = {activeTab}
          selectedList={selectedList}
          showPanelTodo={showPanelTodo}
          setShowPanelTodo={setShowPanelTodo}
        />

        <AddTodo 
        lists = {lists}  
        setLists = {setLists}
        showPanelTodo={showPanelTodo}
        setShowPanelTodo={setShowPanelTodo}
        />
      </section>

      <TodoPanel 
        showPanelTodo={showPanelTodo}
        setShowPanelTodo={setShowPanelTodo}
      />
    </main>
  )
}

export default TodosContainer;