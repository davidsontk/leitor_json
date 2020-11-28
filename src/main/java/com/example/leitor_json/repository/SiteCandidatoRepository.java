package com.example.leitor_json.repository;

import com.example.leitor_json.model.SiteCandidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteCandidatoRepository extends JpaRepository<SiteCandidato, Long> {
}
