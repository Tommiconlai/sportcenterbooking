package com.sportcenter.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pagamento;
    private LocalDateTime dataOra;
    private double importo;

    @OneToOne
    @JoinColumn(name = "prenotazione_ID")
    private Prenotazione prenotazione;

    public Long getId() {
        return id;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public LocalDateTime getDataOra() {
        return dataOra;
    }

    public double getImporto() {
        return importo;
    }

    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }
        
}
