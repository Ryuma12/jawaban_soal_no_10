package com.testjava.jawaban_soal_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/sum_of")
public class CalculationController {

    private final CalculationService calculationService;
    
    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping
    public int getSum_of() {
        return calculationService.getSum_of();
        
    }

    
    
}
