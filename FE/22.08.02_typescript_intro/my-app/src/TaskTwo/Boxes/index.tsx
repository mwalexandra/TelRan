import Box from './Box'


interface zooBox {
  _id: number,
  type: string,
  animalsCount: number,
}

const zooBoxes: any[] = 
[
  {
    _id: 1,
    type: 'хищники',
    animalsCount: 0,
  },
  {
    _id: 12,
    type: 'травоядные',
    animalsCount: 0,
  },
  {
    _id: 13,
    type: 'водоплавающие',
    animalsCount: 0,
  },
  {
    _id: 14,
    type: 'летающие',
    animalsCount: 0,
  }
]

function Boxes(){  

    return <ul>
            {zooBoxes.map((box: zooBox) =>  (
              <Box 
                box={box}
                key={box._id} />
            ))}
          </ul>
}

export default Boxes;