package com.insurance.smart_claim_analyzer.Model;

import com.insurance.smart_claim_analyzer.ENUMS.PaymentFrequency;
import com.insurance.smart_claim_analyzer.ENUMS.PolicyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int polNo;

    private String policyType; //Health, Vehicle, Life, Home
    private String policyHolderName;
    private LocalDate dob;
    private int age;
    private String gender;
    private String address;
    private String contact;
    private String email;

    //Policy Duration fields
    private LocalDate startDate;
    private LocalDate endDate;
    private int tenureYears;

    //Policy Financial Details
    private Double sumInsured; //max amount covered
    private Double premAmount; //premium amount to be paid

    @Enumerated(EnumType.STRING)
    private PaymentFrequency paymentFrequency;
    private LocalDateTime lastPaid;

    //Coverage details
    private String coverageType; //Accident, Health ,theft
    private String coverageDescription;
    private Double coverageLimit;

    //Policy status
    @Enumerated(EnumType.STRING)
    private PolicyStatus policyStatus;

    //metadata
    private LocalDate dateOla;
    private LocalTime timeOla;
}
