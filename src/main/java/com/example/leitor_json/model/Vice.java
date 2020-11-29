package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "vice")
public class Vice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome_coligacao")
    private String nomeColigacao;

    @Column(name="composicao_coligacao")
    private String composicaoColigacao;

    @Column(name="st_registro")
    private Boolean stRegistro;

    @Column(name="situacao_candidato")
    private String situacaoCandidato;

    @Column(name="url_foto")
    private String urlFoto;

    @Column(name="sg_partido")
    private String sgPartido;

    @Column(name="nm_urna")
    private String nmUrna;

    @Column(name="nm_candidato")
    private String nmCandidato;

    @ManyToOne
    @JoinColumn(name = "sq_eleicao", referencedColumnName = "id")
    private Eleicao sqEleicao;

    @Column(name="sq_candidato_superior")
    private Integer sqCandidatoSuperior;

    @Column(name="nr_candidato")
    private String nrCandidato;

    @Column(name="ds_cargo")
    private String dsCargo;

    @Column(name="nm_partido")
    private String nmPartido;

    @Column(name="sq_candidato")
    private String sqCandidato;

    @Column(name="sg_ue")
    private String sgUE;

    @Column(name="data_ultima_atualizacao")
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
