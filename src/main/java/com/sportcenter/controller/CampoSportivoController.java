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

import com.sportcenter.model.CampoSportivo;
import com.sportcenter.repository.CampoSportivoRepository;

@RequestMapping("/api/campoSportivo")
@RestController

public class CampoSportivoController {

    @Autowired
    private CampoSportivoRepository campoSportivoRepositoryRepository;

    @GetMapping
    private List<CampoSportivo> getAllCampi(){
        return campoSportivoRepositoryRepository.findAll();
    }

    @PostMapping
    public CampoSportivo addCampo(@RequestBody CampoSportivo add){
        return campoSportivoRepositoryRepository.save(add);
    }

    @DeleteMapping("/{id}")
    public void removeCampo(@PathVariable Long id){
        campoSportivoRepositoryRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public CampoSportivo getCampoId(@PathVariable Long id){
        return campoSportivoRepositoryRepository.findById(id).get();
    }    
}
