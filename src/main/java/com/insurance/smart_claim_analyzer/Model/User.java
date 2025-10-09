package com.insurance.smart_claim_analyzer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    private String id;

    private String userId;
    private String password;
    private String status;
}
