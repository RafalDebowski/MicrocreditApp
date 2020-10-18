package com.rafaldebowski.microcredit.controller;

import com.rafaldebowski.microcredit.service.LoanConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanConfigController {

    public LoanConfigService loanConfigService;

    @Autowired
    public LoanConfigController(LoanConfigService loanConfigService) {
        this.loanConfigService = loanConfigService;
    }

}
