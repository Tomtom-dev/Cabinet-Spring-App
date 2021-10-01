package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Infirmiere;
import com.example.exoevalcabinet.models.Patient;
import com.example.exoevalcabinet.repositories.InfirmiereRepository;
import com.example.exoevalcabinet.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements InfirmiereService {

    private InfirmiereRepository infirmiereRepository;
    private PatientRepository patientRepository;

    public  InfirmiereServiceImpl(InfirmiereRepository repo,PatientRepository patientRepository){
        this.patientRepository=patientRepository;
        this.infirmiereRepository=repo;
    }

    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Optional<Infirmiere> findOneById(Integer id) {
        return this.infirmiereRepository.findById(id);
    }

    @Override
    public Infirmiere create(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere put(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public void delete(Integer id) {
        this.infirmiereRepository.deleteById(id);
    }

    @Override
    public List<Patient> findByInfirmiereId(Integer id) {
        return this.patientRepository.findByInfirmiereId(id);
    }
}
