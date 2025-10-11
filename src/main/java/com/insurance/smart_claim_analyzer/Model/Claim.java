package com.insurance.smart_claim_analyzer.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Claim {
    @Id
    private String clmno;
    private String dateola;
    private String timeola;
    private String polno;
    private String lossdte;
    private String notifdte;
    private String status;


    public Claim(String polno, String lossdte){
        this.polno = polno;
        this.lossdte = lossdte;
    }
}
