package com.insurance.smart_claim_analyzer.Security;

import com.insurance.smart_claim_analyzer.Model.User;
import com.insurance.smart_claim_analyzer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUserId(username).orElseThrow(() ->
                new UsernameNotFoundException("Username not found " +username));

        List<SimpleGrantedAuthority> authorities = Arrays.stream(
                (user.getRole() == null ? "": user.getRole()).split(",")
        ).filter(s -> !s.isBlank())
                .map(String::trim)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                user.getUserid(),
                user.getPassword(),
                authorities
        );
    }
}
