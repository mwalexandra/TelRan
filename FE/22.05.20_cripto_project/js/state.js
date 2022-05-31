import {
  giveInput, giveCurrencySelect,
  receiveCurrencySelect, formSubmit, 
  applicationsSection,
} from './elements.js';

import {
  renderApplications,
} from "./render.js";


class State {
	constructor(object){
		for (let key in object) {
			this[key] = object[key];
			}
		}
		get(name){
			return getProp(this, name);
		}
		set(name, value){
			return setProp(this, name, value);
		}
	}

const userState = new State(
	{
		isClient: false,
	}
);

const dataState = new State(
	{
		currencies: [],
		selectedGiveCurrency: '',
		selectedReceiveCurrency: '',
		currentGive: '',
		isChecked: false,
	}
)

const calcState = new State(
	{
		objectCurriency: {
			outputMoney: 0,
			changedMoney: 0,
			coeff: 0,
			percent: 0,
		},
	}
)

function getProp(object, name){
	for (let key in object) {
		if (object[name] !== undefined) {
			return object[name];
		}
		if(typeof(object[key]) === 'object'){
			return getProp(object[key], name);
		}
	}
}

// наверное проверка на 67 строке неверна. может надо сравнивать key и name?
function setProp(object, name, value){
	for (let key in object) {  						// идет циклом о ключам свойств
		if (object[name] !== undefined) {      // если свойство, которое ищем, существует 
			return object[name] = value;				// то присвоит ему переданное значение
		}
		if(typeof(object[key] === 'object')){  // если тип значения текущего свойства - объект
			return setProp(object[key], name, value); // вызывает саму себя с этим объектом
		}
	}
}

// app state default
giveInput.disabled = true;
giveCurrencySelect.disabled = true;
receiveCurrencySelect.disabled = true;
formSubmit.disabled = true;

// applications state default
if (JSON.parse(localStorage.getItem('applications'))) {
	applicationsSection.style.display = 'block';
	renderApplications();
} else {
	applicationsSection.style.display = 'none';
}

export {userState, dataState, calcState};