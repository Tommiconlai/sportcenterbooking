package com.sportcenter.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CampoSportivo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String campoSportivo, disciplina;
    private boolean disponibile;
    private double costoOrario;

    @OneToMany(mappedBy = "campoSportivo")
    private List<Prenotazione> prenotazione;

    public String getCampoSportivo() {
        return campoSportivo;
    }

    public Long getId() {
        return id;
    }

    public void setCampoSportivo(String campoSportivo) {
        this.campoSportivo = campoSportivo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCostoOrario() {
        return costoOrario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setCostoOrario(double costoOrario) {
        this.costoOrario = costoOrario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isDisponibile() {
        return disponibile;
    }
}
