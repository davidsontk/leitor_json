package com.example.leitor_json.service;

import com.example.leitor_json.dto.CandidatoDTO;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;

@Service
public class LeitorJSONService {

    @Autowired
    BancoService bancoService;

    public void lerDadosDoArquivoJSON() {
        try {
            File diretorio = new File("./src/main/resources/static");
            if (diretorio.isDirectory()) {
                File[] arquivos = diretorio.listFiles();
                if(arquivos != null) {
                    for (File arquivo : arquivos) {
                        CandidatoDTO candidatoDTO;
                        Gson gson = new Gson();
                        JsonReader reader = new JsonReader(new FileReader(arquivo));
                        System.out.println("COLOCANDO ARQUIVO COM O NOME = " + arquivo.getName());
                        candidatoDTO = gson.fromJson(reader, CandidatoDTO.class);
                        this.popularBanco(candidatoDTO);
                    }
                    System.out.println("Todos os inserts foram concluídos");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void popularBanco(CandidatoDTO candidatoDTO) {
        bancoService.salvarDadosCandidatos(candidatoDTO);
    }
}
