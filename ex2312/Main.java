package com.paulosa.ex2312;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        List<Quadro> medalhas = new ArrayList<>();
        for (int i = 0; i < N; i++){
            String country = input.next();
            int gold = input.nextInt();
            int silver = input.nextInt();
            int bronze = input.nextInt();
            input.nextLine();

            medalhas.add(new Quadro(country, gold, silver, bronze));
        }

        Collections.sort(medalhas, new Comparator<Quadro>() {
            @Override
            public int compare(Quadro m1, Quadro m2) {
                if (m1.getGold() != m2.getGold()) {
                    return Integer.compare(m2.getGold(), m1.getGold());
                }
                if (m1.getSilver() != m2.getSilver()) {
                    return Integer.compare(m2.getSilver(), m1.getSilver());
                }
                if (m1.getBronze() != m2.getBronze()) {
                    return Integer.compare(m2.getBronze(), m1.getBronze());
                }
                return m1.getCountry().compareTo(m2.getCountry());
            }
        });
        for (Quadro medalha : medalhas){
            System.out.println(medalha);
        }
    }
}
