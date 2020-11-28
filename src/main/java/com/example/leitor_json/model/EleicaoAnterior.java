package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "eleicaoAnterior")
public class EleicaoAnterior implements Serializable {

    @Id
    private String id;

    private Integer nrAno;

    private String nomeUrna;

    private String nomeCandidato;

    @JoinColumn(name="idEleicao", referencedColumnName = "id")
    @ManyToOne
    private Eleicao idEleicao;

    private String sgUe;

    private String local;

    private String cargo;

    private String partido;

    private String situacaoTotalizacao;

    private String txLink;

    @JoinColumn(name = "idCandidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNrAno() {
        return nrAno;
    }

    public void setNrAno(Integer nrAno) {
        this.nrAno = nrAno;
    }

    public String getNomeUrna() {
        return nomeUrna;
    }

    public void setNomeUrna(String nomeUrna) {
        this.nomeUrna = nomeUrna;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getSituacaoTotalizacao() {
        return situacaoTotalizacao;
    }

    public void setSituacaoTotalizacao(String situacaoTotalizacao) {
        this.situacaoTotalizacao = situacaoTotalizacao;
    }

    public String getTxLink() {
        return txLink;
    }

    public void setTxLink(String txLink) {
        this.txLink = txLink;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }
}
