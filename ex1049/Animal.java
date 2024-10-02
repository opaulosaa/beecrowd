package com.paulosa.ex1049;

public class Animal implements Animais{

    protected String tipoDeEsqueleto;
    protected String tipoDeAnimal;
    protected String tipoDeAlimentacao;

    public Animal(String tipoDeEsqueleto, String tipoDeAnimal, String tipoDeAlimentacao) {
        this.tipoDeEsqueleto = tipoDeEsqueleto;
        this.tipoDeAnimal = tipoDeAnimal;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public String getTipoDeEsqueleto() {
        return tipoDeEsqueleto;
    }

    public void setTipoDeEsqueleto(String tipoDeEsqueleto) {
        this.tipoDeEsqueleto = tipoDeEsqueleto;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    @Override
    public void definirAnimal() {
        if (getTipoDeEsqueleto().equals("vertebrado")){
            if (getTipoDeAnimal().equals("ave")){
                if (getTipoDeAlimentacao().equals("carnivoro")){
                    System.out.println("aguia");
                } else if (getTipoDeAlimentacao().equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (getTipoDeAnimal().equals("mamifero")) {
                if (getTipoDeAlimentacao().equals("onivoro")){
                    System.out.println("homem");
                } else if (getTipoDeAlimentacao().equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (getTipoDeEsqueleto().equals("invertebrado")) {
            if (getTipoDeAnimal().equals("inseto")){
                if (getTipoDeAlimentacao().equals("hematofago")){
                    System.out.println("pulga");
                } else if (getTipoDeAlimentacao().equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (getTipoDeAnimal().equals("anelideo")) {
                if (getTipoDeAlimentacao().equals("hematofago")){
                    System.out.println("sanguessuga");
                } else if (getTipoDeAlimentacao().equals("onivoro")) {
                    System.out.println("minhoca");
                }
            } 
        }
    }
    }

