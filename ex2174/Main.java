package com.paulosa.ex2174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ColecaoPomekon colecao = new ColecaoPomekon();
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++){
            String nome = input.nextLine();
            Pomekon pomekon = new Pomekon(nome);
            colecao.adicionarPomekon(pomekon);
        }
        int faltando = colecao.faltando();
        System.out.printf("Falta(m) %d pomekon(s).%n", faltando);
    }
}
