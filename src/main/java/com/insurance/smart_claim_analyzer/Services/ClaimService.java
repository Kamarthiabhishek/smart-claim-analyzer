package com.insurance.smart_claim_analyzer.Services;

import com.insurance.smart_claim_analyzer.Model.Claim;
import com.insurance.smart_claim_analyzer.Repository.ClaimRepository;
import com.insurance.smart_claim_analyzer.Utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private Utils utils;

    public Claim addClaimService(String polno, String lossdte){

        //Create new claim
        Claim claim = new Claim(polno,lossdte);

        //set the values
        claim.setDateola(utils.dateola.toString());
        claim.setTimeola(utils.timeola.toString());
        claim.setNotifdte(utils.notifdte.toString());
        claim.setStatus("O");

        //auto generate claim number
        int claimNo = utils.generateNumber();
        claim.setClmno(String.valueOf(claimNo));

        //save the claim details
        claimRepository.save(claim);

        System.out.println("Claim created successfully"+claim);
        return claim;
    }

}