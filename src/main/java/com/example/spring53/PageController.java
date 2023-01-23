package com.example.spring53;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @GetMapping("/goToNumbersPage")
    public String getNumbers(Model model, @RequestParam(value = "n", defaultValue = "10") int n) {
        model.addAttribute("numbers", NumbersService.getNumbersDivisibleByThree(n));
        return "numbers";
    }

    @GetMapping("/goToSumNumbersPage")
    public String goToSumNumbersPage(Model model, @RequestParam(value = "n", defaultValue = "10") int n) {
        model.addAttribute("numbers", NumbersService.sum(n));
        return "numbers";
    }

    @GetMapping("/goToWordsPage")
    public String showWords(Model model, @RequestParam(value = "word", defaultValue = "World") String word, @RequestParam(value = "n", defaultValue = "10") int n) {
        String fullWord = "";
        for (int i = 1; i <= n; i++) {
            fullWord += (word + " ");
        }
        model.addAttribute("numbers", fullWord);
        return "numbers";
    }
}
