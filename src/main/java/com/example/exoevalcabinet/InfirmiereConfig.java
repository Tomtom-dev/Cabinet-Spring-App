package com.example.exoevalcabinet;

import com.example.exoevalcabinet.repositories.InfirmiereRepository;
import com.example.exoevalcabinet.services.InfirmiereService;
import com.example.exoevalcabinet.services.InfirmiereServiceImpl;
import com.example.exoevalcabinet.services.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfirmiereConfig {

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository){
        return new InfirmiereServiceImpl(infirmiereRepository);
    }
}
