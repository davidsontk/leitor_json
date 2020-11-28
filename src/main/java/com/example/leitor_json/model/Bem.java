package com.example.leitor_json.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="bem")
public class Bem implements Serializable {

    @Id
    private Integer id;

    private Integer ordem;

    private String descricao;

    private String descricaoDeTipoDeBem;

    private float valor;

    private Date dataUltimaAtualizacao;

    //private Candidato candidatoId;

}


//    private Integer ordem;
//    private String descricao;
//    private String descricaoDeTipoDeBem;
//    private float valor;
//    private Date dataUltimaAtualizacao;