// попугай, кенгуру, слон, волк, олень, заяц, рысь, бобер, жираф, еж
// хищники, травоядные, водоплавающие, летающие



function Box( {box}: any){

  return (
    <li>
      <h2>{box.type}</h2>
      <p>Животных в клетке: {box.animalsCount}</p>
    </li>
    )
}

export default Box;