package com.paulosa.ex1961;

import java.util.ArrayList;
import java.util.List;

public class Sapo {
    private int alturaPulo;
    private List<Integer> alturaCanos = new ArrayList<>();

    public Sapo(int alturaPulo, List<Integer> alturaCanos) {
        this.alturaPulo = alturaPulo;
        this.alturaCanos = alturaCanos;
    }

    public int getAlturaPulo() {
        return alturaPulo;
    }

    public void setAlturaPulo(int alturaPulo) {
        this.alturaPulo = alturaPulo;
    }

    public List<Integer> getAlturaCanos() {
        return alturaCanos;
    }

    public void setAlturaCanos(List<Integer> alturaCanos) {
        this.alturaCanos = alturaCanos;
    }
    public String determinarResultado(){
        for (int i = 0; i < alturaCanos.size() - 1; i++){
            int alturaAtual = alturaCanos.get(i);
            int alturaProximo = alturaCanos.get(i + 1);
            int diferenca = alturaAtual - alturaProximo;

            if (diferenca > alturaPulo){
                return "GAME OVER";
            }
        }
        return "YOU WIN";
    }
}
