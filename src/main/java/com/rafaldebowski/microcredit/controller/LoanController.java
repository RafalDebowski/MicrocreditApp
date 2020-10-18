package com.rafaldebowski.microcredit.controller;

import com.rafaldebowski.microcredit.LoanCalculator;
import com.rafaldebowski.microcredit.domain.Loan;
import com.rafaldebowski.microcredit.service.LoanService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    public LoanService loanService;

    public LoanCalculator loanCalculator;

    @Autowired

    public LoanController(LoanService loanService, LoanCalculator loanCalculator) {
        this.loanService = loanService;
        this.loanCalculator = loanCalculator;
    }


    @PostMapping
    public ResponseEntity<Void> createLoan(@RequestBody Loan loan) {
        loanService.createLoan(loan);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Loan>> getAllLoans() {
        List<Loan> allLoans = loanService.getAllLoans();
        return new ResponseEntity<>(allLoans, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integer> getAmountWithInterestById(@PathVariable Long id) {
        Integer amountWithInterest = loanCalculator.checkYourInterest(id);
        return new ResponseEntity<>(amountWithInterest, HttpStatus.OK);
    }

}
