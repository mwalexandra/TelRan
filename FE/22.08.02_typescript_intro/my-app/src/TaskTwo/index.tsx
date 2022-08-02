// Домашнее задание 2
import Boxes from './Boxes'

const zooBoxes = [
  {
    id: 1,
    type: 'хищники',
    animalsCount: 0,
  },
  {
    id: 12,
    type: 'травоядные',
    animalsCount: 0,
  },
  {
    id: 13,
    type: 'водоплавающие',
    animalsCount: 0,
  },
  {
    id: 14,
    type: 'летающие',
    animalsCount: 0,
  }
]

function TaskTwo(){

  return (
    <>
        <Boxes boxes={zooBoxes}/>
    </>
  )
}

export default TaskTwo;