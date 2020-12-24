package PengenKerjo.pengenkerjo.contoller;

import java.util.Optional;

import PengenKerjo.pengenkerjo.model.Users;
import PengenKerjo.pengenkerjo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;



@RestController
@RequestMapping("/users")
public class MainController {
    //autowired berfungsi membaca class dari file yg dipanggil
    @Autowired//mengambil class dari userrepository
    public UserRepository userRepository;

    //1. get all data users
    @GetMapping(path="/getAllUsers")
    public @ResponseBody Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }

    //2. get data by id versi hamka
    @GetMapping(path="/{id_user}")//path hanya berisi id didalam {}, berisi id tabel
public Optional<Users> idUser(@PathVariable Integer id_user){
    return userRepository.findById(id_user);
}

    //versi akbar  gagaaaal
// @GetMapping("/{id}")   
// Users userById(@PathVariable Integer id_user) {
//     return userRepository.findById(id_user).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
// }


    //3. post data ke database
    //untuk menampilkan post data di foreign key harus diisi dulu,
    // pendidikan diisi data dulu
    @PostMapping(path="/tambahUsers")
    public @ResponseBody Users addNewUsers (@RequestBody Users users){
       return  userRepository.save(users);
    }
    

    //4. menghapus isi data tabel byId

@DeleteMapping(path="/{id_user}")//tidak menampilkan apapun
void deleteUsers(@PathVariable Integer id_user){
    userRepository.deleteById(id_user);
}

    //5.update data

    @PutMapping("/{id_user}")// rubah data berdasarkan id_user sesuai nama tabel
    Users updateUsers(@RequestBody Users newUsers, @PathVariable Integer id_user){
        return userRepository.findById(id_user)
        .map(asu ->{  //class Users dianotasikan ke asu
            asu.setNamaUser(newUsers.getNamaUser()); // atribut asu dipanggil .(dibuka kmdian dirubah)
            asu.setEmailUser(newUsers.getEmailUser());
            return userRepository.save(newUsers);
        }).orElseGet(() -> {
            newUsers.setIdUser(id_user);
            return userRepository.save(newUsers);
        });
    }


}