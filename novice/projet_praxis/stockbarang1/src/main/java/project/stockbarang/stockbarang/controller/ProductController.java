package project.stockbarang.stockbarang.controller;

import java.util.*;

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

import project.stockbarang.stockbarang.model.Role;
import project.stockbarang.stockbarang.model.Products;
import project.stockbarang.stockbarang.model.RoleName;
import project.stockbarang.stockbarang.model.User;
import project.stockbarang.stockbarang.repository.RoleRepository;
import project.stockbarang.stockbarang.repository.UserRepository;
import project.stockbarang.stockbarang.repository.ProductRepository;
import project.stockbarang.stockbarang.security.jwt.JwtProvider;


 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/product")
public class ProductController {
 
    @Autowired
    AuthenticationManager authenticationManager;
 
    @Autowired
    UserRepository userRepository;
 
    @Autowired
    RoleRepository roleRepository;
 
    @Autowired
    ProductRepository productRepository;
    
    @Autowired
    PasswordEncoder encoder;
 
    @Autowired
    JwtProvider jwtProvider;
 


    @GetMapping ("/allproduct") //memanggil method tampil data
public  java.util.List<Products> get_All() {  //bio guru diambil dari tabel nama class di model
    return productRepository.findAll();
}

//2.tampil data user by id ke tabel database

@GetMapping("/products/{id}")//tipe bio mahasiswaa
@PreAuthorize("hasRole('USERA') or hasRole('ADMIN')")
public Optional<Products> idProducts( @PathVariable Long id){
    return productRepository.findById(id);
}

//.3 menghapus isi data user



@DeleteMapping("/deleteproduct/{id}")//tidak menampilkan apapun
// @PreAuthorize(" hasRole('ADMIN')")
void deleteProducts(@PathVariable Long id){
    productRepository.deleteById(id);
}

//4. merubah data pake PUT 


@PutMapping("/updateproduct/{id}")
@PreAuthorize("hasRole('USERA') or hasRole('USERB') or hasRole('ADMIN')")
//public User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

public Products updateProducts(@RequestBody Products newProducts, @PathVariable Long id) {
    return productRepository.findById(id).map(products -> {
        products.setNamaProduct(newProducts.getNamaProduct());
        products.setNetto(newProducts.getNetto());
      
        return productRepository.save(products);
    }) .orElseGet(() ->{
        newProducts.setId(id);
        return productRepository.save(newProducts);
    });
}


//5. post data product

@PostMapping("/tambahproduct")
@PreAuthorize("hasRole('USERB') or hasRole('ADMIN')")
public Products addProducts(@RequestBody Products products){
    return productRepository.save(products);
}




}