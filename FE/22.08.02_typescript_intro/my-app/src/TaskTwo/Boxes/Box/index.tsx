

function Box( box: any ){
  return (
    <>
      <h2>{box.type}</h2>
      <p>Животных в клетке: {box.animalsCount}</p>
    </>
    )
}

export default Box;