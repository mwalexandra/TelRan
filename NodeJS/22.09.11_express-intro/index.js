const express = require('express')
const app = express()

app.get('/', (req, res) => {
  res.send('This is homepage')
})

app.get('/about', (req, res) => {
  res.send('About us')
})
// динамический url
app.get('/user/:username/:id', (req, res) => {
  res.send(`User ID: ${req.params.id}. User name: ${req.params.username}`)
})

app.listen(3000, () => {
  console.log('Server started: http://localhost:3000');
})