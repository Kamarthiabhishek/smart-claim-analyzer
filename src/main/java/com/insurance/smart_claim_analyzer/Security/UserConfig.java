package com.insurance.smart_claim_analyzer.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        return new InMemoryUserDetailsManager(
                User.withUsername("Abhi")
                        .password(passwordEncoder.encode("Abhi123"))
                        .roles("USER")
                        .build(),

                User.withUsername("Admin")
                        .password(passwordEncoder.encode("Admin123"))
                        .roles("ADMIN")
                        .build()
        );
    }
}
