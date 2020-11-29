package com.example.leitor_json.service;

import com.example.leitor_json.dto.*;
import com.example.leitor_json.model.*;
import com.example.leitor_json.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoService {
    @Autowired
    private ArquivoRepository arquivoRepository;
    @Autowired
    private BemRepository bemRepository;
    @Autowired
    private CandidatoRepository candidatoRepository;
    @Autowired
    private CargoRepository cargoRepository;
    @Autowired
    private EleicaoAnteriorRepository eleicaoAnteriorRepository;
    @Autowired
    private EleicaoRepository eleicaoRepository;
    @Autowired
    private EmailCandidatoRepository emailCandidatoRepository;
    @Autowired
    private PartidoRepository partidoRepository;
    @Autowired
    private SiteCandidatoRepository siteCandidatoRepository;
    @Autowired
    private ViceRepository viceRepository;
    @Autowired
    private MotivoRepository motivoRepository;
    @Autowired
    private SubstitutoRepository substitutoRepository;

    public void salvarDadosCandidatos(CandidatoDTO candidatoDTO) {
        try {
            if (candidatoDTO != null) {
                Candidato candidato = popularCandidato(candidatoDTO);
                candidato = candidatoRepository.save(candidato); // salvando candidato e pegando a referencia
                popularESalvarEmails(candidatoDTO, candidato); // salvando emails
                popularESalvarSites(candidatoDTO, candidato); //salvando sites
                popularESalvarBens(candidatoDTO, candidato); // salvando bens
                popularESalvarArquivos(candidatoDTO, candidato); // salvando arquivos
                popularESalvarMotivos(candidatoDTO, candidato); //salvando motivos
                Cargo cargo = salvarCargoCandidato(candidatoDTO); //salvando cargo na tabela cargo, caso ainda nao exista e pegando a referencia
                Partido partido = salvarPartidoCandidato(candidatoDTO); // salvando partido na tabela partido, caso ainda nao exista e pegando a referencia
                Eleicao eleicao = salvarEleicao(candidatoDTO); // salvando eleicao na tabela eleicao, caso ainda nao existe e pegando a referencia
                Substituto substituto = salvarSubstituto(candidatoDTO); // salvando substituto na tabela, e pegando a referencia
                salvarEleicoesAnteriores(candidatoDTO, candidato); // salvando eleicoes anteriores, caso ainda nao exista
                salvarVices(candidatoDTO, candidato); // salvando vices
                candidato.setIdCargo(cargo);
                candidato.setIdPartido(partido);
                candidato.setIdEleicao(eleicao);
                candidato.setSubstituto(substituto);
                Optional<Candidato> candidatoSuperior = candidatoRepository.findById(String.valueOf(candidatoDTO.getIdCandidatoSuperior()));
                candidato.setIdCandidatoSuperior(candidatoSuperior != null && candidatoSuperior.isPresent() ? candidatoSuperior.get() : null);
                candidatoRepository.save(candidato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Candidato popularCandidato(CandidatoDTO candidatoDTO){
        Candidato candidato = new Candidato();
        candidato.setId(candidatoDTO.getId());
        candidato.setNomeUrna(candidatoDTO.getNomeUrna());
        candidato.setNumero(candidatoDTO.getNumero());
        candidato.setNomeCompleto(candidatoDTO.getNomeCompleto());
        candidato.setDescricaoSexo(candidatoDTO.getDescricaoSexo());
        candidato.setDataDeNascimento(candidatoDTO.getDataDeNascimento());
        candidato.setTituloEleitor(candidatoDTO.getTituloEleitor());
        candidato.setCpf(candidatoDTO.getCpf());
        candidato.setDescricaoEstadoCivil(candidatoDTO.getDescricaoEstadoCivil());
        candidato.setDescricaoCorRaca(candidatoDTO.getDescricaoCorRaca());
        candidato.setDescricaoSituacao(candidatoDTO.getDescricaoSituacao());
        candidato.setNacionalidade(candidatoDTO.getNacionalidade());
        candidato.setGrauInstrucao(candidatoDTO.getGrauInstrucao());
        candidato.setOcupacao(candidatoDTO.getOcupacao());
        candidato.setGastoCampanha1T(candidatoDTO.getGastoCampanha1T());
        candidato.setGastoCampanha2T(candidatoDTO.getGastoCampanha2T());
        candidato.setSgUfNascimento(candidatoDTO.getSgUfNascimento());
        candidato.setNomeMunicipioNascimento(candidatoDTO.getNomeMunicipioNascimento());
        candidato.setLocalCandidatura(candidatoDTO.getLocalCandidatura());
        candidato.setUfCandidatura(candidatoDTO.getUfCandidatura());
        candidato.setUfSuperiorCandidatura(candidatoDTO.getUfSuperiorCandidatura());
        candidato.setDataUltimaAtualizacao(candidatoDTO.getDataUltimaAtualizacao());
        candidato.setFotoUrl(candidatoDTO.getFotoUrl());
        candidato.setFotoDataUltimaAtualizacao(candidatoDTO.getFotoDataUltimaAtualizacao());
        candidato.setDescricaoTotalizacao(candidatoDTO.getDescricaoTotalizacao());
        candidato.setNomeColigacao(candidatoDTO.getNomeColigacao());
        candidato.setComposicaoColigacao(candidatoDTO.getComposicaoColigacao());
        candidato.setNumeroProcessoDrap(candidatoDTO.getNumeroProcessoDrap());
        candidato.setNumeroProcessoDrapEncrypt(candidatoDTO.getNumeroProcessoDrapEncrypt());
        candidato.setNumeroProcesso(candidatoDTO.getNumeroProcesso());
        candidato.setNumeroProcessoEncrypt(candidatoDTO.getNumeroProcessoEncrypt());
        candidato.setNumeroProcessoPrestContas(candidatoDTO.getNumeroProcessoPrestContas());
        candidato.setNumeroProcessoPrestContasEncrypt(candidatoDTO.getNumeroProcessoPrestContasEncrypt());
        candidato.setNumeroProtocolo(candidatoDTO.getNumeroProtocolo());
        candidato.setTotalDeBens(candidatoDTO.getTotalDeBens());
        candidato.setCodigoSituacaoCandidato(candidatoDTO.getCodigoSituacaoCandidato());
        candidato.setDescricaoSituacaoCandidato(candidatoDTO.getDescricaoSituacaoCandidato());
        candidato.setStSubstituido(candidatoDTO.getSt_SUBSTITUIDO());
        candidato.setDescricaoNaturalidade(candidatoDTO.getDescricaoNaturalidade());
        candidato.setStMotivoAusenciaRequisito(candidatoDTO.getSt_MOTIVO_AUSENCIA_REQUISITO());
        candidato.setStMotivoCondutaVedada(candidatoDTO.getSt_MOTIVO_CONDUTA_VEDADA());
        candidato.setCnpjCampanha(candidatoDTO.getCnpjcampanha());
        candidato.setGastoCampanha(candidatoDTO.getGastoCampanha());
        candidato.setStMotivoAbusoPoder(candidatoDTO.getSt_MOTIVO_ABUSO_PODER());
        candidato.setStMotivoCompraVoto(candidatoDTO.getSt_MOTIVO_COMPRA_VOTO());
        candidato.setDsMotivoOutros(candidatoDTO.getDs_MOTIVO_OUTROS());
        candidato.setStMotivoGastoIlicito(candidatoDTO.getSt_MOTIVO_GASTO_ILICITO());
        candidato.setStMotivoIndPartido(candidatoDTO.getSt_MOTIVO_IND_PARTIDO());
        candidato.setStMotivoFichaLimpa(candidatoDTO.getSt_MOTIVO_FICHA_LIMPA());
        candidato.setStDivulgaArquivos(candidatoDTO.getSt_DIVULGA_ARQUIVOS());
        candidato.setStDivulgaBens(candidatoDTO.getSt_DIVULGA_BENS());
        candidato.setStDivulga(candidatoDTO.getSt_DIVULGA());
        candidato.setStReleicao(candidatoDTO.getSt_REELEICAO());

        return candidato;
    }

    private void popularESalvarEmails(CandidatoDTO candidatoDTO, Candidato candidato){
        try {
            List<String> listaEmails = candidatoDTO.getEmails();
            if(listaEmails != null && (!listaEmails.isEmpty())){
                for (String email: listaEmails){
                    EmailCandidato emailCandidato = new EmailCandidato();
                    emailCandidato.setEmail(email);
                    emailCandidato.setIdCandidato(candidato);
                    emailCandidatoRepository.save(emailCandidato);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void popularESalvarSites(CandidatoDTO candidatoDTO, Candidato candidato){
        try {
            List<String> listaSites = candidatoDTO.getSites();
            if(listaSites != null && (!listaSites.isEmpty())){
                for (String site: listaSites){
                    SiteCandidato siteCandidato = new SiteCandidato();
                    siteCandidato.setIdCandidato(candidato);
                    siteCandidato.setSite(site);
                    siteCandidatoRepository.save(siteCandidato);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void popularESalvarBens(CandidatoDTO candidatoDTO, Candidato candidato) {
        try {
            List<BemDTO> listaBens = candidatoDTO.getBens();
            if(listaBens != null && (!listaBens.isEmpty())){
                for (BemDTO bemDTO: listaBens) {
                    Bem bem = new Bem();
                    bem.setValor(bemDTO.getValor());
                    bem.setOrdem(bemDTO.getOrdem());
                    bem.setDescricaoDeTipoDeBem(bemDTO.getDescricaoDeTipoDeBem());
                    bem.setDescricao(bemDTO.getDescricao());
                    bem.setDataUltimaAtualizacao(bemDTO.getDataUltimaAtualizacao());
                    bem.setIdCandidato(candidato);
                    bemRepository.save(bem);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void popularESalvarArquivos(CandidatoDTO candidatoDTO, Candidato candidato){
        try {
            List<ArquivoDTO> listaArquivos = candidatoDTO.getArquivos();
            if(listaArquivos != null && (!listaArquivos.isEmpty())) {
                for (ArquivoDTO arquivoDTO: listaArquivos) {
                    Arquivo arquivo = new Arquivo();
                    arquivo.setId(String.valueOf(arquivoDTO.getIdArquivo()));
                    arquivo.setNome(arquivoDTO.getNome());
                    arquivo.setUrl(arquivoDTO.getUrl());
                    arquivo.setCodTipo(arquivoDTO.getCodTipo());
                    arquivo.setFullFilePath(arquivoDTO.getFullFilePath());
                    arquivo.setFileByteArray(arquivoDTO.getFileByteArray());
                    arquivo.setFileInputStream(arquivoDTO.getFileInputStream());
                    arquivo.setIdCandidato(candidato);
                    arquivoRepository.save(arquivo);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Partido salvarPartidoCandidato(CandidatoDTO candidatoDTO){
        try {
            Partido partido = new Partido();
            partido.setNome(candidatoDTO.getPartido().getNome());
            partido.setSigla(candidatoDTO.getPartido().getSigla());
            partido.setNumero(candidatoDTO.getPartido().getNumero());
            return partidoRepository.save(partido);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Cargo salvarCargoCandidato(CandidatoDTO candidatoDTO){
        try {
            Cargo cargo = new Cargo();
            cargo.setCodigo(candidatoDTO.getCargo().getCodigo());
            cargo.setCodSuperior(candidatoDTO.getCargo().getCodSuperior());
            cargo.setContagem(candidatoDTO.getCargo().getContagem());
            cargo.setNome(candidatoDTO.getCargo().getNome());
            cargo.setSigla(candidatoDTO.getCargo().getSigla());
            cargo.setTitular(candidatoDTO.getCargo().getTitular());
            return cargoRepository.save(cargo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Eleicao salvarEleicao(CandidatoDTO candidatoDTO){
        try {
            Eleicao eleicao = new Eleicao();
            eleicao.setId(String.valueOf(candidatoDTO.getEleicao().getId()));
            eleicao.setSiglaUF(candidatoDTO.getEleicao().getSiglaUF());
            eleicao.setAno(candidatoDTO.getEleicao().getAno());
            eleicao.setCodigo(candidatoDTO.getEleicao().getCodigo());
            eleicao.setNomeEleicao(candidatoDTO.getEleicao().getNomeEleicao());
            eleicao.setTipoEleicao(candidatoDTO.getEleicao().getTipoEleicao());
            eleicao.setTurno(candidatoDTO.getEleicao().getTurno());
            eleicao.setTipoAbrangencia(candidatoDTO.getEleicao().getTipoAbrangencia());
            eleicao.setDataEleicao(candidatoDTO.getEleicao().getDataEleicao());
            eleicao.setCodSituacaoEleicao(candidatoDTO.getEleicao().getCodSituacaoEleicao());
            eleicao.setDescricaoSituacaoEleicao(candidatoDTO.getEleicao().getDescricaoSituacaoEleicao());
            eleicao.setDescricaoEleicao(candidatoDTO.getEleicao().getDescricaoEleicao());

            return eleicaoRepository.save(eleicao);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void salvarEleicoesAnteriores(CandidatoDTO candidatoDTO, Candidato candidato){
        try {
            List<EleicaoAnteriorDTO> listaEleicoesAnteriores = candidatoDTO.getEleicoesAnteriores();
            if (listaEleicoesAnteriores != null && (!listaEleicoesAnteriores.isEmpty())) {
                for (EleicaoAnteriorDTO eleicaoAnteriorDTO: listaEleicoesAnteriores) {
                    EleicaoAnterior eleicaoAnterior = new EleicaoAnterior();
                    eleicaoAnterior.setId(eleicaoAnteriorDTO.getId());
                    eleicaoAnterior.setNrAno(eleicaoAnteriorDTO.getNrAno());
                    eleicaoAnterior.setNomeUrna(eleicaoAnteriorDTO.getNomeUrna());
                    eleicaoAnterior.setNomeCandidato(eleicaoAnteriorDTO.getNomeCandidato());
                    eleicaoAnterior.setSgUe(eleicaoAnteriorDTO.getSgUe());
                    eleicaoAnterior.setLocal(eleicaoAnteriorDTO.getLocal());
                    eleicaoAnterior.setCargo(eleicaoAnteriorDTO.getCargo());
                    eleicaoAnterior.setPartido(eleicaoAnteriorDTO.getPartido());
                    eleicaoAnterior.setSituacaoTotalizacao(eleicaoAnteriorDTO.getSituacaoTotalizacao());
                    eleicaoAnterior.setTxLink(eleicaoAnteriorDTO.getTxLink());
                    eleicaoAnterior.setIdCandidato(candidato);
                    Optional <Eleicao> eleicao = eleicaoRepository.findById(eleicaoAnteriorDTO.getIdEleicao());

                    eleicaoAnterior.setIdEleicao(eleicao != null && eleicao.isPresent() ? eleicao.get() : null);
                    eleicaoAnteriorRepository.save(eleicaoAnterior);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarVices(CandidatoDTO candidatoDTO, Candidato candidato){
        try{
            List<ViceDTO> listaVices = candidatoDTO.getVices();
            if (listaVices != null && (!listaVices.isEmpty())){
                for (ViceDTO viceDTO: listaVices){
                    Vice vice = new Vice();
                    vice.setNomeColigacao(viceDTO.getNomeColigacao());
                    vice.setComposicaoColigacao(viceDTO.getComposicaoColigacao());
                    vice.setStRegistro(viceDTO.getStRegistro());
                    vice.setSituacaoCandidato(viceDTO.getSituacaoCandidato());
                    vice.setUrlFoto(viceDTO.getUrlFoto());
                    vice.setSgPartido(viceDTO.getSg_PARTIDO());
                    vice.setNmUrna(viceDTO.getNm_URNA());
                    vice.setNmCandidato(viceDTO.getNm_CANDIDATO());
                    Optional <Candidato> candidatoSuperior= candidatoRepository.findById(String.valueOf(viceDTO.getSq_CANDIDATO_SUPERIOR()));
                    vice.setSqCandidatoSuperior((candidatoSuperior != null && candidatoSuperior.isPresent() ? candidatoSuperior.get() : null));
                    vice.setNrCandidato(viceDTO.getNr_CANDIDATO());
                    vice.setDsCargo(viceDTO.getDs_CARGO());
                    vice.setNmPartido(viceDTO.getNm_PARTIDO());
                    vice.setSqCandidato(viceDTO.getSq_CANDIDATO());
                    vice.setSgUE(viceDTO.getSg_UE());
                    vice.setDataUltimaAtualizacao(viceDTO.getDt_ULTIMA_ATUALIZACAO());
                    Optional <Eleicao> sqEleicao = eleicaoRepository.findById(String.valueOf(viceDTO.getSq_ELEICAO()));
                    vice.setSqEleicao(sqEleicao != null && sqEleicao.isPresent() ? sqEleicao.get() : null);
                    vice.setIdCandidatoPrincipal(candidato);
                    viceRepository.save(vice);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void popularESalvarMotivos(CandidatoDTO candidatoDTO, Candidato candidato){
        try {
            List<String> listMotivos = candidatoDTO.getMotivos();
            if(listMotivos != null && (!listMotivos.isEmpty())){
                for (String motivoString: listMotivos){
                    Motivo motivo = new Motivo();
                    motivo.setIdCandidato(candidato);
                    motivo.setMotivo(motivoString);
                    motivoRepository.save(motivo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Substituto salvarSubstituto(CandidatoDTO candidatoDTO){
        try {
            if(candidatoDTO.getSubstituto() != null) {
                Substituto substituto = new Substituto();

                Optional<Candidato> candidato = candidatoRepository.findById(candidatoDTO.getSubstituto().getSqCandidato());
                substituto.setIdCandidato((candidato != null && candidato.isPresent())? candidato.get() : null);

                Optional<Eleicao> eleicao = eleicaoRepository.findById(candidatoDTO.getSubstituto().getSqEleicao());
                 substituto.setIdEleicao((eleicao != null && eleicao.isPresent()) ? eleicao.get() : null);

                substituto.setNmCandidato(candidatoDTO.getSubstituto().getNmCandidato());
                substituto.setNrAno(candidatoDTO.getSubstituto().getNrAno());
                substituto.setSgUe(candidatoDTO.getSubstituto().getSgUe());
                substituto.setUrl(candidatoDTO.getSubstituto().getUrl());
                return substitutoRepository.save(substituto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
