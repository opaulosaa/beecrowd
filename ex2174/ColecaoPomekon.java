package com.paulosa.ex2174;

import java.util.HashSet;
import java.util.Set;

public class ColecaoPomekon {
    private Set<String> capturados = new HashSet<>();
    private static final int totalPomekons = 151;

    public void adicionarPomekon(Pomekon pomekon){
        capturados.add(pomekon.getNome());
    }
    public int faltando(){
        return totalPomekons - capturados.size();
    }
}
