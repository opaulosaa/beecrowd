package com.paulosa.ex2311;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Competidor {
    private String nome;
    private double grauDificuldade;
    private List<Double> notas = new ArrayList<>();


    public Competidor(String nome, double grauDificuldade) {
        this.nome = nome;
        this.grauDificuldade = grauDificuldade;
    }

    public Competidor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGrauDificuldade() {
        return grauDificuldade;
    }

    public void setGrauDificuldade(double grauDificuldade) {
        this.grauDificuldade = grauDificuldade;
    }

    public void adicionarNota(double nota1, double nota2, double nota3, double nota4, double nota5, double nota6, double nota7){
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);
        notas.add(nota6);
        notas.add(nota7);
    }

    public double calcularResultado(){
        double soma = 0;
        for (int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        soma -= Collections.max(notas) + Collections.min(notas);
        return soma *= grauDificuldade;
    }

}
