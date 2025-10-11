package com.insurance.smart_claim_analyzer.Controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class userController {

    @GetMapping("login")
    public String LoginController(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Login success \n Logged in as "+ authentication.getName()+" having role"+authentication.getAuthorities();
    }
}
