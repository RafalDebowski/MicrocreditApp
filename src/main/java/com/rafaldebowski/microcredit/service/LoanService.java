package com.rafaldebowski.microcredit.service;

import com.rafaldebowski.microcredit.LoanCalculator;
import com.rafaldebowski.microcredit.domain.Loan;
import com.rafaldebowski.microcredit.domain.LoanConfig;
import com.rafaldebowski.microcredit.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class LoanService {

    public LoanRepository loanRepository;

    public LoanConfigService loanConfig;

    public LoanCalculator calculator;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public void createLoan(Loan loan)  {
//        if (amount.compareTo(loanConfig.getLoanConfig().getMinAmount()) == 1
//            && amount.compareTo(loanConfig.getLoanConfig().getMaxAmount()) == -1){
//            throw  new Exception("Your amount does not meet the requirements");
//        }else if()
        loanRepository.save(loan);
    }

    public List<Loan> getAllLoans(){
        List<Loan> allLoans = loanRepository.findAll();
        return allLoans;
    }

}
