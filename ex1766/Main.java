package com.paulosa.ex1766;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();

        for (int t = 1; t <= T; t++){
            int N = input.nextInt();
            int M = input.nextInt();
            input.nextLine();

            List<Rena> renas = new ArrayList<>();

            for (int i = 0; i < N; i++){
                String nome = input.next();
                int peso = input.nextInt();
                int idade = input.nextInt();
                double altura = input.nextDouble();
                input.nextLine();

                renas.add(new Rena(nome, peso, idade, altura));
            }
            Collections.sort(renas, new Comparator<Rena>() {
                @Override
                public int compare(Rena r1, Rena r2) {
                    if (r1.getPeso() != r2.getPeso()){
                        return Integer.compare(r2.getPeso(), r1.getPeso());
                    }
                    if (r1.getIdade() != r2.getIdade()){
                        return Integer.compare(r1.getIdade(), r2.getIdade());
                    }
                    if (r1.getAltura() != r2.getAltura()){
                        return Double.compare(r1.getAltura(), r2.getAltura());
                    }
                    return r1.getNome().compareTo(r2.getNome());
                }
            });
            System.out.println("CENARIO " + t);
            for (int i = 0; i < M; i++) {
                System.out.println((i + 1) + " " + renas.get(i));
            }
        }

    }
}
