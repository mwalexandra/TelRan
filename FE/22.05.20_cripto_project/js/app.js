import getDataCurrency from "./api.js";
import renderCurrencyList from "./render.js";

const exchangeForm = document.querySelector('.exchange_form'),
      giveInput = document.getElementById('give-amount'),
      receiveInput = document.getElementById('receive-amount'),

      rateOutput = document.querySelector('.exchange_form__rate'),
      commissionOutput = document.querySelector('.exchange_form__commission'),

      formSubmit = document.querySelector('.exchange_form__submit'),
      formCheckbox = document.querySelector('.exchange_form__checkbox');

const isClient = false; 
let currencies;

getDataCurrency().then(result => changeCurrency(result)); // запрос к серверу

function changeCurrency(dataCurrency){
  renderCurrencyList (dataCurrency);
  getCurrencyList(dataCurrency);
}

function getCurrencyList(dataCurrency){
  currencies = dataCurrency.conversion_rates;
}

function getCalc(isClient){
  let commission = 1;
  if(isClient) commission = 0;

  return function (from, to, input){
    const coeff = calcCoeff(from, to);
    const changedMoney = coeff * input;
    const percent = (changedMoney / 100) * commission;
    return changedMoney - percent;
  }
}

function calcCoeff(from, to){
  return currencies[to]/currencies[from];
}

// Перенести в модуль js с обработчиками событий???
// giveCurrencySelect.addEventListener('change', function () {
//   const selectedGiveCurrency = this.value;
// })

// receiveCurrencySelect.addEventListener('change', function () {
//   const selectedReceiveCurrency = this.value;
// })

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
  const result = getCalc(isClient)('EUR', 'RUB', 500);
  console.log(result);
})

function recieve(giveValue, giveCurrency, receiveCurrency){
  // TODO
  return receiveValue;
}

// MODULS
function openInterfaceModal(){
  document.querySelector('.interface-modal').style.display = 'block';
}

function closeModal(){
  document.querySelector('.modal').style.display = 'none';
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