package com.cyb.security;

import com.cyb.entity.User;
import com.cyb.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private UserRepository userRepository;



    public UserPrincipalDetailsService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);

        if(user==null){
            throw new UsernameNotFoundException("user does not exist");
        }

        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}
