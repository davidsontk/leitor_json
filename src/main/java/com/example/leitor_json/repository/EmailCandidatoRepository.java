package com.example.leitor_json.repository;

import com.example.leitor_json.model.EmailCandidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailCandidatoRepository  extends JpaRepository<EmailCandidato, Long> {
}
