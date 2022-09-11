// встроенный модуль 
// информация о пользователе. 
const os = require('os')
let res = os.platform()
console.log(res);

// кастомный модуль
const my_math = require('./my_math')
console.log(my_math.add(3,6))
console.log(my_math.minus(3,6))