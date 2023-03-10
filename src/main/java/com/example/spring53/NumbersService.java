package com.example.spring53;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumbersService {
    public static List<Integer> getNumbersDivisibleByThree(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
    public static int sum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }
}