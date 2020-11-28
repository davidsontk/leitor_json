package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vice")
public class Vice implements Serializable {

    @Id
    private Integer id;

    private String nomeColigacao;

    private String composicaoColigacao;

    private Boolean stRegistro;

    private String situacaoCandidato;

    private String urlFoto;

    private String sgPartido;

    private String nmUrna;

    private String nmCandidato;

    @ManyToOne
    @JoinColumn(name = "sqEleicao", referencedColumnName = "id")
    private Eleicao sqEleicao;

    private Integer sqCandidatoSuperior;

    private String nrCandidato;

    private String dsCargo;

    private String nmPartido;

    private String sqCandidato;

    private String sgUE;

    private Date dataUltimaAtualizacao;

    public String getNomeColigacao() {
        return nomeColigacao;
    }

    public void setNomeColigacao(String nomeColigacao) {
        this.nomeColigacao = nomeColigacao;
    }

    public String getComposicaoColigacao() {
        return composicaoColigacao;
    }

    public void setComposicaoColigacao(String composicaoColigacao) {
        this.composicaoColigacao = composicaoColigacao;
    }

    public Boolean getStRegistro() {
        return stRegistro;
    }

    public void setStRegistro(Boolean stRegistro) {
        this.stRegistro = stRegistro;
    }

    public String getSituacaoCandidato() {
        return situacaoCandidato;
    }

    public void setSituacaoCandidato(String situacaoCandidato) {
        this.situacaoCandidato = situacaoCandidato;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getSgPartido() {
        return sgPartido;
    }

    public void setSgPartido(String sgPartido) {
        this.sgPartido = sgPartido;
    }

    public String getNmUrna() {
        return nmUrna;
    }

    public void setNmUrna(String nmUrna) {
        this.nmUrna = nmUrna;
    }

    public String getNmCandidato() {
        return nmCandidato;
    }

    public void setNmCandidato(String nmCandidato) {
        this.nmCandidato = nmCandidato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Eleicao getSqEleicao() {
        return sqEleicao;
    }

    public void setSqEleicao(Eleicao sqEleicao) {
        this.sqEleicao = sqEleicao;
    }

    public Integer getSqCandidatoSuperior() {
        return sqCandidatoSuperior;
    }

    public void setSqCandidatoSuperior(Integer sqCandidatoSuperior) {
        this.sqCandidatoSuperior = sqCandidatoSuperior;
    }

    public String getNrCandidato() {
        return nrCandidato;
    }

    public void setNrCandidato(String nrCandidato) {
        this.nrCandidato = nrCandidato;
    }

    public String getDsCargo() {
        return dsCargo;
    }

    public void setDsCargo(String dsCargo) {
        this.dsCargo = dsCargo;
    }

    public String getNmPartido() {
        return nmPartido;
    }

    public void setNmPartido(String nmPartido) {
        this.nmPartido = nmPartido;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public String getSgUE() {
        return sgUE;
    }

    public void setSgUE(String sgUE) {
        this.sgUE = sgUE;
    }

    public Date getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}
