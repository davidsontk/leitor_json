package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="bem")
public class Bem implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private Integer ordem;

    private String descricao;

    @Column(name = "descricao_de_tipo_de_bem")
    private String descricaoDeTipoDeBem;

    private float valor;

    @Column(name = "data_ultima_atualizacao")
    private Date dataUltimaAtualizacao;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }
}

