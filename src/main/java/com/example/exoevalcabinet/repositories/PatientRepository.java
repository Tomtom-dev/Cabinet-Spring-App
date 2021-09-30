package com.example.exoevalcabinet.repositories;

import com.example.exoevalcabinet.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
