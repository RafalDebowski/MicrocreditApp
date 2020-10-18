package com.rafaldebowski.microcredit.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.Period;


@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoanConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
    private Period maxTerm;

    @NotNull
    private Period minTerm;

    @NotNull
    private BigDecimal maxAmount;

    @NotNull
    private BigDecimal minAmount;
}
