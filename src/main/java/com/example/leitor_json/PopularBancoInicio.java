package com.example.leitor_json;

import com.example.leitor_json.service.LeitorJSONService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PopularBancoInicio implements CommandLineRunner {

    @Autowired
    LeitorJSONService leitorJSONService;

    @Override
    public void run(String...args) throws Exception {
        leitorJSONService.lerDadosDoArquivoJSON();
    }
}
