//import { useState } from 'react';

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

  return (
  	<form action="">

  		<FullName />

  		<Select name="name" options={options}/>

  		<GroupRadioInput
  			radioContent={radioContent}
  		/>

  		<CheckboxInput 
  			isLabel
  			textLabel="Согласны с обработкой данных?"
  			inputName="checkbox"
  			inputId="checkbox"
  		/>

  		<Button 
				btnType = "submit"
				btnText = "Submit"
			/>

  	</form>
  );
}

export default Form;