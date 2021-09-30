package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    List<Patient> findAll();

    Optional<Patient> findOneById(Long id);

    Patient create(Patient patient);

    Patient put(Patient patient);

    void delete(Long id);
}
