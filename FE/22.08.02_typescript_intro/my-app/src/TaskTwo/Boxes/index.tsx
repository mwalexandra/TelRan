import Box from './Box'

interface zooBox {
  _id: number,
  type: string,
  animalsCount: number,
}

const zooBoxes: zooBox[] = 
[
  {
    _id: 1,
    type: 'Predators',
    animalsCount: 0,
  },
  {
    _id: 12,
    type: 'Herbivores',
    animalsCount: 0,
  },
  {
    _id: 13,
    type: 'Waterfowls',
    animalsCount: 0,
  },
  {
    _id: 14,
    type: 'Flyings',
    animalsCount: 0,
  }
]

// попугай, кенгуру, слон, волк, олень, заяц, рысь, бобер, жираф, еж
type Wolf = { eatMeat: () => void }
type Lynx = { eatMeat: () => void }

type Kangaroo = { eatHerbs: () => void }
type Elephant = { eatHerbs: () => void }
type Deer = { eatHerbs: () => void }
type Hare = { eatHerbs: () => void }
type Beaver = { eatHerbs: () => void }
type Giraffe = { eatHerbs: () => void }
type Hedgehog = { eatHerbs: () => void, eatMeat?: () => void }
type Parrot = { fly: () => void}

type Animal = Wolf | Lynx | Kangaroo | Elephant | Deer | Hare | Beaver | Giraffe | Hedgehog | Parrot

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