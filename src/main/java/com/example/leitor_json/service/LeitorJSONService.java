package com.example.leitor_json.service;

import com.example.leitor_json.dto.CandidatoDTO;
import com.example.leitor_json.model.Eleicao;
import com.example.leitor_json.repository.EleicaoRepository;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class LeitorJSONService {

    @Autowired
    EleicaoRepository eleicaoRepository;

    public void lerDadosDoArquivoJSON() {
        try {
            List<CandidatoDTO> listaCandidatos = new ArrayList<>();
            File diretorio = new File("./src/main/resources/static");
            if (diretorio.isDirectory()) {
                File arquivos[] = diretorio.listFiles();
                for (File arquivo : arquivos) {
                    CandidatoDTO candidatoDTO = null;
                    Gson gson = new Gson();
                    JsonReader reader = new JsonReader(new FileReader(arquivo));
                    candidatoDTO = gson.fromJson(reader, CandidatoDTO.class);
                    listaCandidatos.add(candidatoDTO);
                }
            }
            this.popularBanco(listaCandidatos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void popularBanco(List<CandidatoDTO> listaCandidatos) {
        Eleicao eleicao = new Eleicao();
        eleicao.setAno(listaCandidatos.get(0).getEleicao().getAno());
        eleicao.setId(listaCandidatos.get(0).getEleicao().getId());
        eleicaoRepository.save(eleicao);

    }
}
