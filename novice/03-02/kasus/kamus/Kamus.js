//kamus dengan mencarui kata dengan artinya
//menambahkan kata dan artinya
//menghapus kata dan artinya

console.log("KAMUS\n 1. Cari\n 2. Tambah\n 3. Hapus")

let kamus = new Map();
//var index = prompt("masukkan nilai anda")

function cari(params){
    return alert(kamus.get(params));
    
}

function tambah(params,params2) {
    kamus.set(params,params2) 
    return alert("sukses menambahkan")   
}

function hapus(params){
    kamus.delete(params)
    return alert("sukses menghapus")
}
