//deklarasi fungsi
function latihan(){
    console.log("ini adalah latihan")
}
//deklarasi fungsi
latihan2 = function(){
    return "ini adalah latihan 2"
}

//eksekusi
function eksekusi(x,y){
    //undefinied
    console.log("ke 1 - ")
    x();
    console.log(`ke 2 - ${y()}`);
    //yang bisa jalan
    
}

eksekusi(latihan,latihan2)

//belajar menggunakan arrow func
//kotak
kotak = (sisi) =>{return sisi*sisi};

//ekseksusi
console.log(kotak(4));

//call stack berhenti karena rekursi tak berhenti
// function chicken(x) {
//     console.log(x++)
//     return egg(x);
//   }
//   function egg(x) {
//     console.log(x++)
//     return chicken(x);
//   }
//   console.log(chicken(1) + " came first.");
  // → ??

//optional argument
// tiak bisa overloading
function square(x,y=5){return x+y};
console.log(square(1,2))// tetap menjalankan func terakhir
function square(x=10) { return x + x }


console.log(square("hedgehog",3));//peram 1 akan dieksekusi pertama kali
console.log(square(1));//defaultl nya akan diisi 5 dan akan dijalankan func 2 param
console.log(square(1,2))

 
//recursion dengan nested
function findSolution(target) {
    function find(current, history) {
      if (current == target) {
        return history;
      } else if (current > target) {
        return null;
      } else {
        return find(current + 5, `(${history} + 5)`) ||
               find(current * 3, `(${history} * 3)`);
      }
    }
    return find(1, "1");
  }
  
  console.log(findSolution(32));

  //output beberapa char dalam string
 nama1 = "hamka";
 lain = 'h';
  if(nama1.charAt(0)== lain) console.log("true")
console.log(nama1.charAt(1))
