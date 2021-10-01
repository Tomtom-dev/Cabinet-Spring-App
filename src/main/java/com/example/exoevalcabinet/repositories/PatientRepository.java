package com.example.exoevalcabinet.repositories;

import com.example.exoevalcabinet.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    List<Patient> findByInfirmiereId(Integer id);
}
