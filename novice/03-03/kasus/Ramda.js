

//untuk inport ramda
var R = require("ramda");

//implemenasi dengan cek apakah foo adalah string
var isString = R.is(String);
var result = isString('foo'); //=> true
console.log("hasilnya adalah = ",result);