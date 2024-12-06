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

import com.sportcenter.model.Utente;
import com.sportcenter.repository.UtenteRepository;
//a
@RequestMapping("/api/utente")
@RestController

public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    @GetMapping
    private List<Utente> getAllUtenti(){
        return utenteRepository.findAll();
    }

    @PostMapping
    public Utente addUtente(@RequestBody Utente add){
        return utenteRepository.save(add);
    }

    @DeleteMapping("/{id}")
    public void removeUtente(@PathVariable Long id){
        utenteRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Utente getUtenteId(@PathVariable Long id){
        return utenteRepository.findById(id).get();
    }    
}
