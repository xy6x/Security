package org.example.security.Service;

import lombok.RequiredArgsConstructor;
import org.example.security.Model.User;
import org.example.security.Repository.AtuhRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AuthService {

    private final AtuhRepository atuhRepository;

    public List<User> getall(String us){
       User user= atuhRepository.findUserByUsername(us);
        if (user == null) {
            throw new ArithmeticException("not admin");

        }
      return   atuhRepository.findAll();
    }

    public void register(User user) {
        user.setRole("USER");
        String hash = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(hash);
        atuhRepository.save(user);
    }
}
