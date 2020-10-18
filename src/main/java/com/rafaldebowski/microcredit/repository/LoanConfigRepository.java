package com.rafaldebowski.microcredit.repository;

import com.rafaldebowski.microcredit.domain.LoanConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanConfigRepository extends JpaRepository<LoanConfig, Long> {
}
