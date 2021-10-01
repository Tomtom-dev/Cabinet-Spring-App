package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Deplacement;
import com.example.exoevalcabinet.repositories.DeplacementRepository;

import java.util.List;
import java.util.Optional;

public class DeplacementServiceImpl implements DeplacementService {


    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository){
        this.deplacementRepository= deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Optional<Deplacement> FindOneById(Integer id) {
        return this.deplacementRepository.findById(id);
    }

    @Override
    public Deplacement create(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Deplacement put(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public void delete(Integer id) {
        this.deplacementRepository.deleteById(id);
    }
}
