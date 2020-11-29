package com.example.leitor_json.service;

import com.example.leitor_json.dto.CandidatoDTO;
import com.example.leitor_json.model.Candidato;
import com.example.leitor_json.model.EmailCandidato;
import com.example.leitor_json.model.SiteCandidato;
import com.example.leitor_json.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public void salvarDadosCandidatos(List<CandidatoDTO> listaCandidatos) {
        try {
            for (CandidatoDTO candidatoDTO: listaCandidatos) {
                Candidato candidato = popularCandidato(candidatoDTO);
                candidato = candidatoRepository.save(candidato); // salvando candidato e pegando a referencia
                popularESalvarEmails(candidatoDTO, candidato); // salvando emails
                popularESalvarSites(candidatoDTO, candidato); //salvando sites
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
        candidato.setDescricaoSexo(candidato.getDescricaoSexo());
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
        candidato.setSubstituto(candidatoDTO.getSubstituto());
        candidato.setMotivos(candidatoDTO.getMotivos());
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



}
