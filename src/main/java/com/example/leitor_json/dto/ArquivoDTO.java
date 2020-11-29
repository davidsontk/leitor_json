package com.example.leitor_json.dto;

public class ArquivoDTO {
    private Double idArquivo;
    private String nome;
    private String url;
    private String tipo;
    private String codTipo;
    private String fullFilePath;
    private String fileInputStream;
    private String fileByteArray;

    public Double getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Double idArquivo) {
        this.idArquivo = idArquivo;
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
}
