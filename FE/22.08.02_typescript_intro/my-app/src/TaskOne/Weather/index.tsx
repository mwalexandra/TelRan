// Информация о погоде
interface WeatherProps {
  light: string,
  sky: string,
  cold: boolean,
  temperature: number,
}

function WeatherComponent (props : WeatherProps){

  return (
    <>
      <h1 style={{color: 'green'}}>Weather</h1>
      <h2>Temperature: {props.temperature}</h2>
      <h2>Light: {props.light}</h2>
      <p>Sky: {props.sky}</p>
      {
        props.cold ? <p>Cold!!!</p> : ''
      } 
    </>
  )
}

export default WeatherComponent;