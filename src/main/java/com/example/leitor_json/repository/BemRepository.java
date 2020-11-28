package com.example.leitor_json.repository;

import com.example.leitor_json.model.Bem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BemRepository extends JpaRepository<Bem, Long> {
}
