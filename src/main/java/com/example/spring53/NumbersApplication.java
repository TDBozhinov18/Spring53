package com.example.spring53;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({AppConfig.class})


@SpringBootApplication
public class NumbersApplication {

    public static void main(String[] args) {
        SpringApplication.run(NumbersApplication.class, args);
    }

}