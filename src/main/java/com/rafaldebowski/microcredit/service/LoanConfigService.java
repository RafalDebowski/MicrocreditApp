package com.rafaldebowski.microcredit.service;

import com.rafaldebowski.microcredit.domain.LoanConfig;
import com.rafaldebowski.microcredit.repository.LoanConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Period;

@Service
public class LoanConfigService {

    private static BigDecimal MIN_AMOUNT = BigDecimal.valueOf(1000);
    private static BigDecimal MAX_AMOUNT = BigDecimal.valueOf(500000);
    private static Period MIN_TERM = Period.ofDays(60);
    private static Period MAX_TERM = Period.ofDays(2000);

    public LoanConfigRepository loanConfigRepository;
    public LoanConfig loanConfig;

    @Autowired
    public LoanConfigService(LoanConfigRepository loanConfigRepository) {
        this.loanConfigRepository = loanConfigRepository;
    }

    public LoanConfig getLoanConfig() {
        LoanConfig loanConfigView = LoanConfig.builder()
                .minTerm(MIN_TERM)
                .maxTerm(MAX_TERM)
                .minAmount(MIN_AMOUNT)
                .maxAmount(MAX_AMOUNT)
                .build();

        return loanConfigView;
    }
}
