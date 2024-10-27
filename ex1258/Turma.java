package com.paulosa.ex1258;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Turma {
    private List<Camiseta> camisetas = new ArrayList<>();

    public void adicionarCamiseta(Camiseta camiseta){
        camisetas.add(camiseta);
    }
    public void ordenarEImprimir(){
        Collections.sort(camisetas, new Comparator<Camiseta>() {
            @Override
            public int compare(Camiseta c1, Camiseta c2) {
                int corComparison = c1.getCorLogo().compareTo(c2.getCorLogo());
                if (corComparison != 0){
                    return corComparison;
                }
                int tamanhoComparison = c1.getTamanho().compareTo(c2.getTamanho());
                if (tamanhoComparison != 0){
                    return tamanhoComparison;
                }
                return c1.getNomeEstudante().compareTo(c2.getNomeEstudante());
            }
        });
        for (Camiseta camiseta : camisetas){
            System.out.printf("%s\n%s %s\n", camiseta.getNomeEstudante(), camiseta.getCorLogo(), camiseta.getTamanho());
        }
    }
}
