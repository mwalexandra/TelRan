import {
  exchangeForm, giveInput,
  giveCurrencySelect,receiveCurrencySelect,
  formCheckbox, blur, modalClose, demonstrationLinks,
  loginBtns, logoutBtns, burgerOpenBtn, burgerCloseBtn, burgerMenu,
} from './elements.js';

import {
   DEMO_HEAD, DEMO_MESSAGE,
} from "./consts.js";

import {dataState} from "./state.js";

import {updateCurriency, exchange, callToModal, login} from "./app-main-functions.js";

import {inputNumberValidate, submitValidate} from "./validate.js";

// Обработчики событий
giveCurrencySelect.addEventListener('change', function () {
  dataState.set('selectedGiveCurrency', this.value);
  updateCurriency();
})

receiveCurrencySelect.addEventListener('change', function () {
  dataState.set('selectedReceiveCurrency', this.value);
  updateCurriency();
})

giveInput.addEventListener('input', function(){
  if(this.value[0] === '0' && this.value.length > 1){
    this.value = this.value.slice(1);
  }
  this.value = inputNumberValidate(this.value);
  dataState.set('currentGive', this.value);
  updateCurriency();
})

exchangeForm.addEventListener('submit', function(event){ 
  event.preventDefault();
  if (submitValidate()) {
    exchange();
  }
})

formCheckbox.addEventListener('change', function(){
  dataState.set('isChecked', this.checked);
})

modalClose.addEventListener('click', function(){
  blur.style.display = 'none';
})

demonstrationLinks.forEach(link => {
  link.addEventListener('click', (event) => {
    event.preventDefault();
    callToModal(DEMO_HEAD, DEMO_MESSAGE);
  })
})

// LOGIN LOGOUT
loginBtns.forEach(btn => {
  btn.addEventListener('click', () => {
    login(true);
  })
}) 

logoutBtns.forEach(btn => {
  btn.addEventListener('click', () => {
    login(false);
  })
}) 

// burger
burgerOpenBtn.addEventListener('click', e => {
  e.preventDefault();
  burgerMenu.style.display = 'block';
  blur.style.display = 'block';
})

burgerCloseBtn.addEventListener('click', e => {
  burgerMenu.style.display = 'none';
  blur.style.display = 'none';
})
