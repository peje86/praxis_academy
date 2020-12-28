const isEven = function(x){
    if(x%2 == 0) return "True"
    if(x%2 == 1) return "False"
    return "??"
}

console.log(isEven(50));
// → true
console.log(isEven(75));
// → false
console.log(isEven(-1));
// → ??