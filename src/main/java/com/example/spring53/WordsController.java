package com.example.spring53;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
public class WordsController {

    @GetMapping
    public String repeatWord(@RequestParam String word, @RequestParam int n) {
        StringBuilder repeatedWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeatedWord.append(word + " ");
        }
        return repeatedWord.toString();
    }
}
