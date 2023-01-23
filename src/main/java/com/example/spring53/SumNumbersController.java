package com.example.spring53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum-numbers")
public class SumNumbersController {

    private SumNumbersService sumNumbersService;

    @Autowired
    public SumNumbersController(SumNumbersService sumNumbersService) {
        this.sumNumbersService = sumNumbersService;
    }

    @GetMapping
    public int getSum(@RequestParam int n) {
        return sumNumbersService.calculateSum(n);
    }
}
