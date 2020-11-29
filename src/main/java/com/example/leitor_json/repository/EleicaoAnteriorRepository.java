package com.example.leitor_json.repository;

import com.example.leitor_json.model.EleicaoAnterior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleicaoAnteriorRepository extends JpaRepository<EleicaoAnterior, String> {
}
