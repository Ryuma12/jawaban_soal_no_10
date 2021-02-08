package com.testjava.jawaban_soal_java;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public int getSum_of() {
        Calculation calculation= new Calculation(5);

        return calculation.penjumlahan();
        
    }
    
}
