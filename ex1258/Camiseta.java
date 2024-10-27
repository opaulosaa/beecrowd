package com.paulosa.ex1258;

public class Camiseta {
    private String nomeEstudante;
    private String corLogo;
    private String tamanho;

    public Camiseta(String nomeEstudante, String corLogo, String tamanho) {
        this.nomeEstudante = nomeEstudante;
        this.corLogo = corLogo;
        this.tamanho = tamanho;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getCorLogo() {
        return corLogo;
    }

    public void setCorLogo(String corLogo) {
        this.corLogo = corLogo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
