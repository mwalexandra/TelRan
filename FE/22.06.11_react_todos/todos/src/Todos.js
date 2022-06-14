import {useEffect, useState} from 'react';
import TodoInput from './components/TodoInput'
import TodoList from './components/TodoList'
import StatusList from './components/StatusList'
import style from './style.module.css';


function Todos(){

  const [value, setValue] = useState('');
  const [todosList, setTodosList] = useState([]);
  const [toggleAll, setToggleAll] = useState(false);
  const [itemsLeft, setItemsLeft] = useState(todosList.length);

  useEffect(
    function completedAll(){
      todosList.forEach((todo) => {
        todo.completed = toggleAll;
      })
      toggleAll ? setItemsLeft(0) : setItemsLeft(todosList.length);
      setTodosList([...todosList]);
    }, [toggleAll]
  )

  // useEffect(
  //   function countItemsLeft(){
  //     let count = todosList.length;
  //     todosList.forEach((todo, count) => {
  //       if(todo.completed)
  //         count--;
  //     });
  //     setItemsLeft(count);
  //   }
  // )

    function addTodo(e){
      if(e.key === 'Enter'){
        todosList.push({
          id: Date.now(),
          title: value,
          completed: false,
        });
        setItemsLeft(itemsLeft+1);
        setTodosList([...todosList]);
        setValue('');
      }
    }

  return (
    <div className={style.todos}>
      <h1 className={style.todosHeading}>todos</h1>
      <TodoInput 
        value = {value}
        setValue = {setValue}
        addTodo = {addTodo}
        toggleAll={toggleAll}
        setToggleAll={setToggleAll}
      />
      <TodoList 
        todosList = {todosList}
        setTodosList = {setTodosList}
        itemsLeft = {itemsLeft}
        setItemsLeft = {setItemsLeft}
      />
      <StatusList
        todosList = {todosList}
        itemsLeft = {itemsLeft}
        setTodosList = {setTodosList}
      />
    </div>
  )
}

export default Todos;