package com.sportcenter.dto;

import java.time.LocalDateTime;

public class PrenotazioneResponse {

    private Long id;
    private LocalDateTime dataOra;
    private String stato;
    private Long utenteId;
    private Long campoSportivoId;

    public Long getCampoSportivoId() {
        return campoSportivoId;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public Long getId() {
        return id;
    }

    public String getStato() {
        return stato;
    }

    public Long getUtenteId() {
        return utenteId;
    }

    public void setCampoSportivoId(Long campoSportivoId) {
        this.campoSportivoId = campoSportivoId;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public void setUtenteId(Long utenteId) {
        this.utenteId = utenteId;
    }
    
}
