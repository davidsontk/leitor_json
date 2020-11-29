package com.example.leitor_json.service;

import com.example.leitor_json.dto.BemDTO;
import com.example.leitor_json.dto.CandidatoDTO;
import com.example.leitor_json.model.Bem;
import com.example.leitor_json.model.Eleicao;
import com.example.leitor_json.repository.BemRepository;
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

    @Autowired
    BemRepository bemRepository;

    @Autowired
    BancoService bancoService;

    public void lerDadosDoArquivoJSON() {
        try {
            File diretorio = new File("./src/main/resources/static");
            if (diretorio.isDirectory()) {
                File arquivos[] = diretorio.listFiles();
                for (File arquivo : arquivos) {
                    CandidatoDTO candidatoDTO = null;
                    Gson gson = new Gson();
                    JsonReader reader = new JsonReader(new FileReader(arquivo));
                    System.out.println("COLOCANDO ARQUIVO COM O NOME = " + arquivo.getName());
                    candidatoDTO = gson.fromJson(reader, CandidatoDTO.class);
                    this.popularBanco(candidatoDTO);
                }
                System.out.println("Todos os inserts foram concluídos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void popularBanco(CandidatoDTO candidatoDTO) {
        bancoService.salvarDadosCandidatos(candidatoDTO);
    }
}
