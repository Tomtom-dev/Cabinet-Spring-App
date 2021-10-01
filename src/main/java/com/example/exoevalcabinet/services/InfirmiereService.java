package com.example.exoevalcabinet.services;

import com.example.exoevalcabinet.models.Infirmiere;
import com.example.exoevalcabinet.models.Patient;

import java.util.List;
import java.util.Optional;

public interface InfirmiereService {

    List<Infirmiere> findAll();

    Optional<Infirmiere> findOneById(Long id);

    Infirmiere create(Infirmiere infirmiere);

    Infirmiere put(Infirmiere infirmiere);

    void delete(Long id);
}
