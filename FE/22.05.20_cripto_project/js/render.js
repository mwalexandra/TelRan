import {
  exchangeForm, giveInput, receiveInput,
  giveCurrencySelect,receiveCurrencySelect,
  rateOutput, commissionOutput, formSubmit, 
  formCheckbox
} from './elements.js';


// render currency options 
const addGiveCurrency = addOption(giveCurrencySelect);
const addReceiveCurrency = addOption(receiveCurrencySelect);
function addOption(select){
  return function(currency) {
    const option = document.createElement('option');
    option.textContent = currency;
    option.value = currency;
    select.appendChild(option);
  }
}
function renderCurrencySelect(dataCurrency) {
  Object.keys(dataCurrency.conversion_rates).forEach(currency => {
    addGiveCurrency(currency);
    addReceiveCurrency(currency);
  })
}

function renderRate(selectedGiveCurrency, coeff, selectedReceiveCurrency){
  rateOutput.innerHTML = `1 <span>${selectedGiveCurrency}</span> = ${coeff} <span>${selectedReceiveCurrency}</span>`;
}

function renderComission(percent, selectedReceiveCurrency){
  commissionOutput.innerHTML = `${percent} <span>${selectedReceiveCurrency}</span>`;
}


export {renderCurrencySelect, renderRate, renderComission};