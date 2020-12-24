
//let myVariable = Number(prompt("pick a number"));
//input data statis
let myVariable = 11;
console.log(myVariable)
//menampilkan nilai langsung
temp = `half of 100 is ${100/2}`
console.log(temp);

//membuat object dengan array
let name = [1,"pujiono", 0.2]
//tampil tipe data tiap index
console.log("tampil semua nilai dari name = " + name);
for (let index = 0; index < name.length; index++) {
    console.log( `menampilkan tipe tiap data dengan array index ke ${index} = type ${typeof(name[index])} dengan nilainya = `+name[index]);
    
}
//tampil data array
console.log("tampil tipe dari array = "+typeof(name));
//menambahkan nilai dengan push
name.push("setengah")
console.log("tammpil semua nilai setelah di push = "+name);
//membuang array yang pertama
name.shift();
console.log("tammpil semua nilai setelah di push = "+name);
//menyisispka di array ke 0 dan semua digeser ke +1
name.unshift("ini shift");
console.log("tammpil semua nilai setelah di push = "+name);

num = [1,2,3]
bebas=[];
//mengalika tiap isi index
bebas = num.map((i)=>{
   return i*3;
})
console.log(bebas);
//contoh tidak bisa auto literasi
bebas2=num*3;
console.log(bebas2)
console.log(Math.round(5/2));

//constructor
console.log('ini adalah constructor = '+ name.constructor)