function CountBs(x){
    x = x.toUpperCase();
    count = 0;    
    for (let index = 0; index < x.length; index++) {
        if(x.charAt(index)== "B") count=count+1;
    }
    return count
}

function CountChar(x,y){
    x = x.toUpperCase();
    y = y.toUpperCase();
    count = 0;    
    for (let index = 0; index < x.length; index++) {
        if(x.charAt(index)== y) count=count+1;
    }
    return count
}

console.log(CountBs("BBC"));
// → 2
console.log(CountChar("kakkerlak", "k"));
// → 4