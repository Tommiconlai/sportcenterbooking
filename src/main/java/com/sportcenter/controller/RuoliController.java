package com.sportcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.model.Ruolo;
import com.sportcenter.repository.RuoloRepository;

@RequestMapping("/api/ruolo")
@RestController
public class RuoliController {

    @Autowired
    private RuoloRepository repository;

    @GetMapping("/{id}")
    public Ruolo find(@PathVariable Long id)  {
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Ruolo create(@RequestBody Ruolo ruolo)  {
        return repository.save(ruolo);
    }    
}
