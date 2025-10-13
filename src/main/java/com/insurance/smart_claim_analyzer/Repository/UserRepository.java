package com.insurance.smart_claim_analyzer.Repository;

import com.insurance.smart_claim_analyzer.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserId(String Userid);
}
