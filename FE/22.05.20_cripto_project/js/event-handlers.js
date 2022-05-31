import {
  exchangeForm, giveInput,
  giveCurrencySelect,receiveCurrencySelect,
  formCheckbox, modalWrapper, modalClose, demonstrationLinks,
  loginBtns, logoutBtns,
} from './elements.js';

import {
  EXCHANGE_HEAD, EXCHANGE_MESSAGE, DEMO_HEAD, DEMO_MESSAGE,
  LOGIN_HEAD, LOGIN_MESSAGE, LOGOUT_HEAD, LOGOUT_MESSAGE,
} from "./consts.js";

import {userState, dataState} from "./state.js";

import {updateCurriency, exchange, callToModal, login} from "./app-main-functions.js"

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
  this.value = this.value.replace(/\D/, '');
  dataState.set('currentGive', this.value);
  updateCurriency();
})

exchangeForm.addEventListener('submit', function(event){ 
  event.preventDefault();
  if (dataState.get('isChecked')) {
    console.log('SUBMIT');
    exchange();
  } else {
    console.log('Чекни чекбокс сначала!');
  }
})

formCheckbox.addEventListener('change', function(){
  dataState.set('isChecked', this.checked);
})

modalClose.addEventListener('click', function(){
  modalWrapper.style.display = 'none';
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

