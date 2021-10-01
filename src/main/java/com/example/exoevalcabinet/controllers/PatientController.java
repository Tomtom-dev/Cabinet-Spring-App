package com.example.exoevalcabinet.controllers;

import com.example.exoevalcabinet.models.Patient;
import com.example.exoevalcabinet.services.PatientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    private static Logger LOGGER = LoggerFactory.getLogger(PatientController.class);

    private PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService=patientService;
    }

    @GetMapping("")
    public List<Patient> findALl(){
        return this.patientService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Patient> findOneById(@PathVariable Long id){
        return this.patientService.findOneById(id);
    }

    @PostMapping("")
    public Patient create(@RequestBody Patient patient){
        return this.patientService.create(patient);
    }

    @PutMapping("")
    public Patient put(@RequestBody Patient patient) {
        return this.patientService.put(patient);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.patientService.delete(id);
    }

}
