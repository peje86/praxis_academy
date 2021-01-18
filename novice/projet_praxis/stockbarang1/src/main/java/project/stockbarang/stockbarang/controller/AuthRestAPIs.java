package project.stockbarang.stockbarang.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.access.prepost.PreAuthorize;


 
import project.stockbarang.stockbarang.messages.request.LoginForm;
import project.stockbarang.stockbarang.messages.request.SignUpForm;
import project.stockbarang.stockbarang.messages.response.JwtResponse;
import project.stockbarang.stockbarang.model.Role;
import project.stockbarang.stockbarang.model.RoleName;
import project.stockbarang.stockbarang.model.User;
// import project.loker.loker.model.Lokers;
// import project.loker.loker.model.Perusahaans;
// import project.loker.loker.repository.LokerRepository;
// import project.loker.loker.repository.PerusahaanRepository;
import project.stockbarang.stockbarang.repository.RoleRepository;
import project.stockbarang.stockbarang.repository.UserRepository;

import project.stockbarang.stockbarang.security.jwt.JwtProvider;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthRestAPIs {
 
    @Autowired
    AuthenticationManager authenticationManager;
 
    @Autowired
    UserRepository userRepository;
 
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;
 
    @Autowired
    JwtProvider jwtProvider;
 
//auth user signup,signin


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {
 
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
 
        SecurityContextHolder.getContext().setAuthentication(authentication);
 
        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtResponse(jwt));
    }
 
    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpForm signUpRequest) {
        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity<String>("Fail -> Username is already taken!",
                    HttpStatus.BAD_REQUEST);
        }
 
        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<String>("Fail -> Email is already in use!",
                    HttpStatus.BAD_REQUEST);
        }
 
        // Creating user's account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), encoder.encode(signUpRequest.getPassword()));
 
        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();
 
        strRoles.forEach(role -> {
          switch(role) {
          case "admin":
            Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
            roles.add(adminRole);
            
            break;
          case "usera":
                Role useraRole = roleRepository.findByName(RoleName.ROLE_USERA)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                roles.add(useraRole);
                
            break;
            case "userb":
            Role userbRole = roleRepository.findByName(RoleName.ROLE_USERB)
              .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
            roles.add(userbRole);
            
        break;
          default:
              Role userRole = roleRepository.findByName(RoleName.ROLE_PEGAWAI)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
              roles.add(userRole);              
          }
        });
        
        user.setRoles(roles);
        userRepository.save(user);
 
        return ResponseEntity.ok().body("User registered successfully!");
    }


    @GetMapping ("/alluser") //memanggil method tampil data
public  java.util.List<User> get_All() {  //bio guru diambil dari tabel nama class di model
    return userRepository.findAll();
}

//2.tampil data user by id ke tabel database

@GetMapping("/user/{id}")//tipe bio mahasiswaa
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
public Optional<User> idUser( @PathVariable Long id){
    return userRepository.findById(id);
}

//.3 menghapus isi data user



@DeleteMapping("/deleteuser/{id}")//tidak menampilkan apapun
// @PreAuthorize(" hasRole('ADMIN')")
void deleteUser(@PathVariable Long id){
    userRepository.deleteById(id);
}

//4. merubah data pake PUT 


@PutMapping("/updateuser/{id}")
@PreAuthorize("hasRole('USERA') or hasRole('USERB') or hasRole('ADMIN')")
//public User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

public User updateUser(@RequestBody User newUser, @PathVariable Long id) {
    return userRepository.findById(id).map(users -> {
        users.setName(newUser.getName());
        users.setEmail(newUser.getEmail());
        users.setUsername(newUser.getUsername());
        users.setPassword(newUser.getPassword());
        users.setAlamat(newUser.getAlamat());
        users.setTelepon(newUser.getTelepon());
        users.setIdPegawai(newUser.getIdPegawai());
        return userRepository.save(users);
    }) .orElseGet(() ->{
        newUser.setId(id);
        return userRepository.save(newUser);
    });
}



// //5. post data product

// @PostMapping("/tambahproduct")
// //@PreAuthorize("hasRole('ADMIN')")
// public Products addProducts(@RequestBody Products products){
//     return productRepository.save(products);
// }



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