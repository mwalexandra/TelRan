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


// получили данные? инициализируем приложение
// getDataCurrency().then(result => initialApp(result)); // получили данные от сервера и запустили инициализацию
// function initialApp(dataCurrency){ // инициализация приложения

//   currencies = dataCurrency.conversion_rates; // получили список валют и их значение

//   renderCurrencySelect(dataCurrency); // отрендерили selects
//   selectedGiveCurrency = giveCurrencySelect.value; // после рендеринга 
//   selectedReceiveCurrency = receiveCurrencySelect.value; // сохранили валюты в переменные
// }


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
  outputMoney = objectCurriency.outputMoney;
  changedMoney = objectCurriency.changedMoney;
  coeff = objectCurriency.coeff;
  percent = objectCurriency.percent;
  
  renderRate(selectedGiveCurrency, coeff, selectedReceiveCurrency);
  
  
  if (currentGive !== '') {
    // вывели итоговую сумму в receiveInput
    receiveInput.value = outputMoney;
    renderComission(percent, selectedReceiveCurrency);
    formSubmit.disabled = false;
  } else {
    formSubmit.disabled = true;
  }
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