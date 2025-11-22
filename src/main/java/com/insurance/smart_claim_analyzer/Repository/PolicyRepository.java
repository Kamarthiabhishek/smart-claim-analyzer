package com.insurance.smart_claim_analyzer.Repository;

import com.insurance.smart_claim_analyzer.Model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {
}
