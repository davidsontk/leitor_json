package com.example.leitor_json.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cargo")
public class Cargo implements Serializable {
    @Id
    @Column(name = "id")
    private Integer codigo;
}
