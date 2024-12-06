package com.sportcenter.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stato;
    private LocalDateTime dataOra;

    @ManyToOne
    @JoinColumn(name = "campoSportivo_ID")
    private CampoSportivo campoSportivo;
    @ManyToOne
    @JoinColumn(name = "utente_ID")
    private Utente utente;

    @OneToOne
    @JoinColumn(name = "pagamento_ID")
    private Pagamento pagamento;

    public Long getId() {
        return id;
    }

    public String getPrenotazione() {
        return stato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrenotazione(String prenotazione) {
        this.stato = prenotazione;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public CampoSportivo getCampoSportivo() {
        return campoSportivo;
    }

    public void setCampoSportivo(CampoSportivo campoSportivo) {
        this.campoSportivo = campoSportivo;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    
    
}
