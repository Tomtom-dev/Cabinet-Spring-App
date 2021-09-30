package com.example.exoevalcabinet;

import com.example.exoevalcabinet.repositories.PatientRepository;
import com.example.exoevalcabinet.services.PatientService;
import com.example.exoevalcabinet.services.PatientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfig {

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }
}
