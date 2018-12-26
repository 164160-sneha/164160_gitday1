var express = require('express');
var app = express();
app.get('/year', function(req, res){
var age=req.query.age;
var date=new Date();
var currentYear= date.getFullYear();
var diff = currentYear-age;
   res.send('You were born in ' +diff);
});
app.listen(3000);