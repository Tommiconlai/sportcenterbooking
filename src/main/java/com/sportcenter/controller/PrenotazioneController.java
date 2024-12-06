package com.sportcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;

@RequestMapping("/api/prenotazioni")
@RestController

public class PrenotazioneController {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @GetMapping
    private List<Prenotazione> getAllPrenotazioni(){
        return prenotazioneRepository.findAll();
    }

    @PostMapping
    public Prenotazione addPrenotazione(@RequestBody Prenotazione add){
        return prenotazioneRepository.save(add);
    }

    @DeleteMapping("/{id}")
    public void removePrenotazione(@PathVariable Long id){
        prenotazioneRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Prenotazione getPrenotazioneId(@PathVariable Long id){
        return prenotazioneRepository.findById(id).get();
    }    
}
