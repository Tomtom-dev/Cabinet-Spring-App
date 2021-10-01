package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Deplacement;

import java.util.List;
import java.util.Optional;

public interface DeplacementService {

    List<Deplacement> findAll();

    Optional<Deplacement> FindOneById(Long id);

    Deplacement create(Deplacement deplacement);

    Deplacement put(Deplacement deplacement);

    void delete(Long id);
}
