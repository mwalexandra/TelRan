// Объявляем переменные для получения HTML элементов
const exchangeForm = document.querySelector('.exchange_form'),
      giveInput = document.getElementById('give-amount'),
      receiveInput = document.getElementById('receive-amount'),
      giveCurrencySelect = document.getElementById('give_currency'),
      receiveCurrencySelect = document.getElementById('receive_currency'),
      rateOutput = document.querySelector('.exchange_form__rate'),
      commissionOutput = document.querySelector('.exchange_form__commission'),
      formSubmit = document.querySelector('.exchange_form__submit'),
      formCheckbox = document.querySelector('.exchange_form__checkbox');

export {
	exchangeForm, giveInput, receiveInput,
  giveCurrencySelect,receiveCurrencySelect,
  rateOutput, commissionOutput, formSubmit, 
  formCheckbox
};