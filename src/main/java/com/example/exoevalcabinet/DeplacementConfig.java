package com.example.exoevalcabinet;

import com.example.exoevalcabinet.repositories.DeplacementRepository;
import com.example.exoevalcabinet.services.DeplacementService;
import com.example.exoevalcabinet.services.DeplacementServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeplacementConfig {

    @Bean
    public DeplacementService deplacementService(DeplacementRepository deplacementRepository){
        return new DeplacementServiceImpl(deplacementRepository);
    }
}
