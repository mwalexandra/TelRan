
import {useState} from 'react';
import style from './style.module.css'
import TodoList from './TodoList'
import AddTodo from './AddTodo'
import TodoListHeader from './TodoListHeader'

function TodosContainer({todos, setTodos}) {

  const [activeTab, setActiveTab] = useState('Todo');

  return (
    <main className={style.todosContainer}>
      <section className={style.todosSection}>
        <TodoListHeader />
        <button
          className={`${style.todosBtn} ${activeTab === 'Todo' ? style.active : ''}`}
          onClick={() => setActiveTab('Todo')}
        >To Do</button>
        <button
          className={`${style.todosBtn} ${activeTab === 'Completed' ? style.active : ''}`}
          onClick={() => setActiveTab('Completed')}
        >Completed</button>
        <TodoList 
          todos = {todos}  
          setTodos = {setTodos}
          activeTab = {activeTab}
        />  
      </section>
      <AddTodo 
        todos = {todos}  
        setTodos = {setTodos}
      />
    </main>  
  )
}

export default TodosContainer;