package com.insurance.smart_claim_analyzer.Controller;

import com.insurance.smart_claim_analyzer.Model.Claim;
import com.insurance.smart_claim_analyzer.Services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ClaimController {

    @Autowired
    private ClaimService claimService;


//    @GetMapping("demo")
//    public String demoController(){
//        return "All good";
//    }

    @PostMapping("add/claim")
    public void addClaims(@RequestBody Claim claim){
        claimService.addClaimService(claim);
    }
}
