package com.insurance.smart_claim_analyzer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Claim {
    @Id
    private String clmno;
    private String dateola;
    private String timeola;
    private String polno;
    private String lossdte;
    private String notifdte;
    private String status;
}
