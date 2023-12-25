package org.example.security.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.security.Model.User;
import org.example.security.Repository.AtuhRepository;
import org.example.security.Service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/autho")
@RequiredArgsConstructor

public class AuthoController {
private  final AuthService authService;
@GetMapping("/get/{su}")
public ResponseEntity getAll(@PathVariable String su){
    List<User> users=authService.getall(su);
   return ResponseEntity.status(HttpStatus.OK).body(users);
}
@PostMapping("/add")
private ResponseEntity register(@RequestBody @Valid User user){
    authService.register(user);
    return ResponseEntity.status(200).body("User register");
}
@PostMapping("/login")
public ResponseEntity login(){
    return ResponseEntity.status(200).body("login");
}
@PostMapping("/logout")
    public ResponseEntity logout(){
        return ResponseEntity.status(200).body("logout");
    }

}
