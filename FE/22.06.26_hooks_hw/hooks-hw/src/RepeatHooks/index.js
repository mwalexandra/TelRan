import { useEffect, useState, useRef, useMemo } from 'react'
import style from './style.module.css'
import ThemeButton from './ThemeButton'
import {theme, ThemeContext} from '../colors/theme.js'
import {useInput, useSelect, useCheckboxInput} from '../CustomHooks'

function RepeatHooks() {

	// useState

	// 1 возьмите под контроль react этои jsx элементы (input text, select, input checkbox) c помощью useState
	// 2 вместо отправки формы по submit отобразите в элементе c классом show значения элементов формы

  const [ inputValue, resetInputValue, bindInputValue ] = useInput('');
  const [ selectValue, resetSelectValue, bindSelectValue  ] = useSelect('dark');
  const [ checkboxValue, setCheckboxValue, bindCheckboxValue ] = useCheckboxInput(false);

  const [ shownValues, setShownValues] = useState(false);

  function submit(e){
    e.preventDefault();
    setShownValues(true);
  }

	// useEffect
	// 1 при изменении text input отобразите его значение в document.title браузера

  useEffect(
    function(){
      document.title = `${inputValue}`
    }, [inputValue]
  )

	// useContext
	// создайте файл с цветовой темой 
	// theme={dark:{color:white,background:black},light:{color:black,background:gray}}
	// вынесите button в отдельный компонент и используйте контекст, чтобы менять её style
	// смена value у Context.Provider должна происходить в зависимости от выбора темы в select


	// useRef
	// при клике на label поместите фокус в text input, не используя htmlFor

  const inputRef = useRef(null);
  const onLabelClick = () => {
    inputRef.current.focus();
  }

	// useMemo
	// в элемент с классом increment отобразите количество изменений(onChange) 
	// мемоизируйте функцию расчета изменений, исключив из неё события изменения чекбокса

  const [changeCalc, setChangeCalc] = useState(0);

  useMemo(() => {
      setChangeCalc(changeCalc+1);
    }, [inputValue, selectValue]
  )

  useMemo(() => {
    setShownValues(false);
    }, [inputValue, selectValue, checkboxValue]
  )

	// custom hooks
	// придумайте или найдите в сети возможности улучшить ваш код с помощью кастомных хуков

	return (
		<>
			<form
        className={style.form}
        onSubmit={(e) => submit(e)}
      >

				<label
          className={style.inputTextLabel}
          onClick={onLabelClick}
        >input</label>
				<input 
          {...bindInputValue}
          type="text" 
          className={style.inputText}
          ref = {inputRef}
        />

        <ThemeContext.Provider value={theme[selectValue]}>
          <select
            className={style.select}
            {...bindSelectValue}
          >
            <option value="dark">dark</option>
            <option value="light">light</option>
          </select>  

				<input 
          type='checkbox' 
          className={style.inputCheckbox}
          {...bindCheckboxValue}
          />

          {/* <ThemeContext.Consumer> */} 
            <ThemeButton 
              onClick={(e) => submit(e)}
            />
          {/* </ThemeContext.Consumer>   */}
        </ThemeContext.Provider>  

			</form>


			<div 
        className={style.increment}
      >{ changeCalc }</div>


			<div className={`${style.show} ${shownValues ? style.isShown : ''}`}>
				{
          `input: ${inputValue}, select: ${selectValue}, checkbox: ${checkboxValue}`
				}
			</div>

		</>

	)

}

export default RepeatHooks;
