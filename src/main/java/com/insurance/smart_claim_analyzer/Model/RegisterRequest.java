package com.insurance.smart_claim_analyzer.Model;

import lombok.Data;

@Data
public class RegisterRequest {

    private String userid;
    private String password;
    private String role;

}
