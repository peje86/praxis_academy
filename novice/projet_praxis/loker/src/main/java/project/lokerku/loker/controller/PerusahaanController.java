package project.lokerku.loker.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.*;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


 
import project.lokerku.loker.messages.request.LoginForm;
import project.lokerku.loker.messages.request.SignUpForm;
import project.lokerku.loker.messages.response.JwtResponse;
import project.lokerku.loker.model.Role;
import project.lokerku.loker.model.RoleName;
import project.lokerku.loker.model.User;
import project.lokerku.loker.model.Perusahaans;
import project.lokerku.loker.model.Cities;

import project.lokerku.loker.repository.RoleRepository;
import project.lokerku.loker.repository.UserRepository;
import project.lokerku.loker.repository.PerusahaanRepository;

import project.lokerku.loker.security.jwt.JwtProvider;


// @CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/perusahaan")
public class PerusahaanController {
 
    @Autowired
    AuthenticationManager authenticationManager;
 
    @Autowired
    UserRepository userRepository;
 
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PerusahaanRepository perusahaanRepository;

 
    @Autowired
    PasswordEncoder encoder;
 
    @Autowired
    JwtProvider jwtProvider;
 
//auth user signup,signin


//////////////////////////perusahaan////////////////////////




        // 1.  memanggil semua perusahaan
  
@GetMapping("/tampilallperusahaan")//memanggil method tampil data
@PreAuthorize(" hasRole('USERA') or hasRole('USERB') or hasRole('ADMIN')")

public @ResponseBody List<Perusahaans> getAllPerusahaans() {  //products diambil dari tabel nama class di model
    return perusahaanRepository.findAll();
 }


//2.tampil data by id ke tabel database


@GetMapping("/perusahaanbyId/{id}")
@PreAuthorize("hasRole('USERA') or hasRole('ADMIN')")
public Optional<Perusahaans> idUser( @PathVariable Long id){
    return perusahaanRepository.findById(id);
}


// @GetMapping(path="/perusahaanById/{id}")//memanggil method tampil data
// @PreAuthorize(" hasRole('ADMIN')")

// public @ResponseBody Optional<Perusahaans> id(Long id) {  //products diambil dari tabel nama class di model
//     return perusahaanRepository.findById(id);
//  }


// @GetMapping("/perusahaanById/{id}")//tipe bio mahasiswaa
// @PreAuthorize(" hasRole('ADMIN')")
// public Optional<Perusahaans> idPerusahaans(Long id){
//     return perusahaanRepository.findById(id);
// }


//.3 menghapus isi data tabel byId


@DeleteMapping("/deleteperusahaan/{id}")//tidak menampilkan apapun
@PreAuthorize("hasRole('USERB') or hasRole('ADMIN')")
void deletePerusahaans(@PathVariable Long id){
    perusahaanRepository.deleteById(id);
}
 //4. merubah data pake PUT 


@PutMapping("/updateperusahaan/{id}")
@PreAuthorize("hasRole('USERB') or hasRole('ADMIN')")
//public User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

public Perusahaans updatePerusahaans(@RequestBody Perusahaans newPerusahaans, @PathVariable Long id) {
    return perusahaanRepository.findById(id).map(perusahaans -> {
        perusahaans.setNamaPerusahaan(newPerusahaans.getNamaPerusahaan());
       
      
        return perusahaanRepository.save(perusahaans);
    }) .orElseGet(() ->{
        newPerusahaans.setId(id);
        return perusahaanRepository.save(newPerusahaans);
    });
}




//5. post data perusahaan

@PostMapping("/tambahperusahaan")
@PreAuthorize("hasRole('USERB') or hasRole('ADMIN')")
public Perusahaans addPerusahaans(@RequestBody Perusahaans perusahaans){
    return perusahaanRepository.save(perusahaans);
}



// /////////////////////////////end product///////////////////


// ///////////////////////////stock barang//////////////////////

// @GetMapping ("/tampilallstock") //memanggil method tampil barang
// //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")

// public @ResponseBody List<Stoks> getAllStoks() {  //stockproduck diambil dari tabel nama class di model
//     return stokRepository.findAll();
// }


//  // post data stock

// @PostMapping("/jembut")
// //@PreAuthorize("hasRole('ADMIN')")
// public Stoks addStoks(@RequestBody Stoks stok){
//     return stokRepository.save(stok);
// }


}