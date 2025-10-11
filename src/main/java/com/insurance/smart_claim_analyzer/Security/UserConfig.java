package com.insurance.smart_claim_analyzer.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        return new InMemoryUserDetailsManager(
                User.withUsername("Abhi")
                        .password("Abhi123")
                        .roles("USER")
                        .build(),

                User.withUsername("Admin")
                        .password("Admin123")
                        .roles("ADMIN")
                        .build()
        );
    }
}
