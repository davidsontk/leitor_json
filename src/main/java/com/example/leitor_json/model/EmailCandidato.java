package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "emailCadidato")
public class EmailCandidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "idCandidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
