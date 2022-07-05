import { useParams, Link, Routes, Route } from 'react-router-dom'

function TeamMember({ team }) {
  const { itemPath } = useParams();

  const teamMember = team.find(item => item.path === itemPath);


  return (
    <>
      <section>
        <h1>Name: {teamMember.name}</h1>
        <h3>Position: {teamMember.position}</h3>
      </section>
      <section>
        <h1>
          CV: 
          <ul>
            {
              teamMember.cv.map(item => (
                
                <li
                  key={item}>
                  <Link to={`${item}`}>{item}</Link>
                </li>
              ))
            }
          </ul>
          <Routes>
            <Route path=':cvId' element={<CV teamMember={teamMember}/>}/>
          </Routes>
        </h1>
      </section>
      <Link to='/team'>Team list</Link>
    </>
  )
}

function CV({teamMember}){
  const { cvId } = useParams();

  const cv = teamMember.cv.find(item => item == cvId);

  console.log(teamMember.cv);

  return (
    <p>
      CV number 
      {cv}
    </p>
  )
}


export default TeamMember;