import getDataCurrency from "./api.js";

const exchangeForm = document.querySelector('.exchange_form'),
      giveInput = document.getElementById('give-amount'),
      receiveInput = document.getElementById('receive-amount'),

      giveCurrencySelect = document.getElementById('give_currency'),
      receiveCurrencySelect = document.getElementById('receive_currency'),

      rateOutput = document.querySelector('.exchange_form__rate'),
      commissionOutput = document.querySelector('.exchange_form__commission'),

      formSubmit = document.querySelector('.exchange_form__submit'),
      formCheckbox = document.querySelector('.exchange_form__checkbox');

getDataCurrency().then(result => changeCurrency(result)); // запрос к серверу

function changeCurrency(dataCurrency){
  const currencyList = Object.keys(dataCurrency.conversion_rates);
  currencyList.forEach(currency => {
    addGiveCurrency(currency);
    addReceiveCurrency(currency);
  })
}

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


giveCurrencySelect.addEventListener('change', function () {
  const selectedGiveCurrency = this.value;
})

receiveCurrencySelect.addEventListener('change', function () {
  const selectedReceiveCurrency = this.value;
})

giveInput.addEventListener('input', function(){
  const currentGive = this.value;
})

// receiveInput.addEventListener('input', function(){
//   const currentReceive = this.value;
// })

// rateOutput
//commissionOutput

formCheckbox.addEventListener('change', function(){
   const isChecked = this.checked; 
})

exchangeForm.addEventListener('submit', function(event){
  event.preventDefault();
})

function recieve(giveValue, giveCurrency, receiveCurrency){
  // TODO
  return receiveValue;
}

/* 
1. Берем value из giveInput и selected валюта1 и валюта2 из CurrencySelect
2. Достаем из объекта result.conversion_rates стоимость валюты1 и валюты2
3. Считаем: value * курс валюты1 / курс валюты2
4. Выводим в receiveInput результат

5. Рассчет суммы для 8 других валют (секция Treasury)
  5.1 Достаем из объекта result.conversion_rates в массив стоимость валюты1, валюты2, валюты3, валюты4, валюты5, валюты6, валюты7, валюты8
  5.2 Считаем: value * курс валюты1 / курс валюты2
6. Берем все элементы <li class="treasury__list_item"> </li>
7. Для каждого элемента массива (forEach) достаем .treasury__receive_currency, .treasury__sum, .treasury__give_currency и складываем туда сответственно 
    валюту из CurrencySelect (пункт 1), результат рассчета (5.2) и валюту1, 2, 3...

8. Секция Latest applications. Создаем новый объект <li class="applications__list_item"></li>
  8.1 Кладем внутрь HTML             
      <p class="applications_list_item_time">ДАТА ОПЕРАЦИИ</p>
      <p class="applications__give_currency"> VALUE из giveInput
        <span>ИМЯ валюты из giveCurrencySelect</span>
      </p>
      <span><img src="./img/Icons.svg" alt=""></span>
      <p class="applications__received_currency">VALUE из recieveInput
        <span>ИМЯ валюты из recieveCurrencySelect</span>
      </p>
  8.2 Prepend в applications__list
  8.3 Пятый элемент листа удаляем                            ---- ???
*/