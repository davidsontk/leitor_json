package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "substituto")
public class Substituto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    @JoinColumn(name="id_eleicao", referencedColumnName = "id")
    @ManyToOne
    private Eleicao idEleicao;

    @Column(name="sg_ue")
    private String sgUe;

    @Column(name="nr_ano")
    private Integer nrAno;

    @Column(name="nm_candidato")
    private String nmCandidato;

    private String url;

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

    public Eleicao getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(Eleicao idEleicao) {
        this.idEleicao = idEleicao;
    }

    public String getSgUe() {
        return sgUe;
    }

    public void setSgUe(String sgUe) {
        this.sgUe = sgUe;
    }

    public Integer getNrAno() {
        return nrAno;
    }

    public void setNrAno(Integer nrAno) {
        this.nrAno = nrAno;
    }

    public String getNmCandidato() {
        return nmCandidato;
    }

    public void setNmCandidato(String nmCandidato) {
        this.nmCandidato = nmCandidato;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
