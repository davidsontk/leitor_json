package com.example.leitor_json.repository;

import com.example.leitor_json.model.Eleicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleicaoRepository extends JpaRepository <Eleicao, String> {

}
