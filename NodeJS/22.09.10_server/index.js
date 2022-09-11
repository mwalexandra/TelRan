const http = require('http')
const fs = require('fs')

let server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' })
  // res.end(`<h1>Hello Node JS</h1>`)
  if(req.url == '/')
    fs.createReadStream('./templates/index.html').pipe(res)
  else if (req.url == '/about')
    fs.createReadStream('./templates/about.html').pipe(res)
  else
  fs.createReadStream('./templates/error.html').pipe(res)
})

const PORT = 3000
const HOST = 'localhost' //127.0.0.1

server.listen(PORT, HOST, () => {
  console.log(`Server is runnung: http://${HOST}:${PORT}`);
})