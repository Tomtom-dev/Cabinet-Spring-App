package com.example.exoevalcabinet.controllers;

import com.example.exoevalcabinet.models.Infirmiere;
import com.example.exoevalcabinet.services.InfirmiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("infirmiere")
public class InfirmiereController {

    private InfirmiereService infirmiereService;

    public InfirmiereController(InfirmiereService infirmiereService){
        this.infirmiereService=infirmiereService;
    }

    @GetMapping("")
    public List<Infirmiere>findAll(){
        return this.infirmiereService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Infirmiere> FindOneById(@PathVariable Long id){
        return this.infirmiereService.findOneById(id);
    }

    @PostMapping("")
    public Infirmiere create (@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.create(infirmiere);
    }

    @PutMapping("")
    public Infirmiere put(@RequestBody Infirmiere infirmiere){
        return this.infirmiereService.put(infirmiere);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.infirmiereService.delete(id);
    }
}
