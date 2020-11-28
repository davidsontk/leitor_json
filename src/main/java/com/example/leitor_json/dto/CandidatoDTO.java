package com.example.leitor_json.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidatoDTO {
    private Double id;
    private String nomeUrna;
    private Integer numero;
    private Integer idCandidatoSuperior;
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
    private CargoDTO cargo;
    private List<BemDTO> bens = new ArrayList<>();
    private Float totalDeBens;
    private List<ViceDTO> vices = new ArrayList<>();
    private PartidoDTO partido;
    private EleicaoDTO eleicao;
    private List<String> emails = new ArrayList<>();
    private List<String> sites = new ArrayList<>();
    private List<ArquivoDTO> arquivos = new ArrayList<>();
    private List<EleicaoAnteriorDTO> eleicoesAnteriores = new ArrayList<>();
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

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getNomeUrna() {
        return nomeUrna;
    }

    public void setNomeUrna(String nomeUrna) {
        this.nomeUrna = nomeUrna;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getIdCandidatoSuperior() {
        return idCandidatoSuperior;
    }

    public void setIdCandidatoSuperior(Integer idCandidatoSuperior) {
        this.idCandidatoSuperior = idCandidatoSuperior;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDescricaoSexo() {
        return descricaoSexo;
    }

    public void setDescricaoSexo(String descricaoSexo) {
        this.descricaoSexo = descricaoSexo;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDescricaoEstadoCivil() {
        return descricaoEstadoCivil;
    }

    public void setDescricaoEstadoCivil(String descricaoEstadoCivil) {
        this.descricaoEstadoCivil = descricaoEstadoCivil;
    }

    public String getDescricaoCorRaca() {
        return descricaoCorRaca;
    }

    public void setDescricaoCorRaca(String descricaoCorRaca) {
        this.descricaoCorRaca = descricaoCorRaca;
    }

    public String getDescricaoSituacao() {
        return descricaoSituacao;
    }

    public void setDescricaoSituacao(String descricaoSituacao) {
        this.descricaoSituacao = descricaoSituacao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Float getGastoCampanha1T() {
        return gastoCampanha1T;
    }

    public void setGastoCampanha1T(Float gastoCampanha1T) {
        this.gastoCampanha1T = gastoCampanha1T;
    }

    public Float getGastoCampanha2T() {
        return gastoCampanha2T;
    }

    public void setGastoCampanha2T(Float gastoCampanha2T) {
        this.gastoCampanha2T = gastoCampanha2T;
    }

    public String getSgUfNascimento() {
        return sgUfNascimento;
    }

    public void setSgUfNascimento(String sgUfNascimento) {
        this.sgUfNascimento = sgUfNascimento;
    }

    public String getNomeMunicipioNascimento() {
        return nomeMunicipioNascimento;
    }

    public void setNomeMunicipioNascimento(String nomeMunicipioNascimento) {
        this.nomeMunicipioNascimento = nomeMunicipioNascimento;
    }

    public String getLocalCandidatura() {
        return localCandidatura;
    }

    public void setLocalCandidatura(String localCandidatura) {
        this.localCandidatura = localCandidatura;
    }

    public String getUfCandidatura() {
        return ufCandidatura;
    }

    public void setUfCandidatura(String ufCandidatura) {
        this.ufCandidatura = ufCandidatura;
    }

    public String getUfSuperiorCandidatura() {
        return ufSuperiorCandidatura;
    }

    public void setUfSuperiorCandidatura(String ufSuperiorCandidatura) {
        this.ufSuperiorCandidatura = ufSuperiorCandidatura;
    }

    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public Date getFotoDataUltimaAtualizacao() {
        return fotoDataUltimaAtualizacao;
    }

    public void setFotoDataUltimaAtualizacao(Date fotoDataUltimaAtualizacao) {
        this.fotoDataUltimaAtualizacao = fotoDataUltimaAtualizacao;
    }

    public String getDescricaoTotalizacao() {
        return descricaoTotalizacao;
    }

    public void setDescricaoTotalizacao(String descricaoTotalizacao) {
        this.descricaoTotalizacao = descricaoTotalizacao;
    }

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

    public String getNumeroProcessoDrap() {
        return numeroProcessoDrap;
    }

    public void setNumeroProcessoDrap(String numeroProcessoDrap) {
        this.numeroProcessoDrap = numeroProcessoDrap;
    }

    public String getNumeroProcessoDrapEncrypt() {
        return numeroProcessoDrapEncrypt;
    }

    public void setNumeroProcessoDrapEncrypt(String numeroProcessoDrapEncrypt) {
        this.numeroProcessoDrapEncrypt = numeroProcessoDrapEncrypt;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNumeroProcessoEncrypt() {
        return numeroProcessoEncrypt;
    }

    public void setNumeroProcessoEncrypt(String numeroProcessoEncrypt) {
        this.numeroProcessoEncrypt = numeroProcessoEncrypt;
    }

    public String getNumeroProcessoPrestContas() {
        return numeroProcessoPrestContas;
    }

    public void setNumeroProcessoPrestContas(String numeroProcessoPrestContas) {
        this.numeroProcessoPrestContas = numeroProcessoPrestContas;
    }

    public String getNumeroProcessoPrestContasEncrypt() {
        return numeroProcessoPrestContasEncrypt;
    }

    public void setNumeroProcessoPrestContasEncrypt(String numeroProcessoPrestContasEncrypt) {
        this.numeroProcessoPrestContasEncrypt = numeroProcessoPrestContasEncrypt;
    }

    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public CargoDTO getCargo() {
        return cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    public List<BemDTO> getBens() {
        return bens;
    }

    public void setBens(List<BemDTO> bens) {
        this.bens = bens;
    }

    public Float getTotalDeBens() {
        return totalDeBens;
    }

    public void setTotalDeBens(Float totalDeBens) {
        this.totalDeBens = totalDeBens;
    }

    public List<ViceDTO> getVices() {
        return vices;
    }

    public void setVices(List<ViceDTO> vices) {
        this.vices = vices;
    }

    public PartidoDTO getPartido() {
        return partido;
    }

    public void setPartido(PartidoDTO partido) {
        this.partido = partido;
    }

    public EleicaoDTO getEleicao() {
        return eleicao;
    }

    public void setEleicao(EleicaoDTO eleicao) {
        this.eleicao = eleicao;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }

    public List<ArquivoDTO> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<ArquivoDTO> arquivos) {
        this.arquivos = arquivos;
    }

    public List<EleicaoAnteriorDTO> getEleicoesAnteriores() {
        return eleicoesAnteriores;
    }

    public void setEleicoesAnteriores(List<EleicaoAnteriorDTO> eleicoesAnteriores) {
        this.eleicoesAnteriores = eleicoesAnteriores;
    }

    public String getSubstituto() {
        return substituto;
    }

    public void setSubstituto(String substituto) {
        this.substituto = substituto;
    }

    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
    }

    public Integer getCodigoSituacaoCandidato() {
        return codigoSituacaoCandidato;
    }

    public void setCodigoSituacaoCandidato(Integer codigoSituacaoCandidato) {
        this.codigoSituacaoCandidato = codigoSituacaoCandidato;
    }

    public String getDescricaoSituacaoCandidato() {
        return descricaoSituacaoCandidato;
    }

    public void setDescricaoSituacaoCandidato(String descricaoSituacaoCandidato) {
        this.descricaoSituacaoCandidato = descricaoSituacaoCandidato;
    }

    public Boolean getSt_SUBSTITUIDO() {
        return st_SUBSTITUIDO;
    }

    public void setSt_SUBSTITUIDO(Boolean st_SUBSTITUIDO) {
        this.st_SUBSTITUIDO = st_SUBSTITUIDO;
    }

    public String getDescricaoNaturalidade() {
        return descricaoNaturalidade;
    }

    public void setDescricaoNaturalidade(String descricaoNaturalidade) {
        this.descricaoNaturalidade = descricaoNaturalidade;
    }

    public Boolean getSt_MOTIVO_AUSENCIA_REQUISITO() {
        return st_MOTIVO_AUSENCIA_REQUISITO;
    }

    public void setSt_MOTIVO_AUSENCIA_REQUISITO(Boolean st_MOTIVO_AUSENCIA_REQUISITO) {
        this.st_MOTIVO_AUSENCIA_REQUISITO = st_MOTIVO_AUSENCIA_REQUISITO;
    }

    public Boolean getSt_MOTIVO_CONDUTA_VEDADA() {
        return st_MOTIVO_CONDUTA_VEDADA;
    }

    public void setSt_MOTIVO_CONDUTA_VEDADA(Boolean st_MOTIVO_CONDUTA_VEDADA) {
        this.st_MOTIVO_CONDUTA_VEDADA = st_MOTIVO_CONDUTA_VEDADA;
    }

    public String getCnpjcampanha() {
        return cnpjcampanha;
    }

    public void setCnpjcampanha(String cnpjcampanha) {
        this.cnpjcampanha = cnpjcampanha;
    }

    public Float getGastoCampanha() {
        return gastoCampanha;
    }

    public void setGastoCampanha(Float gastoCampanha) {
        this.gastoCampanha = gastoCampanha;
    }

    public Boolean getSt_MOTIVO_ABUSO_PODER() {
        return st_MOTIVO_ABUSO_PODER;
    }

    public void setSt_MOTIVO_ABUSO_PODER(Boolean st_MOTIVO_ABUSO_PODER) {
        this.st_MOTIVO_ABUSO_PODER = st_MOTIVO_ABUSO_PODER;
    }

    public Boolean getSt_MOTIVO_COMPRA_VOTO() {
        return st_MOTIVO_COMPRA_VOTO;
    }

    public void setSt_MOTIVO_COMPRA_VOTO(Boolean st_MOTIVO_COMPRA_VOTO) {
        this.st_MOTIVO_COMPRA_VOTO = st_MOTIVO_COMPRA_VOTO;
    }

    public String getDs_MOTIVO_OUTROS() {
        return ds_MOTIVO_OUTROS;
    }

    public void setDs_MOTIVO_OUTROS(String ds_MOTIVO_OUTROS) {
        this.ds_MOTIVO_OUTROS = ds_MOTIVO_OUTROS;
    }

    public Boolean getSt_MOTIVO_GASTO_ILICITO() {
        return st_MOTIVO_GASTO_ILICITO;
    }

    public void setSt_MOTIVO_GASTO_ILICITO(Boolean st_MOTIVO_GASTO_ILICITO) {
        this.st_MOTIVO_GASTO_ILICITO = st_MOTIVO_GASTO_ILICITO;
    }

    public Boolean getSt_MOTIVO_IND_PARTIDO() {
        return st_MOTIVO_IND_PARTIDO;
    }

    public void setSt_MOTIVO_IND_PARTIDO(Boolean st_MOTIVO_IND_PARTIDO) {
        this.st_MOTIVO_IND_PARTIDO = st_MOTIVO_IND_PARTIDO;
    }

    public Boolean getSt_MOTIVO_FICHA_LIMPA() {
        return st_MOTIVO_FICHA_LIMPA;
    }

    public void setSt_MOTIVO_FICHA_LIMPA(Boolean st_MOTIVO_FICHA_LIMPA) {
        this.st_MOTIVO_FICHA_LIMPA = st_MOTIVO_FICHA_LIMPA;
    }

    public Boolean getSt_DIVULGA_ARQUIVOS() {
        return st_DIVULGA_ARQUIVOS;
    }

    public void setSt_DIVULGA_ARQUIVOS(Boolean st_DIVULGA_ARQUIVOS) {
        this.st_DIVULGA_ARQUIVOS = st_DIVULGA_ARQUIVOS;
    }

    public Boolean getSt_DIVULGA_BENS() {
        return st_DIVULGA_BENS;
    }

    public void setSt_DIVULGA_BENS(Boolean st_DIVULGA_BENS) {
        this.st_DIVULGA_BENS = st_DIVULGA_BENS;
    }

    public Boolean getSt_DIVULGA() {
        return st_DIVULGA;
    }

    public void setSt_DIVULGA(Boolean st_DIVULGA) {
        this.st_DIVULGA = st_DIVULGA;
    }

    public Boolean getSt_REELEICAO() {
        return st_REELEICAO;
    }

    public void setSt_REELEICAO(Boolean st_REELEICAO) {
        this.st_REELEICAO = st_REELEICAO;
    }
}
