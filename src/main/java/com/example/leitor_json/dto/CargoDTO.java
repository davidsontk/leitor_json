package com.example.leitor_json.dto;

public class CargoDTO {
    private Integer codigo;
    private String sigla;
    private String nome;
    private Integer codSuperior;
    private Boolean titular;
    private Integer contagem;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodSuperior() {
        return codSuperior;
    }

    public void setCodSuperior(Integer codSuperior) {
        this.codSuperior = codSuperior;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    public Integer getContagem() {
        return contagem;
    }

    public void setContagem(Integer contagem) {
        this.contagem = contagem;
    }
}
