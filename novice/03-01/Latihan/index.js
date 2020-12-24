//mencoba akses dengan browser
var http = require('http');
var server = http.createServer(function (req, res) {
    res.end("Hi, selamat datang di nodejs");
});

server.listen(8080);

console.log("server running on http://localhost:8000");