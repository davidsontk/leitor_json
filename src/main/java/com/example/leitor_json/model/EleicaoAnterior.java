package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "eleicao_anterior")
public class EleicaoAnterior implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="nr_ano")
    private Integer nrAno;

    @Column(name="nome_urna")
    private String nomeUrna;

    @Column(name="nome_candidato")
    private String nomeCandidato;

    @JoinColumn(name="id_eleicao", referencedColumnName = "id")
    @ManyToOne
    private Eleicao idEleicao;

    @Column(name="sg_ue")
    private String sgUe;

    private String local;

    private String cargo;

    private String partido;

    @Column(name="situacao_totalizacao")
    private String situacaoTotalizacao;

    @Column(name="tx_link")
    private String txLink;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id")
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
