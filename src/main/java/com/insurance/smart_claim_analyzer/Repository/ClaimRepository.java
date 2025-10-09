package com.insurance.smart_claim_analyzer.Repository;

import com.insurance.smart_claim_analyzer.Model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, String> {
}
