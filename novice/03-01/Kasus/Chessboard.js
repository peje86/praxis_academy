
var temp = ""
for (let index = 1; index <= 5; index++) {
    for (let index2 = 1; index2 <= 5; index2++) {
                
        if ((index+index2)%2 === 0) {
            //console.log("#"+" ");
            temp = temp+" #";
            if(Math.round(5/2) == index && index2 == 5)
            temp = temp+"*"
        }
        else{
            //console.log(" ")
            temp = temp+"  ";
        }

    }
    console.log(temp);
    temp = "";
}