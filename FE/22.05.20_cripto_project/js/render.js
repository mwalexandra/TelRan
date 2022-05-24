const giveCurrencySelect = document.getElementById('give_currency'),
      receiveCurrencySelect = document.getElementById('receive_currency');

function addOption(select){
  return function(currency) {
    const option = document.createElement('option');
    option.textContent = currency;
    option.value = currency;
    select.appendChild(option);
  }
}

const addGiveCurrency = addOption(giveCurrencySelect);
const addReceiveCurrency = addOption(receiveCurrencySelect); 

function renderCurrencyList (dataCurrency){
  Object.keys(dataCurrency.conversion_rates).forEach(currency => {
    addGiveCurrency(currency);
    addReceiveCurrency(currency);
  })
}

export default renderCurrencyList;
