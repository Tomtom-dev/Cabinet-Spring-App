package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Infirmiere;
import com.example.exoevalcabinet.repositories.InfirmiereRepository;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements InfirmiereService {

    private InfirmiereRepository infirmiereRepository;

    public  InfirmiereServiceImpl(InfirmiereRepository repo){
        this.infirmiereRepository=repo;
    }

    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Optional<Infirmiere> findOneById(Long id) {
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
    public void delete(Long id) {
        this.infirmiereRepository.deleteById(id);
    }
}
