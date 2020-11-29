package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "motivo")
public class Motivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String motivo;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }
}
