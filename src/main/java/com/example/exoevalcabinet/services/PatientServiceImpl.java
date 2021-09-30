package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Patient;
import com.example.exoevalcabinet.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService{

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Optional<Patient> findOneById(Long id) {
        return this.patientRepository.findById(id);
    }

    @Override
    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient put(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public void delete(Long id) {
        this.patientRepository.deleteById(id);
    }
}
