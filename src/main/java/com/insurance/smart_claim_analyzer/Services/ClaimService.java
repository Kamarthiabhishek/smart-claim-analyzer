package com.insurance.smart_claim_analyzer.Services;

import com.insurance.smart_claim_analyzer.Model.Claim;
import com.insurance.smart_claim_analyzer.Repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    private LocalDate dateola;
    private LocalTime timeola;

    public String addClaimService(Claim claim){
        try{

            claim.setDateola(dateola.toString());
            System.out.println("Date Set");
            claim.setTimeola(timeola.toString());
            System.out.println("Time Set");
            claimRepository.save(claim);
            System.out.println("Saved to DB");
            return claim.toString();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
