package com.example.leitor_json.service;

import com.example.leitor_json.dto.CandidatoDTO;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class LeitorJSONService {

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
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
