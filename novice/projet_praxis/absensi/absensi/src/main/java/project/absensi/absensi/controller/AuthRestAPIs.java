package praxis.loginrolejwt.loginRoleJwt.controller;


import java.util.HashSet;
import java.util.Set;
 
import javax.validation.Valid;
 
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
import org.springframework.web.bind.annotation.RestController;
 
import praxis.loginrolejwt.loginRoleJwt.messages.request.LoginForm;
import praxis.loginrolejwt.loginRoleJwt.messages.request.SignUpForm;
import praxis.loginrolejwt.loginRoleJwt.messages.response.JwtResponse;
import praxis.loginrolejwt.loginRoleJwt.model.Role;
import praxis.loginrolejwt.loginRoleJwt.model.RoleName;
import praxis.loginrolejwt.loginRoleJwt.model.User;
import praxis.loginrolejwt.loginRoleJwt.repository.RoleRepository;
import praxis.loginrolejwt.loginRoleJwt.repository.UserRepository;
import praxis.loginrolejwt.loginRoleJwt.security.jwt.JwtProvider;


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
          case "pegawai":
                Role pegawaiRole = roleRepository.findByName(RoleName.ROLE_PEGAWAI)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                roles.add(pegawaiRole);
                
            break;
          default:
              Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                  .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
              roles.add(userRole);              
          }
        });
        
        user.setRoles(roles);
        userRepository.save(user);
 
        return ResponseEntity.ok().body("User registered successfully!");
    }



}