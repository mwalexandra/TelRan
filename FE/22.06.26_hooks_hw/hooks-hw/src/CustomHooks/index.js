import {useState} from 'react'

const useInput = (defaultValue) => {

  const [ value, setValue ] = useState(defaultValue);
  const reset = () => setValue(defaultValue);
  const bind = {
    value, 
    onChange: (e) => {
      setValue(e.target.value)}
  }

  return [ value, reset, bind ];
}

const useSelect = (defaultValue) => {

  const [ value, setValue ] = useState(defaultValue);
  const reset = () => setValue(defaultValue);
  const bind = {
    value, 
    onChange: (e) => {
      setValue(e.target.value)}
  }

  return [ value, reset, bind ];
}

const useCheckboxInput = (defaultValue) => {
  const [value, setValue] = useState(defaultValue);
  const bind = {
    value,
    onChange: (e) => setValue(!value),
    checked: value,
  }
  return [value, setValue, bind]
}

export default {useInput, useSelect, useCheckboxInput};