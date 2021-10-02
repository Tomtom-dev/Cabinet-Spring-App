package com.example.exoevalcabinet.controllers;

import com.example.exoevalcabinet.models.Deplacement;
import com.example.exoevalcabinet.services.DeplacementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

    private DeplacementService deplacementService;

    public DeplacementController(DeplacementService deplacementService){
        this.deplacementService=deplacementService;
    }

    @GetMapping("")
    public List<Deplacement> findAll(){
        return this.deplacementService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Deplacement> FindOneById(@PathVariable Integer id){
        return this.deplacementService.FindOneById(id);
    }

    @PostMapping("")
    public Deplacement create(@RequestBody Deplacement deplacement){
        return this.deplacementService.create(deplacement);
    }

    @PutMapping("")
    public Deplacement put(@RequestBody Deplacement deplacement){
        return this.deplacementService.put(deplacement);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        this.deplacementService.delete(id);
    }
}
