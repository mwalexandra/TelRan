import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link } from 'react-router-dom'
import TeamMember from './TeamMember'

function Team() {

  const team = [
    {
      name:'Alex', position:'Backend developer', path:'backend', cv:[1, 2, 3]
    },
    {
      name:'Petr', position:'Frontend developer', path:'frontend', cv:[6, 7, 8]
    },
    {
      name:'Sergey', position:'QA engineer', path:'qa', cv:[10, 12, 15]
    }
  ]

  return (
    <>
      <Routes>
        <Route path={`:itemPath/*`} element={<TeamMember team={team}/>} /> 
        <Route path='*' element={<TeamNav team={team}/> } /> 
      </Routes>
    </>
  )
}

function TeamNav({team}){
  return (
      <section>
        <h1>Команда</h1>
        <ul>
          {
            team.map((item) => (
                    <li
                      key={item.name}>
                      <Link to={`${item.path}`}>{item.position}</Link>
                    </li>
            ))
          }
        </ul>
      </section>
  )
}


export default Team;