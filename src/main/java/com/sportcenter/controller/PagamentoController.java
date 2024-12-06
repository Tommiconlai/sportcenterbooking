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

import com.sportcenter.model.Pagamento;
import com.sportcenter.repository.PagamentoRepository;

@RequestMapping("/api/pagamento")
@RestController

public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping
    private List<Pagamento> getAllPagamenti(){
        return pagamentoRepository.findAll();
    }

    @PostMapping
    public Pagamento addPagamento(@RequestBody Pagamento add){
        return pagamentoRepository.save(add);
    }

    @DeleteMapping("/{id}")
    public void removePagamento(@PathVariable Long id){
        pagamentoRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Pagamento getPagamentoId(@PathVariable Long id){
        return pagamentoRepository.findById(id).get();
    }    
}
