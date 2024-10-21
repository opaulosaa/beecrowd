package com.paulosa.ex2311;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++){
            String nome = input.nextLine();
            double grauDificuldade = input.nextDouble();
            Competidor competidor = new Competidor(input.nextLine(), input.nextDouble());
            competidor.adicionarNota(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());

            System.out.print(competidor.getNome());
            System.out.printf("%2.f\n", competidor.calcularResultado());
        }
    }
}
