package com.paulosa.ex2167;

import java.util.ArrayList;
import java.util.List;

public class Motor {
    private List<Integer> medidas = new ArrayList<>();

    public void adicionarMedida(int rpm){
        medidas.add(rpm);
    }
    public int encontrarPrimeiraQueda(){
        for (int i = 1; i < medidas.size(); i++){
            if (medidas.get(i) < medidas.get(i - 1)){
                return i + 1;
            }
        }
        return 0;
    }
}
