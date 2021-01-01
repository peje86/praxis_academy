package contoh.pilihroles.memilihroles.contoller;

import contoh.pilihroles.memilihroles.exception.AppException;
import contoh.pilihroles.memilihroles.model.Role;
// import contoh.pilihroles.memilihroles.model.UserRole;
import contoh.pilihroles.memilihroles.model.User;
import contoh.pilihroles.memilihroles.payload.ApiResponse;
// import contoh.pilihroles.memilihroles.payload.JwtAuthenticationResponse;
// import contoh.pilihroles.memilihroles.payload.LoginRequest;
import contoh.pilihroles.memilihroles.payload.SignUpRequest;
import contoh.pilihroles.memilihroles.repository.RoleRepository;
import contoh.pilihroles.memilihroles.repository.UserRepository;
// import contoh.pilihroles.memilihroles.security.JwtAuthenticationFilter;
// import contoh.pilihroles.memilihroles.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    // @Autowired
    // AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    // @Autowired
    // PasswordEncoder passwordEncoder;

    // @Autowired
    // JwtTokenProvider tokenProvider;

 

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if(userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
                    HttpStatus.BAD_REQUEST);
        }

        if(userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
                    HttpStatus.BAD_REQUEST);
        }

        // Creating user's account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), signUpRequest.getPassword());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        Role userRole = roleRepository.findByName(Role.ROLE_USER)
                .orElseThrow(() -> new AppException("User Role not set."));

        user.setRoles(Collections.singleton(userRole));

        User result = userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/users/{username}")
                .buildAndExpand(result.getUsername()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
        
    }

}