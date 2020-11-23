package com.example.leitor_json;

import com.example.leitor_json.service.LeitorJSONService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PopularBancoInicio implements CommandLineRunner {

    @Autowired
    LeitorJSONService leitorJSONService;
//
//    public PopularBancoInicio() {
//        super();
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    public void run(String...args) throws Exception {
        leitorJSONService.lerDadosDoArquivoJSON();
    }
}
