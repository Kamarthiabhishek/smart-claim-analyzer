package com.insurance.smart_claim_analyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
public class ClaimsController {

    @Autowired
    private ClaimService claimService;

    @PostMapping("/create")
    public Claims CreateClaim(@RequestBody Claims claims){
        return claimService.CreateClaims(claims);
    }
}
