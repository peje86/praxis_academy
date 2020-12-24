//menampilkan 
// const heading = document.querySelector('sapa').onclick
// heading.textContent='Hello World'


document.querySelector(".sapa").onclick = function() {
    alert('Ouch! Stop poking me!'); 
}

function show(){
    alert('ini hasilnya')
    //marubah elemen lailn
    document.querySelector("h1").innerHTML="ini hasil perubahan dari show"
}