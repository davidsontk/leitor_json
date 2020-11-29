package com.example.leitor_json.dto;

import java.util.Date;

public class EleicaoDTO {
    private Integer id;
    private String siglaUF;
    private String localidadeSgUe;
    private Integer ano;
    private String codigo;
    private String nomeEleicao;
    private String tipoEleicao;
    private String turno;
    private String tipoAbrangencia;
    private Date dataEleicao;
    private Integer codSituacaoEleicao;
    private String descricaoSituacaoEleicao;
    private String descricaoEleicao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
