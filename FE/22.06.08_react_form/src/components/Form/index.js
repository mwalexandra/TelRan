import { useState } from 'react';

import Select from '../../ui-kit/select';
import GroupRadioInput from '../../ui-kit/radioInput';
import CheckboxInput from '../../ui-kit/checkboxInput';
import Button from '../../ui-kit/buttons';

import FullName from './FullName';

const options = [
	{
		value:"Full stack",
		text:"Full stack",
	},
	{
		value:"Frontend",
		text:"Frontend",
	},
	{
		value:"Backend",
		text:"Backend",
	},
];

const radioContent = [
	{
		isLabel:true,
		textLabel:"2000$",
		inputName:"radio",
		inputId:"junior",
	},
	{
		isLabel:true,
		textLabel:"4000$",
		inputName:"radio",
		inputId:"middle",
	},
	{
		isLabel:true,
		textLabel:"6000$",
		inputName:"radio",
		inputId:"senior",
	},
];


function Form() {
	const [ fullName, setFullName ] = useState('');
  const [ selectValue, setSelectValue ] = useState('');
  const [ radioValue, setRadioValue ] = useState(0);
  const [ checkboxValue, setCheckboxValue ] = useState(false);


	function submitForm(event) {
		event.preventDefault();
		const formData = {
			fullName: fullName,
			select: selectValue,
			salary: radioValue,
		}
		console.log(formData);
	}

  return (
  	<form action="">

  		<FullName 
				fullName={fullName} 
  			setFullName={setFullName}
			/>

  		<Select 
				name="name" 
				options={options}
				selectValue={selectValue}
				setSelectValue={setSelectValue}
			/>

  		<GroupRadioInput
  			radioContent={radioContent}
				setRadioValue={setRadioValue}
  		/>

  		<CheckboxInput 
  			isLabel
  			textLabel="Согласны с обработкой данных?"
  			inputName="checkbox"
  			inputId="checkbox"
				checkboxValue={checkboxValue}
				setCheckboxValue={setCheckboxValue}
  		/>

  		<Button 
				btnType = "submit"
				btnText = "Submit"
				btnStyle = "submit"
				disabled={!checkboxValue}
  			buttonClick={submitForm}
			/>

  	</form>
  );
}

export default Form;