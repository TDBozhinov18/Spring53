package com.example.spring53;

import org.springframework.stereotype.Service;

@Service
public class SumNumbersService {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}