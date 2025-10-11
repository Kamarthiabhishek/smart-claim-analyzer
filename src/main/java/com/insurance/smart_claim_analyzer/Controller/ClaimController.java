package com.insurance.smart_claim_analyzer.Controller;

import com.insurance.smart_claim_analyzer.Model.Claim;
import com.insurance.smart_claim_analyzer.Services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController("/")
public class ClaimController {


    LocalDate date;
    LocalTime time;

    @Autowired
    private ClaimService claimService;


    @PostMapping("add/claim")
    public Claim addClaim(@RequestParam String polno, @RequestParam String lossdte){
        Claim createdClaim =  claimService.addClaimService(polno,lossdte);
        return createdClaim;
    }
}
