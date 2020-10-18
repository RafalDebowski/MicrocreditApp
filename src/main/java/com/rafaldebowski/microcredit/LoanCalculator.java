package com.rafaldebowski.microcredit;

import com.rafaldebowski.microcredit.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LoanCalculator {

    private LoanRepository loanRepository;

    @Autowired
    public LoanCalculator(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    private Double amount;

    private Double rate = 1.1;

    private Double amountWithInterest;

    public BigDecimal calculate(Double amount) {

        amountWithInterest = amount * rate;

        return new BigDecimal(amountWithInterest);

    }

    public Integer checkYourInterest(Long id){
        BigDecimal amount = loanRepository.getOne(id).getAmount();
        BigDecimal amountWithInterest = calculate(amount.doubleValue());

        int score = amountWithInterest.intValue();
        return  score;
    }


}
