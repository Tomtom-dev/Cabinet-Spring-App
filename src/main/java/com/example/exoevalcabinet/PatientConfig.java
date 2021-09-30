package com.example.exoevalcabinet;

import com.example.exoevalcabinet.services.PatientService;
import org.springframework.context.annotation.Bean;

public class PatientConfig {

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }
}
