package com.example.leitor_json.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "arquivo")
public class Arquivo implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String nome;

    private String url;

    private String tipo;

    @Column(name="cod_tipo")
    private String codTipo;

    @Column(name="full_file_path")
    private String fullFilePath;

    @Column(name="file_input_stream")
    private String fileInputStream;

    @Column(name="file_byte_array")
    private String fileByteArray;

    @JoinColumn(name = "id_candidato", referencedColumnName = "id")
    @ManyToOne
    private Candidato idCandidato;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
    }

    public String getFullFilePath() {
        return fullFilePath;
    }

    public void setFullFilePath(String fullFilePath) {
        this.fullFilePath = fullFilePath;
    }

    public String getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(String fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String getFileByteArray() {
        return fileByteArray;
    }

    public void setFileByteArray(String fileByteArray) {
        this.fileByteArray = fileByteArray;
    }

    public Candidato getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Candidato idCandidato) {
        this.idCandidato = idCandidato;
    }
}
