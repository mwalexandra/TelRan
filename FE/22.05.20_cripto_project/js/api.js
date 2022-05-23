
async function getDataCurrency() {
	let url = 'https://v6.exchangerate-api.com/v6/6d90771bf7d7e8bd09657c9a/latest/USD';
	let response = await fetch(url);
	return await response.json(); // читаем ответ в формате JSON
}

export default getDataCurrency;



 // https://v6.exchangerate-api.com/v6/6d90771bf7d7e8bd09657c9a/latest/USD