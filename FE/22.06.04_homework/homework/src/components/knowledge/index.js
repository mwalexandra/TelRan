import style from './index.module.css'

function Knowledge(props){
  let i = 0;

  return (
    <section className={style.knowledge}>
      <h1 className={style.heading}>Knowledge</h1>
      <ul className={style.list}>
        {
          props.subjects.map((item) => {
            if(i === props.colors.length) i = 0;
            return <li
                      className={style.item}
                      key={item}
                      style={{color:props.colors[i++]}}
                      >I know: {item}</li>
          })
        }
      </ul>
    </section>
  );
}

export default Knowledge;