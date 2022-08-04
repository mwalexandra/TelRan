interface CityProps {
  name: string, 
  country: string, 
  population: number, 
  europe: boolean | 'Yes' | 'No',
}

function CityComponent(props : CityProps){
  let europe = true;
  if(props.europe === 'No' || props.europe === false){
    europe = false
  }

  return (
    <>
      <h1 style={{color: 'green'}}>City</h1>
      <h2>Name: {props.name}</h2>
      <h2>Country: {props.country}</h2>
      <p>Population: {props.population}</p>
      {
        europe ? <p>Europe</p> : ''
      } 
    </>
  )
}

export default CityComponent;