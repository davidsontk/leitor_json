package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "eleicao")
public class Eleicao implements Serializable {
    @Id
    private String id;

    @Column(name="sigla_UF")
    private String siglaUF;

    @Column(name="localidade_Sg_Ue")
    private String localidadeSgUe;

    private Integer ano;

    private String codigo;

    @Column(name="nome_eleicao")
    private String nomeEleicao;

    @Column(name="tipo_eleicao")
    private String tipoEleicao;

    private String turno;

    @Column(name="tipo_abrangencia")
    private String tipoAbrangencia;

    @Column(name="data_eleicao")
    private Date dataEleicao;

    @Column(name="cod_situacao_eleicao")
    private Integer codSituacaoEleicao;

    @Column(name="descricao_situacao_eleicao")
    private String descricaoSituacaoEleicao;

    @Column(name="descricao_eleicao")
    private String descricaoEleicao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiglaUF() {
        return siglaUF;
    }

    public void setSiglaUF(String siglaUF) {
        this.siglaUF = siglaUF;
    }

    public String getLocalidadeSgUe() {
        return localidadeSgUe;
    }

    public void setLocalidadeSgUe(String localidadeSgUe) {
        this.localidadeSgUe = localidadeSgUe;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeEleicao() {
        return nomeEleicao;
    }

    public void setNomeEleicao(String nomeEleicao) {
        this.nomeEleicao = nomeEleicao;
    }

    public String getTipoEleicao() {
        return tipoEleicao;
    }

    public void setTipoEleicao(String tipoEleicao) {
        this.tipoEleicao = tipoEleicao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipoAbrangencia() {
        return tipoAbrangencia;
    }

    public void setTipoAbrangencia(String tipoAbrangencia) {
        this.tipoAbrangencia = tipoAbrangencia;
    }

    public Date getDataEleicao() {
        return dataEleicao;
    }

    public void setDataEleicao(Date dataEleicao) {
        this.dataEleicao = dataEleicao;
    }

    public Integer getCodSituacaoEleicao() {
        return codSituacaoEleicao;
    }

    public void setCodSituacaoEleicao(Integer codSituacaoEleicao) {
        this.codSituacaoEleicao = codSituacaoEleicao;
    }

    public String getDescricaoSituacaoEleicao() {
        return descricaoSituacaoEleicao;
    }

    public void setDescricaoSituacaoEleicao(String descricaoSituacaoEleicao) {
        this.descricaoSituacaoEleicao = descricaoSituacaoEleicao;
    }

    public String getDescricaoEleicao() {
        return descricaoEleicao;
    }

    public void setDescricaoEleicao(String descricaoEleicao) {
        this.descricaoEleicao = descricaoEleicao;
    }
}
