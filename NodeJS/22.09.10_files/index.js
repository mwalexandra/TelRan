const fs = require('fs')

// // let res = fs.readFileSync('some.txt', 'utf-8') // синхронно
// fs.readFile('some.txt', 'utf-8', (err, data) => {
//   fs.writeFile('some.txt', data + '\nSome text', (err, data) => {
//     console.log('all worked');
//   })   
// }) // асинхронно


// работа с папками

// create 
// fs.mkdirSync('text-files')
// fs.mkdir('text-files', () => {
//   fs.writeFile('./text-files/some.txt', '\nHello', () => {})
// })

// delete 
fs.unlink('./text-files/some.txt', () => {
  fs.rmdir('./text-files', () => {})
})