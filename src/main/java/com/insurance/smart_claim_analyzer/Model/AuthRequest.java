package com.insurance.smart_claim_analyzer.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthRequest {

    private String userName;
    private String password;
}
