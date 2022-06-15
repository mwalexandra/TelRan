import {useEffect, useState} from 'react';
import TodoInput from './components/TodoInput'
import TodoList from './components/TodoList'
import StatusList from './components/StatusList'
import style from './style.module.css';

function Todos(){

  const [value, setValue] = useState('');
  const [todosList, setTodosList] = useState([]);
  const [toggleAll, setToggleAll] = useState(false);
  const [itemsLeft, setItemsLeft] = useState(0);

  useEffect(
    function completedAll(){
      todosList.forEach((todo) => {
        todo.completed = toggleAll;
      })
      toggleAll ? setItemsLeft(0) : setItemsLeft(todosList.length);
      setTodosList([...todosList]);
    }, [toggleAll]
  )

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

// для отображения отфильтрованных списков todos можно написать функцию фильтра и и вызывать ее с разным аргументов по клику по каждой из кнопок в меню