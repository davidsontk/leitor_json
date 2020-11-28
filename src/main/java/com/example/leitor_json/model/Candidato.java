package com.example.leitor_json.model;

import com.example.leitor_json.dto.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {

    @Id
    private String id;

    private String nomeUrna;

    private Integer numero;

    private String idCandidatoSuperior;

    private String nomeCompleto;

    private String descricaoSexo;

    private Date dataDeNascimento;

    private String tituloEleitor;

    private String cpf;

    private String descricaoEstadoCivil;

    private String descricaoCorRaca;

    private String descricaoSituacao;

    private String nacionalidade;

    private String grauInstrucao;

    private String ocupacao;

    private Float gastoCampanha1T;

    private Float gastoCampanha2T;

    private String sgUfNascimento;

    private String nomeMunicipioNascimento;

    private String localCandidatura;

    private String ufCandidatura;

    private String ufSuperiorCandidatura;

    private String dataUltimaAtualizacao;

    private String fotoUrl;

    private Date fotoDataUltimaAtualizacao;

    private String descricaoTotalizacao;

    private String nomeColigacao;

    private String composicaoColigacao;

    private String numeroProcessoDrap;

    private String numeroProcessoDrapEncrypt;

    private String numeroProcesso;

    private String numeroProcessoEncrypt;

    private String numeroProcessoPrestContas;

    private String numeroProcessoPrestContasEncrypt;


    private String numeroProtocolo;

    @JoinColumn(name = "idCargo", referencedColumnName = "id")
    @ManyToOne
    private Cargo idCargo;

    private Float totalDeBens;

    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne
    private Candidato vice;

    @JoinColumn(name = "idPartido", referencedColumnName = "id")
    @ManyToOne
    private Partido idPartido;

    @JoinColumn(name = "idEleicao", referencedColumnName = "id")
    @ManyToOne
    private Eleicao idEleicao;

    private String substituto;

    private String motivos;

    private Integer codigoSituacaoCandidato;

    private String descricaoSituacaoCandidato;

    private Boolean st_SUBSTITUIDO;

    private String descricaoNaturalidade;

    private Boolean st_MOTIVO_AUSENCIA_REQUISITO;

    private Boolean st_MOTIVO_CONDUTA_VEDADA;

    private String cnpjcampanha;

    private Float gastoCampanha;

    private Boolean st_MOTIVO_ABUSO_PODER;

    private Boolean st_MOTIVO_COMPRA_VOTO;

    private String ds_MOTIVO_OUTROS;

    private Boolean st_MOTIVO_GASTO_ILICITO;

    private Boolean st_MOTIVO_IND_PARTIDO;

    private Boolean st_MOTIVO_FICHA_LIMPA;

    private Boolean st_DIVULGA_ARQUIVOS;

    private Boolean st_DIVULGA_BENS;

    private Boolean st_DIVULGA;

    private Boolean st_REELEICAO;
}
