package com.example.leitor_json.dto;

import java.util.Date;

public class BemDTO {
    private Integer ordem;
    private String descricao;
    private String descricaoDeTipoDeBem;
    private float valor;
    private Date dataUltimaAtualizacao;

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoDeTipoDeBem() {
        return descricaoDeTipoDeBem;
    }

    public void setDescricaoDeTipoDeBem(String descricaoDeTipoDeBem) {
        this.descricaoDeTipoDeBem = descricaoDeTipoDeBem;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}
