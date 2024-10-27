package com.paulosa.ex1258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean caso1 = true;

        while (true){
            int N = input.nextInt();
            if (N == 0) break;
            input.nextLine();

            if (!caso1){
                System.out.println();
            }
            caso1 = false;

            Turma turma = new Turma();

            for (int i = 0; i < N; i++){
                String nomeEstudante = input.nextLine();
                String corEValor = input.nextLine();
                String [] partes = corEValor.split(" ");
                String corLogo = partes[0];
                String tamanho = partes[1];

                Camiseta camiseta = new Camiseta(nomeEstudante, corLogo, tamanho);
                turma.adicionarCamiseta(camiseta);
            }
            turma.ordenarEImprimir();
        }
    }
}
