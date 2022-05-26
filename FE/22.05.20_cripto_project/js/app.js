import {
  exchangeForm, giveInput, receiveInput,
  giveCurrencySelect,receiveCurrencySelect,
  rateOutput, commissionOutput, formSubmit, 
  formCheckbox
} from './elements.js';
import getDataCurrency from "./api.js";
import {
  renderCurrencySelect, 
  renderRate, 
  renderComission
} from "./render.js";
import calculateСurriency from "./calc.js";

// states
// user state
let isClient;

// data state
let currencies;
let selectedGiveCurrency;
let selectedReceiveCurrency;
let currentGive = giveInput.value;
let isChecked;

// calc state
let objectCurriency;
let outputMoney;
let changedMoney;
let coeff;
let percent;

// app state
giveInput.disabled = true;
giveCurrencySelect.disabled = true;
receiveCurrencySelect.disabled = true;
formSubmit.disabled = true;


// LOCALSTORAGE
let applications = JSON.parse(localStorage.getItem('applications'));

function createNewApplication(currentGive, selectedGiveCurrency, outputMoney, selectedReceiveCurrency) {
  const application = {
    date: Date.now(),
    currentGive,
    selectedGiveCurrency,
    outputMoney,
    selectedReceiveCurrency,
  }
  return application;
}

function addNewApplication(){
  const application = createNewApplication(currentGive, selectedGiveCurrency, outputMoney, selectedReceiveCurrency);
  applications.unshift(application);
  if(applications.length > 4){
    applications.pop();
  }
  console.log(applications);
  localStorage.setItem('applications', JSON.stringify(applications));
}


initialApp();
async function initialApp(){ // инициализация приложения
  const dataCurrency = await getDataCurrency();
  currencies = dataCurrency.conversion_rates; // получили список валют и их значение
  renderCurrencySelect(dataCurrency); // отрендерили selects
  selectedGiveCurrency = giveCurrencySelect.value; // после рендеринга 
  selectedReceiveCurrency = receiveCurrencySelect.value; // сохранили валюты в переменные

  giveInput.disabled = false;
  giveCurrencySelect.disabled = false;
  receiveCurrencySelect.disabled = false;
}

function updateCurriency() {
  
  const getObjectCurriency = calculateСurriency(isClient); // замкнули calc curriency функцию c статусом клиента 
  objectCurriency = getObjectCurriency(selectedGiveCurrency, selectedReceiveCurrency, currentGive, currencies); // получили объект calc

  // обновили calc state
  const calcState = updateCalcState();
  renderRate(selectedGiveCurrency, calcState[2], selectedReceiveCurrency);
  
  if (currentGive !== '') {
    // вывели итоговую сумму в receiveInput
    receiveInput.value = calcState[0];
    renderComission(calcState[3], selectedReceiveCurrency);
    formSubmit.disabled = false;
  } else {
    formSubmit.disabled = true;
  }
}

function updateCalcState(){
  outputMoney = objectCurriency.outputMoney;
  changedMoney = objectCurriency.changedMoney;
  coeff = objectCurriency.coeff;
  percent = objectCurriency.percent;
  return [outputMoney, changedMoney, coeff, percent];
}

// Обработчики событий
giveCurrencySelect.addEventListener('change', function () {
  selectedGiveCurrency = this.value;
  // так же валидация нужна полю currentGive
  updateCurriency();
})

receiveCurrencySelect.addEventListener('change', function () {
  selectedReceiveCurrency = this.value;
  // так же валидация нужна полю currentGive
  updateCurriency();
})

giveInput.addEventListener('input', function(){
  this.value = this.value.replace(/\D/, '');
  // так же валидация нужна полю currentGive
  currentGive = this.value;
  updateCurriency();
})

// submit и checkbox
exchangeForm.addEventListener('submit', function(event){
  event.preventDefault();
  if(isChecked){
    console.log('SUBMIT');
    addNewApplication();
  } else {
    console.log('You have to check');
    // нужна будет валидация
    // ее нужно будет ввести в validation.js
  }
  // так же валидация нужна полю currentGive
})

formCheckbox.addEventListener('change', function(){
   isChecked = this.checked; 
})