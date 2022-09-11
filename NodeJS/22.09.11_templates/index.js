const express = require('express')
const app = express()

app.set('view engine', 'ejs')
app.use(express.urlencoded({ extended: false }))
app.use(express.static('public'))

app.get('/', (req, res) => {
  // res.sendFile(__dirname + '/index.html') // без шаблонизатора
  res.render('index')
})

app.get('/about', (req, res) => {
  res.render('about')
})

// динамический url
app.get('/user/:username', (req, res) => {
  let data = {
    username: req.params.username,
    hobbies: [ 'Football', 'Skate', 'Travel' ]
  }
  res.render('user', data)
})

app.post('/check-user', (req, res) => {
  const username = req.body.username
  if(username == "")
    return res.redirect('/')
  else 
    return res.redirect('/user/' + username)
})

app.listen(3000, () => {
  console.log('Server started: http://localhost:3000');
})