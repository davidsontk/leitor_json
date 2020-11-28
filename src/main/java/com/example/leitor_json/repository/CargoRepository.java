package com.example.leitor_json.repository;

import com.example.leitor_json.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository  extends JpaRepository<Cargo, Long> {

}
