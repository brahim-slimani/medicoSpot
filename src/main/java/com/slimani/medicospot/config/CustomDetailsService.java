package com.slimani.medicospot.config;

import com.slimani.medicospot.dao.UserRepository;
import com.slimani.medicospot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findUserByUsername(s);

        if (user == null){
            throw new UsernameNotFoundException(s);
        }

        return new CustomUserDetails(user);
    }
}
