package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    @Column(name="nome_urna")
    private String nomeUrna;

    private Integer numero;

    @JoinColumn(name = "id_candidato_superior", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidatoSuperior;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="descricao_sexo")
    private String descricaoSexo;

    @Column(name="data_de_nascimento")
    private Date dataDeNascimento;

    @Column(name="titulo_eleitor")
    private String tituloEleitor;

    private String cpf;

    @Column(name="descricao_estado_civil")
    private String descricaoEstadoCivil;

    @Column(name="descricao_cor_raca")
    private String descricaoCorRaca;

    @Column(name="descricao_situacao")
    private String descricaoSituacao;

    private String nacionalidade;

    @Column(name="grau_instrucao")
    private String grauInstrucao;

    private String ocupacao;

    @Column(name="gasto_campanha_1T")
    private Float gastoCampanha1T;

    @Column(name="gasto_campanha_2T")
    private Float gastoCampanha2T;

    @Column(name="sg_uf_nascimento")
    private String sgUfNascimento;

    @Column(name="nome_municipio_nascimento")
    private String nomeMunicipioNascimento;

    @Column(name="local_candidatura")
    private String localCandidatura;

    @Column(name="uf_candidatura")
    private String ufCandidatura;

    @Column(name="uf_superior_candidatura")
    private String ufSuperiorCandidatura;

    @Column(name="data_ultima_atualizacao")
    private String dataUltimaAtualizacao;

    @Column(name="foto_url")
    private String fotoUrl;

    @Column(name="foto_data_ultima_atualizacao")
    private Date fotoDataUltimaAtualizacao;

    @Column(name="descricao_totalizacao")
    private String descricaoTotalizacao;

    @Column(name="nome_coligacao")
    private String nomeColigacao;

    @Column(name="composicao_coligacao")
    private String composicaoColigacao;

    @Column(name="numero_processo_drap")
    private String numeroProcessoDrap;

    @Column(name="numero_processo_drap_encrypt")
    private String numeroProcessoDrapEncrypt;

    @Column(name="numero_processo")
    private String numeroProcesso;

    @Column(name="numero_processo_encrypt")
    private String numeroProcessoEncrypt;

    @Column(name="numero_processo_prest_contas")
    private String numeroProcessoPrestContas;

    @Column(name="numero_processo_prest_contas_encrypt")
    private String numeroProcessoPrestContasEncrypt;

    @Column(name="numero_protocolo")
    private String numeroProtocolo;

    @JoinColumn(name = "id_cargo", referencedColumnName = "codigo")
    @ManyToOne
    private Cargo idCargo;

    @Column(name="total_de_bens")
    private Float totalDeBens;

    @JoinColumn(name = "vice", referencedColumnName = "id")
    @ManyToOne
    private Candidato vice;

    @JoinColumn(name = "id_partido", referencedColumnName = "id")
    @ManyToOne
    private Partido idPartido;

    @JoinColumn(name = "id_eleicao", referencedColumnName = "id")
    @ManyToOne
    private Eleicao idEleicao;

    private String substituto;

    private String motivos;

    @Column(name="codigo_situacao_candidato")
    private Integer codigoSituacaoCandidato;

    @Column(name="descricao_situacao_candidato")
    private String descricaoSituacaoCandidato;

    @Column(name="st_substituido")
    private Boolean stSubstituido;

    @Column(name="descricao_naturalidade")
    private String descricaoNaturalidade;

    @Column(name="st_motivo_ausencia_requisito")
    private Boolean stMotivoAusenciaRequisito;

    @Column(name="st_motivo_conduta_vedada")
    private Boolean stMotivoCondutaVedada;

    @Column(name="cnpj_campanha")
    private String cnpjCampanha;

    @Column(name="gasto_campanha")
    private Float gastoCampanha;

    @Column(name="st_motivo_abuso_poder")
    private Boolean stMotivoAbusoPoder;

    @Column(name="st_motivo_compra_voto")
    private Boolean stMotivoCompraVoto;

    @Column(name="ds_motivo_outros")
    private String dsMotivoOutros;

    @Column(name="st_motivo_gasto_ilicito")
    private Boolean stMotivoGastoIlicito;

    @Column(name="st_motivo_ind_partido")
    private Boolean stMotivoIndPartido;

    @Column(name="st_motivo_ficha_limpa")
    private Boolean stMotivoFichaLimpa;

    @Column(name="st_divulga_arquivos")
    private Boolean stDivulgaArquivos;

    @Column(name="st_divulga_bens")
    private Boolean stDivulgaBens;

    @Column(name="st_divulga")
    private Boolean stDivulga;

    @Column(name="st_releicao")
    private Boolean stReleicao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Candidato getIdCandidatoSuperior() {
        return idCandidatoSuperior;
    }

    public void setIdCandidatoSuperior(Candidato idCandidatoSuperior) {
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

    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    public Float getTotalDeBens() {
        return totalDeBens;
    }

    public void setTotalDeBens(Float totalDeBens) {
        this.totalDeBens = totalDeBens;
    }

    public Candidato getVice() {
        return vice;
    }

    public void setVice(Candidato vice) {
        this.vice = vice;
    }

    public Partido getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(Partido idPartido) {
        this.idPartido = idPartido;
    }

    public Eleicao getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(Eleicao idEleicao) {
        this.idEleicao = idEleicao;
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

    public Boolean getStSubstituido() {
        return stSubstituido;
    }

    public void setStSubstituido(Boolean stSubstituido) {
        this.stSubstituido = stSubstituido;
    }

    public String getDescricaoNaturalidade() {
        return descricaoNaturalidade;
    }

    public void setDescricaoNaturalidade(String descricaoNaturalidade) {
        this.descricaoNaturalidade = descricaoNaturalidade;
    }

    public Boolean getStMotivoAusenciaRequisito() {
        return stMotivoAusenciaRequisito;
    }

    public void setStMotivoAusenciaRequisito(Boolean stMotivoAusenciaRequisito) {
        this.stMotivoAusenciaRequisito = stMotivoAusenciaRequisito;
    }

    public Boolean getStMotivoCondutaVedada() {
        return stMotivoCondutaVedada;
    }

    public void setStMotivoCondutaVedada(Boolean stMotivoCondutaVedada) {
        this.stMotivoCondutaVedada = stMotivoCondutaVedada;
    }

    public String getCnpjCampanha() {
        return cnpjCampanha;
    }

    public void setCnpjCampanha(String cnpjCampanha) {
        this.cnpjCampanha = cnpjCampanha;
    }

    public Float getGastoCampanha() {
        return gastoCampanha;
    }

    public void setGastoCampanha(Float gastoCampanha) {
        this.gastoCampanha = gastoCampanha;
    }

    public Boolean getStMotivoAbusoPoder() {
        return stMotivoAbusoPoder;
    }

    public void setStMotivoAbusoPoder(Boolean stMotivoAbusoPoder) {
        this.stMotivoAbusoPoder = stMotivoAbusoPoder;
    }

    public Boolean getStMotivoCompraVoto() {
        return stMotivoCompraVoto;
    }

    public void setStMotivoCompraVoto(Boolean stMotivoCompraVoto) {
        this.stMotivoCompraVoto = stMotivoCompraVoto;
    }

    public String getDsMotivoOutros() {
        return dsMotivoOutros;
    }

    public void setDsMotivoOutros(String dsMotivoOutros) {
        this.dsMotivoOutros = dsMotivoOutros;
    }

    public Boolean getStMotivoGastoIlicito() {
        return stMotivoGastoIlicito;
    }

    public void setStMotivoGastoIlicito(Boolean stMotivoGastoIlicito) {
        this.stMotivoGastoIlicito = stMotivoGastoIlicito;
    }

    public Boolean getStMotivoIndPartido() {
        return stMotivoIndPartido;
    }

    public void setStMotivoIndPartido(Boolean stMotivoIndPartido) {
        this.stMotivoIndPartido = stMotivoIndPartido;
    }

    public Boolean getStMotivoFichaLimpa() {
        return stMotivoFichaLimpa;
    }

    public void setStMotivoFichaLimpa(Boolean stMotivoFichaLimpa) {
        this.stMotivoFichaLimpa = stMotivoFichaLimpa;
    }

    public Boolean getStDivulgaArquivos() {
        return stDivulgaArquivos;
    }

    public void setStDivulgaArquivos(Boolean stDivulgaArquivos) {
        this.stDivulgaArquivos = stDivulgaArquivos;
    }

    public Boolean getStDivulgaBens() {
        return stDivulgaBens;
    }

    public void setStDivulgaBens(Boolean stDivulgaBens) {
        this.stDivulgaBens = stDivulgaBens;
    }

    public Boolean getStReleicao() {
        return stReleicao;
    }

    public void setStReleicao(Boolean stReleicao) {
        this.stReleicao = stReleicao;
    }

    public Boolean getStDivulga() {
        return stDivulga;
    }

    public void setStDivulga(Boolean stDivulga) {
        this.stDivulga = stDivulga;
    }
}
