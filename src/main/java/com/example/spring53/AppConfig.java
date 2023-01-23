package com.example.spring53;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Configuration
@Service
public class AppConfig {
    @Bean
    public SumNumbersService sumNumbersService() {
        return new SumNumbersService();
    }
}