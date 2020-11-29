package com.example.leitor_json.dto;

public class SubstitutoDTO {

    private String sqEleicao;
    private String sqCandidato;
    private String sgUe;
    private Integer nrAno;
    private String nmCandidato;
    private String url;

    public String getSqEleicao() {
        return sqEleicao;
    }

    public void setSqEleicao(String sqEleicao) {
        this.sqEleicao = sqEleicao;
    }

    public String getSqCandidato() {
        return sqCandidato;
    }

    public void setSqCandidato(String sqCandidato) {
        this.sqCandidato = sqCandidato;
    }

    public String getSgUe() {
        return sgUe;
    }

    public void setSgUe(String sgUe) {
        this.sgUe = sgUe;
    }

    public Integer getNrAno() {
        return nrAno;
    }

    public void setNrAno(Integer nrAno) {
        this.nrAno = nrAno;
    }

    public String getNmCandidato() {
        return nmCandidato;
    }

    public void setNmCandidato(String nmCandidato) {
        this.nmCandidato = nmCandidato;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
