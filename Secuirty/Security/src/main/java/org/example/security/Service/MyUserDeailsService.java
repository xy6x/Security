package org.example.security.Service;

import lombok.RequiredArgsConstructor;
import org.example.security.Excepation.ApiExcepation;
import org.example.security.Model.User;
import org.example.security.Repository.AtuhRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDeailsService implements UserDetailsService {
    private  final AtuhRepository atuhRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=atuhRepository.findUserByUsername(username);
        if (user==null){
            throw  new ApiExcepation("Wrong userName or password");
        }
    return user;
    }
}
