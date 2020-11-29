package com.example.leitor_json.repository;

import com.example.leitor_json.model.Substituto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubstitutoRepository extends JpaRepository<Substituto, Long> {
}
