package com.rafaldebowski.microcredit.repository;

import com.rafaldebowski.microcredit.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
