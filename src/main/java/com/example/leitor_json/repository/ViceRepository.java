package com.example.leitor_json.repository;

import com.example.leitor_json.model.Vice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViceRepository extends JpaRepository<Vice, Long> {
}
