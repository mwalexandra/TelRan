import { ThemeContext } from '../../colors/theme.js';
import { useContext } from 'react';

function ThemeButton(){

  const theme = useContext(ThemeContext);

  return (
    <button 
      style={{ background: theme.background, color: theme.color }}
      type='submit'
    >Submit</button>
  )
}

export default ThemeButton;