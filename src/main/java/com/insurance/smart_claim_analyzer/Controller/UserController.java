package com.insurance.smart_claim_analyzer.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class UserController {

    @GetMapping("login")
    public String publicAccess() {
        return """
               <h2>Welcome to Security Demo</h2>
               <p>Please <a href='/login'>login here</a></p>
               """;
    }

    @GetMapping("user")
    public String userController(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Login success \n Logged in as "+ authentication.getName()+" having role"+authentication.getAuthorities();
    }

    @GetMapping("admin")
    public String adminController(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Login success \n Logged in as "+ authentication.getName()+" having role"+authentication.getAuthorities();
    }

    @GetMapping("error")
    public ResponseEntity<String> ErrorScreen(HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Access Denied");
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello";
    }
}
