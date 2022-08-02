import Box from './Box'

interface zooBox {
  _id: number,
  type: string,
  animalsCount: number,
}

function Boxes(boxes: any[]) {  

  return (
    boxes.map((box: zooBox) =>  {
      console.log(box);
      
      return <Box 
                box={box}
                key={box._id} />
    })
  )
}

export default Boxes;